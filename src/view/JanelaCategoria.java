package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//Galera, tamb�m somente exercitando


import javax.swing.*;

import model.Categoria;
import model.CategoriaDAO;

public class JanelaCategoria extends JPanel implements ActionListener{

	
	private JButton criar, editar, excluir;
	private JLabel catExistentes, catNome;
	private JTable tabela;
	private JTextField campoNome;
	

	

	public JanelaCategoria() throws SQLException {
		
		//super("Categoria");
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		setLayout(null);
		
		catExistentes = new JLabel("Categorias Existentes");
		catExistentes.setBounds(20, 20, 130, 20);
		
		catNome = new JLabel("Nome");
		catNome.setBounds(20, 320, 130, 20);
				
		criar = new JButton("Criar");
		criar.setBounds(20, 390, 90, 30);
		criar.addActionListener(this);
		
		editar = new JButton("Editar");
		editar.setBounds(120, 390, 90, 30);
		editar.addActionListener(this);

		
		excluir = new JButton("Excluir");
		excluir.setBounds(220, 390, 90, 30);
		excluir.addActionListener(this);

		CategoriaDAO dao = new CategoriaDAO();
		//fun��o listar - toda a vez que a p�gina � carregada
		tabela = new JTable(dao.listar());
		tabela.setBounds(20, 50, 150, 250);

		
		campoNome = new JTextField();
		campoNome.setBounds(20, 340, 200, 20);
		
		
		
		
		add(criar);
		add(editar);
		add(excluir);
		add(catExistentes);
		add(tabela);
		add(campoNome);
		add(catNome);
		
		
		
		
		setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent ap) {

		if (ap.getSource() == criar){
			//JOptionPane.showMessageDialog(null, "funciona! clicado em criar: ");
			Categoria categoria = new Categoria();
			categoria.setNome(campoNome.getText());
			
						
			try {
				CategoriaDAO dao = new CategoriaDAO();
				
				dao.inserir(categoria);
				
				JOptionPane.showMessageDialog(null, "Gravado");
				
			} catch (SQLException erro) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, erro);
			}
			
			
			
			
		} else if (ap.getSource() == excluir){
			
			JOptionPane.showMessageDialog(null, "Excluir - em constru��o");
			
		} else if (ap.getSource() == editar){
			
			JOptionPane.showMessageDialog(null, "Editar - em constru��o");

			
		}
		
		
		
		
		
	}
	
	
	
	/*
	
	public static void main(String[] args) {
		
		JanelaCategoria janCat = new JanelaCategoria();
		
		//Agora teria que colocar esse objeto janCat dentro da tela do J�lio
		// ou melhor, teria que chamar essa tela e inserir meu objeto dentro
		// N�o sei como ainda
		
		
		
		
		
	}

*/


}




