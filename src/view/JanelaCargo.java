package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Galera, tamb�m somente exercitando

//teste
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JanelaCargo extends JPanel implements ActionListener, ListSelectionListener {

	
	private JButton criar, editar, excluir;
	private JLabel carExistentes, carNome, carSalario;
	private JList lista;
	private JTextField campoNome, campoSalario;
	private String[] cargos = {"Cargo 1", "Cargo 2", 
			"Cargo 3", "Cargo 4", "Cargo 5", "Cargo 6",
			"Cargo 7", "Cargo 8", "Cargo 9"};
	private String cargoEscolhido;

	public JanelaCargo() {
		
		cargoEscolhido = new String();
		
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
		criar.addActionListener(this);
		
		editar = new JButton("Editar");
		editar.setBounds(120, 400, 90, 30);
		
		excluir = new JButton("Excluir");
		excluir.setBounds(220, 400, 90, 30);

		lista = new JList(cargos);
		lista.setBounds(20, 50, 150, 250);
		lista.addListSelectionListener(this);
		
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
		
		//setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == criar){
			JOptionPane.showMessageDialog(null, "funciona! clicado em criar: " + cargoEscolhido);
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent le) {
		
		if(le.getSource() == lista){
			
			cargoEscolhido = lista.getSelectedValue().toString();
		}
		

	}

}




