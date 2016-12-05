package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import view.Conexao;

public class CargoDAO {

	private Conexao conexao;
	private PreparedStatement prepararSQL;
	private ResultSet resultado;

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
		prepararSQL.close();

	}
	
	
public DefaultTableModel listar() throws SQLException{
		
		String sql = "select nome, salario from cargo";
		DefaultTableModel tabela = new DefaultTableModel();
	
		tabela.addColumn("Nome");			//n�o tem rela��o com o banco ainda
		tabela.addColumn("Salario");
				
			
		String titulo[]= {"Nome", "Sal�rio"};
		
		tabela.addRow(titulo);
		
		prepararSQL = this.conexao.getConexao().prepareStatement(sql);
		
		resultado = prepararSQL.executeQuery();
		
		while(resultado.next()){
			
			String[] linha = {
								resultado.getString("nome"),
								resultado.getString("salario")
								
								
								};
			tabela.addRow(linha);
						
		}
		
		prepararSQL.close();
				
		return tabela;
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