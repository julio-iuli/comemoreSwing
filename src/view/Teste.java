package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		JMenuItem mntmNovo = new JMenuItem("Novo");
		mnCliente.add(mntmNovo);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mnCliente.add(mntmEditar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnCliente.add(mntmConsultar);
		
		JMenuItem mntmApagar = new JMenuItem("Apagar");
		mnCliente.add(mntmApagar);
		
		JMenu mnFuncionrio = new JMenu("Funcionário");
		menuBar.add(mnFuncionrio);
		
		JMenuItem menuItem = new JMenuItem("Novo");
		mnFuncionrio.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Editar");
		mnFuncionrio.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Consultar");
		mnFuncionrio.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Apagar");
		mnFuncionrio.add(menuItem_3);
		
		JMenu Pedido = new JMenu("Pedido");
		menuBar.add(Pedido);
		
		JMenuItem menuItem_4 = new JMenuItem("Novo");
		Pedido.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Editar");
		Pedido.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("Consultar");
		Pedido.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("Apagar");
		Pedido.add(menuItem_7);
		
		JMenu mnTema = new JMenu("Tema");
		menuBar.add(mnTema);
		
		JMenuItem menuItem_8 = new JMenuItem("Novo");
		mnTema.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("Editar");
		mnTema.add(menuItem_9);
		
		JMenuItem menuItem_10 = new JMenuItem("Consultar");
		mnTema.add(menuItem_10);
		
		JMenuItem menuItem_11 = new JMenuItem("Apagar");
		mnTema.add(menuItem_11);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mnTema.add(mntmCategoria);
	}

}
