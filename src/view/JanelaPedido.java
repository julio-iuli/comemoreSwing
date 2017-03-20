package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.jdatepicker.impl.JDatePickerImpl;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class JanelaPedido extends JPanel implements ActionListener {
	private JTextField txtNometema;
	private JTextField txtNomecliente;
	private JDatePickerImpl dataEntrega;

	/**
	 * Create the panel.
	 */
	public JanelaPedido() {
		
		JLabel lblCadastrarPedido = new JLabel("CADASTRAR PEDIDO");
		lblCadastrarPedido.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblTema = new JLabel("Tema");
		
		JLabel lblCliente = new JLabel("Cliente");
		
		JLabel lblDataDeEntrega = new JLabel("Data de Entrega");
		
		JLabel lblLogradouroDeEntrega = new JLabel("Logradouro de Entrega");
		
		JLabel lblComplemento = new JLabel("Complemento");
		
		JLabel lblObservaoSobreO = new JLabel("Observação sobre o pedido");
		
		txtNometema = new JTextField();
		txtNometema.setColumns(10);
		
		txtNomecliente = new JTextField();
		txtNomecliente.setColumns(10);
		
		dataEntrega = JulioDatePicker.criar(2017, true);
		
		JLabel lblLugarDatepicker = new JLabel("lugar datepicker");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCadastrarPedido)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblTema)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNometema, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCliente)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNomecliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDataDeEntrega)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblLugarDatepicker))
						.addComponent(lblLogradouroDeEntrega)
						.addComponent(lblComplemento)
						.addComponent(lblObservaoSobreO))
					.addContainerGap(308, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCadastrarPedido)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTema)
						.addComponent(txtNometema, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCliente)
						.addComponent(txtNomecliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDataDeEntrega)
						.addComponent(lblLugarDatepicker))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLogradouroDeEntrega)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblComplemento)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblObservaoSobreO)
					.addContainerGap(143, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
