package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class AppGUIComemore extends JFrame implements ActionListener {

	private JPanel contentPane, centro;
	private JMenuBar menuBar;
	private JMenu mnCliente, mnFuncionario, mnTema, mnPedido;
	private JMenuItem 	mniClienteNovo, mniClienteConsulta, 
						mniFuncionarioNovo, mniFuncionarioConsulta, mniCargo,
						mniTemaNovo, mniTemaConsulta, mniCategoria,
						mniPedidoNovo, mniPedidoConsulta;
	
	public AppGUIComemore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		centro = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
					
		menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		contentPane.add(centro);
		
		mnCliente = new JMenu("Cliente");
		mnFuncionario = new JMenu("Funcionário");
		mnTema = new JMenu("Tema");
		mnPedido = new JMenu("Pedido");
		
		//Cliente
		menuBar.add(mnCliente);
		mniClienteNovo = new JMenuItem("Novo");
		mniClienteConsulta = new JMenuItem("Consulta");
		mnCliente.add(mniClienteNovo);
		mnCliente.add(mniClienteConsulta);
		
		//Funcionario
		menuBar.add(mnFuncionario);
		mniFuncionarioNovo = new JMenuItem("Novo");
		mniFuncionarioConsulta = new JMenuItem("Consulta");
		mniCargo = new JMenuItem("Cargo");
		mnFuncionario.add(mniFuncionarioNovo);
		mnFuncionario.add(mniFuncionarioConsulta);
		mnFuncionario.add(mniCargo);
		
		mniCargo.addActionListener(this);
		
		//Tema
		menuBar.add(mnTema);
		mniTemaNovo = new JMenuItem("Novo");
		mniTemaConsulta = new JMenuItem("Consulta");
		mniCategoria = new JMenuItem("Categoria");
		mnTema.add(mniTemaNovo);
		mnTema.add(mniTemaConsulta);
		mnTema.add(mniCategoria);
		
		mniTemaNovo.addActionListener(this);
		mniCategoria.addActionListener(this);
		
		//Pedido
		menuBar.add(mnPedido);
		mniPedidoNovo = new JMenuItem("Novo");
		mniPedidoConsulta = new JMenuItem("Consulta");
		mnPedido.add(mniPedidoNovo);
		mnPedido.add(mniPedidoConsulta);
	}
	
	public static void main(String[] args) {
		AppGUIComemore frame = new AppGUIComemore();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == mniCargo) {
			contentPane.remove(centro);
			centro = new JanelaCargo();
			contentPane.add(centro, BorderLayout.CENTER);
			contentPane.revalidate();
		}
		else if (e.getSource() == mniCategoria) {
			contentPane.remove(centro);
			centro = new JanelaCategoria();
			contentPane.add(centro, BorderLayout.CENTER);
			contentPane.revalidate();	
			
		}
		else if (e.getSource() == mniTemaNovo) {
			contentPane.remove(centro);
			centro = new JanelaTema();
			contentPane.add(centro, BorderLayout.CENTER);
			contentPane.revalidate();
		}
		
	}

}
