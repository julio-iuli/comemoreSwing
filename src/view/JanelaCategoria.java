package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//Galera, tamb�m somente exercitando


import javax.swing.*;

import model.Categoria;

public class JanelaCategoria extends JPanel implements ActionListener{

	
	private JButton criar, editar, excluir;
	private JLabel catExistentes, catNome;
	private JList lista;
	private JTextField campoNome;
	private String[] categorias = {"Categoria 1", "Categoria 2", 
			"Categoria 3"};

	

	public JanelaCategoria() {
		
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
		
		excluir = new JButton("Excluir");
		excluir.setBounds(220, 390, 90, 30);

		lista = new JList(categorias);
		lista.setBounds(20, 50, 150, 250);
		
		campoNome = new JTextField();
		campoNome.setBounds(20, 340, 200, 20);
		
		
		
		
		add(criar);
		//add(editar); Comentado at� habilitar esta funcionalidade
		//add(excluir); Comentado at� habilitar esta funcionalidade
		add(catExistentes);
		add(lista);
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




