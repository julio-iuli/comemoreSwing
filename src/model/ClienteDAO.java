package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.swing.table.DefaultTableModel;

import view.Conexao;

public class ClienteDAO {
   private Conexao conexao;
   private PreparedStatement prepararSQL;
   private ResultSet resultado;

   public ClienteDAO() throws SQLException{
	   this.conexao = new Conexao();
	   
   }

	public void inserir (Cliente cliente) throws SQLException {
		String sql = "INSERT INTO cliente("
				+ "nome,resddd,restel,celddd,celtel,rg,rgemissor,cpf,cnpj,pfpj,email,datanasc,complemento,idlogradouro,recomendacaonome,recomendacaodatanasc) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		
	    prepararSQL.setString(1,cliente.getNome());
	    prepararSQL.setInt(2,cliente.getResddd());
	    prepararSQL.setInt(3,cliente.getRestel());
	    prepararSQL.setInt(4,cliente.getCelddd());
	    prepararSQL.setInt(5,cliente.getCeltel());
	    prepararSQL.setInt(6,cliente.getRg());
	    prepararSQL.setString(7,cliente.getRgemissor());
	    prepararSQL.setLong(8,cliente.getCpf());
	    prepararSQL.setLong(9,cliente.getCnpj());
	    prepararSQL.setBoolean(10,cliente.getPfpj());
	    prepararSQL.setString(11,cliente.getEmail());
	    prepararSQL.setDate(12, java.sql.Date.valueOf(cliente.getDatanasc()));
	    prepararSQL.setString(13,cliente.getComplemento());
	    prepararSQL.setInt(14,cliente.getLogradouro().getId());
	    prepararSQL.setString(15,cliente.getRecomendacaonome());
	    
	    if (cliente.getRecomendacaodatanasc() != null){
	    	prepararSQL.setDate(16, java.sql.Date.valueOf(cliente.getRecomendacaodatanasc()));
	    } else {
	    	prepararSQL.setDate(16, null);
	    }
	    
	    prepararSQL.execute ();
	}
	
	public DefaultTableModel listar() throws SQLException{
		
		DefaultTableModel tabela = new DefaultTableModel();
		
		String sql = "select id, nome, datanasc, resddd, restel, email from cliente";
	
		tabela.addColumn("Id");
		tabela.addColumn("Nome");
		tabela.addColumn("Data de Nascimento");
		tabela.addColumn("ddd");
		tabela.addColumn("Telefone");
		tabela.addColumn("Email");
		
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		
		resultado = prepararSQL.executeQuery();
		
		while(resultado.next()){
			
			String[] linha = {
								resultado.getString("id"),
								resultado.getString("nome"),
								resultado.getString("datanasc"),
								resultado.getString("resddd"),
								resultado.getString("restel"),
								resultado.getString("email")
																
								};
			
			tabela.addRow(linha);
						
		}
		
		prepararSQL.close();
		
		return tabela;
	}
	
	public void deletar(int idCliente) throws SQLException {
		String sql = "DELETE FROM cliente WHERE id = ?";
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		prepararSQL.setInt(1, idCliente);
		prepararSQL.execute();
		prepararSQL.close();
	}
	
	public Cliente selecionar(int idCliente) throws SQLException {
		Cliente cliente = new Cliente();
		
		String sql = "SELECT id, nome FROM cliente WHERE id = ?";
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		prepararSQL.setInt(1, idCliente);
		resultado = prepararSQL.executeQuery();
		cliente.setId(resultado.getInt(0));
		cliente.setNome(resultado.getString(1));
		//prepararSQL.close();
		return cliente;
	}

}


//nome,resddd,restel,celddd,celtel,rg,rgemissor,cpf,cnpj,pfpj,email,datanasc,complemento,idlogradouro,recomendacaonome,recomendacaodatanasc