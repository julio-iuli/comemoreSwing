package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			"INSERT INTO pedido(datapedido, dataentrega, obspedido, complemento, idlogradouro, idcliente, idfuncionario, idtema)"
			+ " values(?,?,?,?,?,?,?,?)";
		    prepararSQL = this.conexao.getConexao().prepareStatement(sql);
			prepararSQL.setDate(1, java.sql.Date.valueOf(pedido.getDataPedido()));
			prepararSQL.setTimestamp(2, pedido.getDataEntrega());
			prepararSQL.setString(3, pedido.getObsPedido());
			prepararSQL.setString(4, pedido.getComplemento());
			prepararSQL.setInt(5, pedido.getLogradouro().getId());
			prepararSQL.setInt(6, pedido.getCliente().getId());
			prepararSQL.setInt(7, pedido.getFuncionario().getId());
			prepararSQL.setInt(8, pedido.getTema().getId());
			
			prepararSQL.execute();
			prepararSQL.close();
	   }

}
