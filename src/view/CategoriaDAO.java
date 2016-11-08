package view;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Categoria;

public class CategoriaDAO {

	private Conexao conexao;
	private PreparedStatement prepararSQL;

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

	
//Por enquanto n�o vou fazer o UPDATE, pois estou na d�vida de como recuperar este ID	
	
	
}