package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	// JDBC -- Java Database Controller

	private Connection conexao; // classe encarregada de fazer a conex�o

	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}

	public Conexao() throws SQLException { // SQLException trata este tipo de
											// exce��o

		this.conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/comemore", "root", "123456"); // Driver
																										// Manager
		// Criei um bd na minha m�quina para testar. Precisa alterar os parametros de nome e senha																								// �
																										// o
																										// interpretador
																										// Java/BD

	}

}