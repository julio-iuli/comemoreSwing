package view;

//Galera, tamb�m somente exercitando


import javax.swing.*;

public class JanelaCategoria extends JFrame {

	
	private JButton criar, editar, excluir;
	private JLabel catExistentes;
	private JList lista;
	private JTextField campoNome;
	private String[] categorias = {"Categoria 1", "Categoria 2", 
			"Categoria 3", "Categoria 4", "Categoria 5", "Categoria 6",
			"Categoria 7", "Categoria 8", "Categoria 9"};

	

	public JanelaCategoria() {
		
		super("Categoria");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		setLayout(null);
		
		catExistentes = new JLabel("Categorias Existentes");
		catExistentes.setBounds(20, 20, 130, 20);
				
		criar = new JButton("Criar");
		criar.setBounds(20, 400, 90, 30);
		
		editar = new JButton("Editar");
		editar.setBounds(120, 400, 90, 30);
		
		excluir = new JButton("Excluir");
		excluir.setBounds(220, 400, 90, 30);

		lista = new JList(categorias);
		lista.setBounds(20, 50, 150, 250);
		
		campoNome = new JTextField();
		campoNome.setBounds(20, 340, 200, 20);
		
		
		
		
		add(criar);
		add(editar);
		add(excluir);
		add(catExistentes);
		add(lista);
		add(campoNome);
		
		
		
		
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		
		JanelaCategoria janCat = new JanelaCategoria();
		
		//Agora teria que colocar esse objeto janCat dentro da tela do J�lio
		// ou melhor, teria que chamar essa tela e inserir meu objeto dentro
		// N�o sei como ainda
		
		
		
		
		
	}

}




