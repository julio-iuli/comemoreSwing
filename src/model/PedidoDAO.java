package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.table.DefaultTableModel;

import view.Conexao;

public class PedidoDAO {
	
	   private Conexao conexao;
	   private PreparedStatement prepararSQL;
	   private ResultSet resultado;
	   
	   public PedidoDAO() throws SQLException{
		   this.conexao = new Conexao();
	   }
	   
	   public void inserir(Pedido pedido) throws SQLException {
		   String sql = 
			"INSERT INTO pedido(datapedido, dataentrega, obspedido, complemento, idlogradouro, idcliente, idfuncionario, idtema, horaentrega)"
			+ " values(?,?,?,?,?,?,?,?,?)";
		    prepararSQL = this.conexao.getConexao().prepareStatement(sql);
			prepararSQL.setDate(1, java.sql.Date.valueOf(pedido.getDataPedido()));
			prepararSQL.setDate(2, java.sql.Date.valueOf(pedido.getDataEntrega()));
			prepararSQL.setString(3, pedido.getObsPedido());
			prepararSQL.setString(4, pedido.getComplemento());
			prepararSQL.setInt(5, pedido.getLogradouro().getId());
			prepararSQL.setInt(6, pedido.getCliente().getId());
			prepararSQL.setInt(7, pedido.getFuncionario().getId());
			prepararSQL.setInt(8, pedido.getTema().getId());
			prepararSQL.setTime(9, java.sql.Time.valueOf(pedido.getHoraEntrega()));
			
			prepararSQL.execute();
			prepararSQL.close();
	   }

	   	   
	   public DefaultTableModel listar(String busca) throws SQLException{
			
		   
		   if (busca == null) {busca = "";}
		   
			DefaultTableModel tabela = new DefaultTableModel();
			
			String sql = "select id, nomecliente, nometema, dataentrega, horaentrega, nomelogradouro, complemento from pedidoview " + busca;
			
		
			tabela.addColumn("Id");
			tabela.addColumn("Cliente");
			tabela.addColumn("Tema");
			tabela.addColumn("Entrega");
			tabela.addColumn("Hora");
			tabela.addColumn("Logradgouro");
			tabela.addColumn("Complemento");
			
			prepararSQL = this.conexao.getConexao().prepareStatement(sql);
			
			resultado = prepararSQL.executeQuery();
			
			while(resultado.next()){
				
				String[] linha = {
									resultado.getString("id"),
									resultado.getString("nomecliente"),
									resultado.getString("nometema"),
									resultado.getString("dataentrega"),
									resultado.getString("horaentrega"),
									resultado.getString("nomelogradouro"),
									resultado.getString("complemento")
																	
									};
				
				tabela.addRow(linha);
							
			}
			
			prepararSQL.close();
			
			return tabela;
		}
	   
	   public void deletar(int idPedido) throws SQLException {
			String sql = "DELETE FROM pedido WHERE id = ?";
			prepararSQL = this.conexao.getConexao().prepareStatement(sql);
			prepararSQL.setInt(1, idPedido);
			prepararSQL.execute();
			prepararSQL.close();
		}
	   
	   public void alterar(Pedido pedido) throws SQLException {
		   
		   String sql = "UPDATE pedido set "
		   		+ "dataentrega = ?, obspedido = ?, complemento = ?, idlogradouro = ?, "
		   		+ "idcliente = ?, idtema = ?, horaentrega = ? where id = ?";
		   
		   prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		   prepararSQL.setDate(1, Date.valueOf(pedido.getDataEntrega()));
		   prepararSQL.setString(2, pedido.getObsPedido());
		   prepararSQL.setString(3, pedido.getComplemento());
		   prepararSQL.setInt(4, pedido.getLogradouro().getId());
		   prepararSQL.setInt(5, pedido.getCliente().getId());
		   prepararSQL.setInt(6, pedido.getTema().getId());
		   prepararSQL.setTime(7, Time.valueOf(pedido.getHoraEntrega()));
		   prepararSQL.setInt(8, pedido.getId());
		   
		   resultado = prepararSQL.executeQuery();
		   resultado.next();
	   }
	   
	   //ACHO QUE NEM VOU USAR ISSO...
	   public Pedido selecionar(int id) throws SQLException {
		   Pedido pedido = new Pedido();
		   
		   String sql = "SELECT * FROM pedidoview WHERE id = ?";
			prepararSQL = this.conexao.getConexao().prepareStatement(sql);
			prepararSQL.setInt(1, id);
			resultado = prepararSQL.executeQuery();
			resultado.next();
			//JOptionPane.showMessageDialog(null, resultado.getString("nome"));
			pedido.setId(resultado.getInt("id"));
			pedido.setDataEntrega(LocalDate.parse(resultado.getDate("dataentrega").toString()));
			pedido.setComplemento(resultado.getString("complemento"));
			pedido.setHoraEntrega(LocalTime.parse(resultado.getTime("horaentrega").toString()));
			
			Cliente cliente = new Cliente();
			cliente.setId(resultado.getInt("idcliente"));
			cliente.setNome(resultado.getString("nomecliente"));
			pedido.setCliente(cliente);
			
			Logradouro logradouro = new Logradouro();
			logradouro.setId(resultado.getInt("idlogradouro"));
			logradouro.setNome(resultado.getString("nomelogradouro"));
			
			Tema tema = new Tema();
			tema.setId(resultado.getInt("idtema"));
			tema.setNome(resultado.getString("nometema"));
		   
		   return pedido;
	   }
}
