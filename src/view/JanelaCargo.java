package view;

//Galera, tamb�m somente exercitando

//teste
import javax.swing.*;

public class JanelaCargo extends JFrame {

	
	private JButton criar, editar, excluir;
	private JLabel carExistentes, carNome, carSalario;
	private JList lista;
	private JTextField campoNome, campoSalario;
	private String[] cargos = {"Cargo 1", "Cargo 2", 
			"Cargo 3", "Cargo 4", "Cargo 5", "Cargo 6",
			"Cargo 7", "Cargo 8", "Cargo 9"};

	

	public JanelaCargo() {
		
		super("Cargo");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		setLayout(null);
		
		carExistentes = new JLabel("Cargos Existentes");
		carExistentes.setBounds(20, 20, 130, 20);

		carNome = new JLabel("Cargo");
		carNome.setBounds(20, 305, 200, 20);
		
		carSalario = new JLabel("Sal�rio");
		carSalario.setBounds(20, 345, 200, 20);
		
		
		
		
		criar = new JButton("Criar");
		criar.setBounds(20, 400, 90, 30);
		
		editar = new JButton("Editar");
		editar.setBounds(120, 400, 90, 30);
		
		excluir = new JButton("Excluir");
		excluir.setBounds(220, 400, 90, 30);

		lista = new JList(cargos);
		lista.setBounds(20, 50, 150, 250);
		
		campoNome = new JTextField();
		campoNome.setBounds(20, 325, 200, 20);
		
		campoSalario = new JTextField();
		campoSalario.setBounds(20, 365, 200, 20);
		
		
		
		
		
		add(criar);
		add(editar);
		add(excluir);
		add(carExistentes);
		add(lista);
		add(campoNome);
		add(campoSalario);
		add(carSalario);
		add(carNome);
		
		
		
		
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		
		JanelaCargo janCar = new JanelaCargo();
		
		//Agora teria que colocar esse objeto janCat dentro da tela do J�lio
		// ou melhor, teria que chamar essa tela e inserir meu objeto dentro
		// N�o sei como ainda
		
		
		
		
		
	}

}




