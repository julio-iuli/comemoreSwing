package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.jdatepicker.impl.JDatePickerImpl;

import model.Cliente;
import model.Funcionario;
import model.Logradouro;
import model.Tema;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JButton;

public class JanelaPedido extends JPanel implements ActionListener {
	private JTextField txtNometema;
	private JTextField txtNomecliente;
	private JDatePickerImpl dataEntrega;
	private JButton btnSelecionarCliente;
	private JButton btnSelecionarTema;
	private JanelaConsultaCliente2 jc2;
	private JanelaConsultaTema jct;
	private Cliente clientePedido;
	private Logradouro logradouroPedido;
	private Funcionario funcionarioPedido;
	private Tema temaCliente, temaPedido;
	private JTextField txtLogradouro;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUf;
	private JTextField txtCep;
	private JTextField txtComplemento;
	private JTextField txtHora;
	

	/**
	 * Create the panel.
	 */
	public JanelaPedido() {
		
		JLabel lblCadastrarPedido = new JLabel("CADASTRAR PEDIDO");
		lblCadastrarPedido.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblTema = new JLabel("Tema");
		
		JLabel lblCliente = new JLabel("Cliente");
		
		JLabel lblDataDeEntrega = new JLabel("Data de Entrega");
		
		JLabel lblLogradouroDeEntrega = new JLabel("Endereço de Entrega:");
		
		JLabel lblComplemento = new JLabel("Complemento");
		
		JLabel lblObservaoSobreO = new JLabel("Observação sobre o pedido");
		
		txtNometema = new JTextField();
		txtNometema.setEditable(false);
		txtNometema.setColumns(10);
		
		txtNomecliente = new JTextField();
		txtNomecliente.setEditable(false);
		txtNomecliente.setColumns(10);
		
		dataEntrega = JulioDatePicker.criar(2017, true);
		
		JLabel lblLugarDatepicker = new JLabel("lugar datepicker");
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		btnSelecionarCliente = new JButton("Selecionar Cliente");
		btnSelecionarCliente.addActionListener(this);
		
		btnSelecionarTema = new JButton("Selecionar Tema");
		btnSelecionarTema.addActionListener(this);
		
		JLabel lblUf = new JLabel("UF");
		
		JLabel lblCidade = new JLabel("Cidade");
		
		JLabel lblBairro = new JLabel("Bairro");
		
		JLabel lblLogradouro = new JLabel("Logradouro");
		
		JLabel lblCep = new JLabel("CEP");
		
		txtLogradouro = new JTextField();
		txtLogradouro.setEditable(false);
		txtLogradouro.setColumns(10);
		
		txtBairro = new JTextField();
		txtBairro.setEditable(false);
		txtBairro.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setEditable(false);
		txtCidade.setColumns(10);
		
		txtUf = new JTextField();
		txtUf.setEditable(false);
		txtUf.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setColumns(10);
		
		JButton btnBuscaCep = new JButton("Busca CEP");
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(10);
		
		JButton btnGravarPedido = new JButton("Gravar Pedido");
		
		JLabel lblHoraDaEntrega = new JLabel("Hora da entrega");
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCadastrarPedido)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCliente)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNomecliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTema)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNometema, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblLogradouroDeEntrega)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblLogradouro)
										.addComponent(lblBairro)
										.addComponent(lblCidade)
										.addComponent(lblUf))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtUf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnBuscaCep)))
								.addComponent(lblCep)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDataDeEntrega)
										.addComponent(lblHoraDaEntrega))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLugarDatepicker))))
							.addGap(25)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
									.addComponent(lblObservaoSobreO)
									.addGap(28))
								.addComponent(textArea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
								.addComponent(btnSelecionarTema)
								.addComponent(btnSelecionarCliente)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblComplemento)
								.addComponent(txtComplemento, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
							.addGap(65)
							.addComponent(btnGravarPedido)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCadastrarPedido)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTema)
						.addComponent(txtNometema, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSelecionarTema))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCliente)
						.addComponent(txtNomecliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSelecionarCliente))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDataDeEntrega)
								.addComponent(lblLugarDatepicker))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHoraDaEntrega)
								.addComponent(txtHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(16)
							.addComponent(lblLogradouroDeEntrega)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUf)
								.addComponent(txtUf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCidade)
								.addComponent(txtCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBairro)
								.addComponent(txtBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLogradouro)
								.addComponent(txtLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCep)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnBuscaCep))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblObservaoSobreO)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblComplemento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnGravarPedido))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		if (ev.getSource() == btnSelecionarCliente) {
			try {
				jc2 = new JanelaConsultaCliente2(this);
				jc2.setVisible(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (ev.getSource() == btnSelecionarTema) {
			try {
				jct = new JanelaConsultaTema(this);
				jct.setVisible(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void receberCliente(Cliente cliente) {
		clientePedido = cliente;
		txtNomecliente.setText(clientePedido.getNome());
		if (jc2 != null){jc2.setVisible(false);jc2.dispose();}
	}
	
	public void receberTema(Tema tema) {
		temaPedido = tema;
		txtNometema.setText(temaPedido.getNome());
		if (jct != null){jct.setVisible(false);jct.dispose();}
	}
}
