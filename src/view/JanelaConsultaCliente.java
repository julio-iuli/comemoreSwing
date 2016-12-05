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

public class JanelaConsultaCliente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTxtbuscarcliente;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnDeletar;


	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public JanelaConsultaCliente() throws SQLException {
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
		
		btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(this);
		panel.add(btnDeletar);
		
		ClienteDAO dao = new ClienteDAO();
		
		table = new JTable(dao.listar());
		scrollPane = new JScrollPane(table);
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane, BorderLayout.CENTER);
				
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		if (ev.getSource() == btnDeletar) {
			//JOptionPane.showMessageDialog(null, table.getValueAt(table.getSelectedRow(), 0));
			try {
				ClienteDAO dao = new ClienteDAO();
				int idCliente = Integer.parseInt((String)table.getValueAt(table.getSelectedRow(), 0));
				dao.deletar(idCliente);
				JOptionPane.showMessageDialog(null, "Cliente Deletado Com Sucesso!");
				this.dispose();
				new JanelaConsultaCliente();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Erro ao Deletar");
				e.printStackTrace();
			}
		}
	}

}
