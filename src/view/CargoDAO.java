package view;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cargo;

public class CargoDAO {

	private Conexao conexao;
	private PreparedStatement prepararSQL;

	public CargoDAO() throws SQLException {

		this.conexao = new Conexao();
	}

	public void inserir(Cargo cargo) throws SQLException {

		String sql = "insert into cargo (nome, salario) values (?,?)";

		prepararSQL = this.conexao.getConexao().prepareStatement(sql);

		//O ID est� no BD como Autoincrement -- por isso o usu�ro n�o tem que inserir o ID aqui
		prepararSQL.setString(1, cargo.getNome());
		prepararSQL.setDouble(2, cargo.getSalario());
		
		prepararSQL.execute();

	}

	
//Por enquanto n�o vou mexer aqui, pois estou na d�vida de como recuperar este ID	
	
	/*
	
	public void alterar(Cargo cargo) throws SQLException {

		String sql = "update comemore set nome=?,salario=?,altura=? where id=?";

		prepararSQL = this.conexao.getConexao().prepareStatement(sql);

		prepararSQL.setString(1, imc.getEmail());
		prepararSQL.setDouble(2, imc.getPeso());
		prepararSQL.setDouble(3, imc.getAltura());
		prepararSQL.setInt(4, imc.getId());
		prepararSQL.execute();

	}

*/

}