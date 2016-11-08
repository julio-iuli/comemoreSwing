package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JToggleButton;

public class Tema extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public Tema() {
		
		JLabel lblNomeDoTema = new JLabel("Nome do Tema");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblDescrioDoTema = new JLabel("Descri\u00E7\u00E3o do Tema");
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblStatus = new JLabel("Status");
		
		JCheckBox chckbxAtivo = new JCheckBox("Ativo");
		
		JCheckBox chckbxInativo = new JCheckBox("Inativo");
		
		JLabel lblGnero = new JLabel("G\u00EAnero");
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		
		JLabel lblDataDaCompra = new JLabel("Data da Compra");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblImagenDoTema = new JLabel("Imagen do Tema");
		
		JInternalFrame internalFrame = new JInternalFrame("Imagen do Tema");
		internalFrame.setVisible(true);
		
		JButton btnGravar = new JButton("Gravar");
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnProcurarImagen = new JButton("Procurar Imagen");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNomeDoTema)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))
						.addComponent(lblDescrioDoTema)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblStatus)
									.addGap(114)
									.addComponent(lblGnero))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxAtivo)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxInativo)
									.addGap(18)
									.addComponent(rdbtnMasculino)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnFeminino)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(30)
									.addComponent(lblDataDaCompra, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(lblPreo)
									.addGap(218))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
									.addGap(31)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addComponent(lblImagenDoTema)
						.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnGravar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancelar))
						.addComponent(btnProcurarImagen))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeDoTema, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDescrioDoTema)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStatus)
						.addComponent(lblGnero)
						.addComponent(lblDataDaCompra)
						.addComponent(lblPreo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxAtivo)
						.addComponent(chckbxInativo)
						.addComponent(rdbtnMasculino)
						.addComponent(rdbtnFeminino)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblImagenDoTema)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(internalFrame, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(btnProcurarImagen)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGravar)
						.addComponent(btnCancelar))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
