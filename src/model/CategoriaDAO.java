package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import view.Conexao;

public class CategoriaDAO {

	private Conexao conexao;
	private PreparedStatement prepararSQL;
	private ResultSet resultado;

	public CategoriaDAO() throws SQLException {

		this.conexao = new Conexao();
	}

	public void inserir(Categoria categoria) throws SQLException {

		String sql = "insert into categoria (nome) values (?)";

		prepararSQL = this.conexao.getConexao().prepareStatement(sql);

		//O ID est� no BD como Autoincrement -- por isso o usu�ro n�o tem que inserir o ID aqui
		prepararSQL.setString(1, categoria.getNome());
				
		prepararSQL.execute();

	}
	
	
	public void excluir(Categoria categoria) throws SQLException {

		//n�o est� pronto
		
		String sql = "delete from categoria where id=?";

		prepararSQL = this.conexao.getConexao().prepareStatement(sql);

		
		prepararSQL.setInt(1, categoria.getId());
				
		prepararSQL.execute();
		prepararSQL.close();

	}
	
	
public DefaultTableModel listar() throws SQLException{
		
		String sql = "select nome from categoria";
		DefaultTableModel tabela = new DefaultTableModel();
	
		tabela.addColumn("Nome");			//n�o tem rela��o com o banco ainda
		
				
			
		
		
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		
		resultado = prepararSQL.executeQuery();
		
		while(resultado.next()){
			
			String[] linha = {
								resultado.getString("nome")
																
								};
			tabela.addRow(linha);
						
		}
		
		prepararSQL.close();
				
		return tabela;
	}


	
	public void alterar() throws SQLException{
		// n�o est� pronto
		
		String sql = "update from categoria set nome=? where id=?";
		
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		
		
		prepararSQL.execute();
		prepararSQL.close();
		
		
		
	}

	
	
	
}