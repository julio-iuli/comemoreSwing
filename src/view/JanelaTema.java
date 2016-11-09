package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class JanelaTema extends JPanel {

	private JPanel contentPane;
	private JTextField txtNomeTema;
	private JTextField txtDataCompra;
	private JTextField txtPreco;

	/**
	 * Create the frame.
	 */
	public JanelaTema() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 350);
		//contentPane = new JPanel();
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		
		JLabel lblNomeDoTema = new JLabel("Nome do Tema");
		
		txtNomeTema = new JTextField();
		txtNomeTema.setColumns(10);
		
		JLabel lblDescricaodoTema = new JLabel("Descri\u00E7\u00E3o do Tema");
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblStatus = new JLabel("Status");
		
		JRadioButton rbtnAtivo = new JRadioButton("Ativo");
		
		JRadioButton rbtnInativo = new JRadioButton("Inativo");
		
		JLabel lblGnero = new JLabel("G\u00EAnero");
		
		JCheckBox checkMasculino = new JCheckBox("Masculino");
		
		JCheckBox checkFeminino = new JCheckBox("Feminino");
		
		JLabel lblDataDaCompra = new JLabel("Data da Compra");
		
		txtDataCompra = new JTextField();
		txtDataCompra.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		
		JButton btnCarregarImagen = new JButton("Carregar Imagen");
		
		JButton btnSalvar = new JButton("Salvar");
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnApagar = new JButton("Apagar");
		
		JButton btnProcurarTema = new JButton("Procurar Tema");
		
		JButton btnProcurarImagen = new JButton("Procurar Imagen");
		
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescricaodoTema)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(lblStatus))
								.addComponent(rbtnAtivo)
								.addComponent(rbtnInativo))
							.addGap(55)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblGnero)
										.addComponent(checkMasculino))
									.addGap(19)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblDataDaCompra)
										.addComponent(lblPreo))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtDataCompra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(checkFeminino)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(btnSalvar)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnCancelar)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnApagar)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnProcurarImagen))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(btnCarregarImagen)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnProcurarTema))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(lblNomeDoTema)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtNomeTema))
							.addComponent(textArea, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeDoTema)
						.addComponent(txtNomeTema, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblDescricaodoTema)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStatus)
						.addComponent(lblGnero)
						.addComponent(lblDataDaCompra)
						.addComponent(txtDataCompra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(rbtnAtivo)
								.addComponent(checkMasculino))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(rbtnInativo)
								.addComponent(checkFeminino)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblPreo)))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCarregarImagen)
						.addComponent(btnProcurarTema))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSalvar)
								.addComponent(btnCancelar)
								.addComponent(btnApagar))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnProcurarImagen)
							.addContainerGap())))
		);
		setLayout(gl_contentPane);
	}
}
