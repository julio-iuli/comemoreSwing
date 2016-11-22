package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

//Galera, tambï¿½m somente exercitando

//teste
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import model.Cargo;
import model.CargoDAO;




public class JanelaCargo extends JPanel implements ActionListener{

	
	private JButton criar, editar, excluir;
	private JLabel carExistentes, carNome, carSalario;
	private JTable tabela;
	private JTextField campoNome, campoSalario;
	private String cargoEscolhido;

	public JanelaCargo() throws SQLException {
		
		cargoEscolhido = new String();
		
		setBounds(100, 100, 700, 500);
		
		setLayout(null);
		
		carExistentes = new JLabel("Cargos Existentes");
		carExistentes.setBounds(20, 20, 130, 20);
		

		carNome = new JLabel("Cargo");
		carNome.setBounds(20, 305, 200, 20);
		
		carSalario = new JLabel("Salï¿½rio");
		carSalario.setBounds(20, 345, 200, 20);
		
		criar = new JButton("Criar");
		criar.setBounds(20, 390, 90, 30);
		criar.addActionListener(this);
		
		editar = new JButton("Editar");
		editar.setBounds(120, 390, 90, 30);
		editar.addActionListener(this);

		
		excluir = new JButton("Excluir");
		excluir.setBounds(220,390, 90, 30);
		excluir.addActionListener(this);

		
	
		
		
		//função listar - toda a vez que a página é carregada
		CargoDAO dao = new CargoDAO();
		tabela = new JTable(dao.listar());
		tabela.setBounds(20, 50, 150, 250);
		
		
			
		
		
	
		
		
		campoNome = new JTextField();
		campoNome.setBounds(20, 325, 200, 20);
		
		campoSalario = new JTextField();
		campoSalario.setBounds(20, 365, 200, 20);
		
		add(criar);
		add(editar); 
		add(excluir);
		add(carExistentes);
		
		add(campoNome);
		add(campoSalario);
		add(carSalario);
		add(carNome);
		add(tabela);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == criar){
			//JOptionPane.showMessageDialog(null, "funciona! clicado em criar: " + cargoEscolhido);
			Cargo cargo = new Cargo();
			cargo.setNome(campoNome.getText());
			cargo.setSalario(Double.parseDouble(campoSalario.getText()));
						
			try {
				CargoDAO dao = new CargoDAO();
				
				dao.inserir(cargo);
				
				JOptionPane.showMessageDialog(null, "Gravado");
				
								
			} catch (SQLException erro) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, erro);
			}
			
			
			
			
		} else if (e.getSource() == editar){
			
			JOptionPane.showMessageDialog(null, "Editar - em construção");
			
		} else if (e.getSource() == excluir){
			
			JOptionPane.showMessageDialog(null, "Excluir - em construção");
			
		}
		
		
		
		
	}
	
	
	
	

	
	
	

}
