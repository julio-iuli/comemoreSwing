package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ClienteDAO;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JanelaConsultaCliente2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTxtbuscarcliente;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnSelecionar;


	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public JanelaConsultaCliente2() throws SQLException {
		setBounds(100, 100, 800, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnBuscarCliente = new JButton("Buscar Cliente");
		panel.add(btnBuscarCliente);
		
		txtTxtbuscarcliente = new JTextField();
		panel.add(txtTxtbuscarcliente);
		txtTxtbuscarcliente.setColumns(40);
		
		btnSelecionar = new JButton("Deletar");
		btnSelecionar.addActionListener(this);
		panel.add(btnSelecionar);
		
		ClienteDAO dao = new ClienteDAO();
		
		table = new JTable(dao.listar());
		scrollPane = new JScrollPane(table);
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane, BorderLayout.CENTER);
				
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		if (ev.getSource() == btnSelecionar) {
			//JOptionPane.showMessageDialog(null, table.getValueAt(table.getSelectedRow(), 0));
			try {
				ClienteDAO dao = new ClienteDAO();
				int idCliente = Integer.parseInt((String)table.getValueAt(table.getSelectedRow(), 0));
				
				
				
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao Deletar");
				e.printStackTrace();
			}
		}
	}

}
