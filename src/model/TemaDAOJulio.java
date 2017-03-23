package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import view.Conexao;

public class TemaDAOJulio {

	private Conexao conexao;
	private PreparedStatement prepararSQL;
	private ResultSet resultado;

	public TemaDAOJulio() throws SQLException{
		this.conexao = new Conexao();
		   
	   }
	public DefaultTableModel listar() throws SQLException{
		
		DefaultTableModel tabela = new DefaultTableModel();
		
		String sql = "select id, nome, status, descricao, genero, datacompra, preco, idcategoria from tema";
	
		tabela.addColumn("Id");
		tabela.addColumn("Nome");
		tabela.addColumn("Status");
		tabela.addColumn("Descrição");
		tabela.addColumn("Gênero");
		tabela.addColumn("Data Compra");
		tabela.addColumn("Preço");
		tabela.addColumn("IdCategoria");
		
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		
		resultado = prepararSQL.executeQuery();
		
		while(resultado.next()){
			
			String[] linha = {
								resultado.getString("id"),
								resultado.getString("nome"),
								resultado.getString("status"),
								resultado.getString("descricao"),
								resultado.getString("genero"),
								resultado.getString("datacompra"),
								resultado.getString("preco"),
								resultado.getString("idcategoria")
																
								};
			
			tabela.addRow(linha);
						
		}
		
		prepararSQL.close();
		
		return tabela;
	}
	
	

}
