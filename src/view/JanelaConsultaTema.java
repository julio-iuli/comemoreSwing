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

import model.Cliente;
import model.ClienteDAO;
import model.Tema;
import model.TemaDAOJulio;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JanelaConsultaTema extends JFrame {

	private JPanel contentPane;
	private JTextField txtTxtbuscartema;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnSelecionar;


	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public JanelaConsultaTema(JanelaPedido jp) throws SQLException {
		setBounds(100, 100, 800, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnBuscarTema = new JButton("Buscar Tema");
		panel.add(btnBuscarTema);
		
		txtTxtbuscartema = new JTextField();
		panel.add(txtTxtbuscartema);
		txtTxtbuscartema.setColumns(40);
		
		btnSelecionar = new JButton("Selecionar");
		btnSelecionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					TemaDAOJulio dao = new TemaDAOJulio();
					int idTema = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
					Tema tema = new Tema();
					tema = dao.selecionar(idTema);
					jp.receberTema(tema);
				} catch (SQLException err) {
					JOptionPane.showMessageDialog(null, "Erro ao Selecionar" + err.toString());
					err.printStackTrace();
				}
			}
		});
		panel.add(btnSelecionar);
		
		TemaDAOJulio dao = new TemaDAOJulio();
		
		table = new JTable(dao.listar());
		scrollPane = new JScrollPane(table);
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane, BorderLayout.CENTER);
				
		setVisible(true);
	}
}
