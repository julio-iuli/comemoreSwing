package view;
import java.awt.Component;
//Trabalhando em 14/04/2017
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePickerImpl;

import model.Categoria;
import model.CategoriaDAO;

//import com.mysql.fabric.xmlrpc.base.Array;

import model.Tema;
import model.TemaDAO;



public class AppTema extends JPanel implements ActionListener{

	private JLabel lblnomeTema,lbldescricaoTema,lblgeneroTema,lblstatusTema,lbldataCompra,lblpreco;
	private JTextField txtnomeTema,txtpreco;
	private JTextArea txtdescricaoTema;
	private JComboBox status,genero, categoriaBox;
	private JButton btnsalvar,btncancelar,btnlistar,btnimagen;
	private JDatePickerImpl dataCompra;
	
	
	public AppTema() throws SQLException{
		//Frame
		//super("Tema");
		//setSize(600,280);
		//setLocationRelativeTo(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
				
		//Elementos da Tela
		
		//Nome do Tema
		lblnomeTema = new JLabel("Nome do Tema");
		lblnomeTema.setBounds(1,1,105,20);
		txtnomeTema = new JTextField(100);
		txtnomeTema.setBounds(88,1,490,20);
		
		//descricao do tema
		lbldescricaoTema = new JLabel("Descrição do Tema");
		lbldescricaoTema.setBounds(1,60,110,20);
		txtdescricaoTema = new JTextArea(50,50);
		txtdescricaoTema.setBounds(115,35,460,80);
				
		//status do tema
		lblstatusTema = new JLabel("Status");
		lblstatusTema.setBounds(12,120,66,20);
		
		//Combo box status
		String[] array_status = {"","Ativo","Inativo"};
		status = new JComboBox(array_status);
		status.setSelectedIndex(0);
		status.setBounds(12,140,65,20);
				
		//genero
		lblgeneroTema = new JLabel("Gênero");
		lblgeneroTema.setBounds(88,120,90,20);
		
		//Combo box genero
		String[] array_genero = {"","M","F","U"};
		genero = new JComboBox(array_genero);
		genero.setSelectedIndex(0);
		genero.setBounds(88,140,100,20);
		
		
		//datapicker do julix
		lbldataCompra = new JLabel("Data da Compra");
		lbldataCompra.setBounds(430,120,120,20);
		dataCompra = JulioDatePicker.criar(1980,true);
		dataCompra.setBounds(410,140,150,30);
		lblpreco = new JLabel("Pre�o do Tema");
		lblpreco.setBounds(440,175,120,20);
		txtpreco = new JTextField();
		txtpreco.setBounds(410,200,155,20);
				
		//botoes
		btnsalvar = new JButton("Salvar");
		btnsalvar.setBounds(1,200,80,40);
		btnsalvar.addActionListener(this);
		btncancelar = new JButton("Cancelar");
		btncancelar.setBounds(90,200,90,40);
		btncancelar.addActionListener(this);
		btnimagen = new JButton("Imagem");
		btnimagen.setBounds(190,200,80,40);
		btnimagen.addActionListener(this);
		btnlistar = new JButton("Listar");
		btnlistar.setBounds(280,200,80,40);
		btnlistar.addActionListener(this);
				
		//incluindo na tela
		add(lblnomeTema);add(txtnomeTema);
		add(lbldescricaoTema);add(txtdescricaoTema);
		add(lblstatusTema);
		add(lblgeneroTema);
		add(lbldataCompra);add(dataCompra);add(lblpreco);add(txtpreco);
		add(btnsalvar);add(btncancelar);add(btnimagen);add(btnlistar);
		add(status);add(genero);
		
		// Tentativa com renderizador
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(226, 123, 70, 15);
		add(lblCategoria);
		categoriaBox = new JComboBox();
		categoriaBox.setBounds(216, 138, 100, 24);
		
		categoriaBox.setRenderer(new DefaultListCellRenderer(){
	        @Override  
	        public Component getListCellRendererComponent(
	            JList list, Object value, int index,
	            boolean isSelected, boolean cellHasFocus)
	        {
	            super.getListCellRendererComponent(list, value, index,
	                isSelected, cellHasFocus);

	                if(value != null){
	                 Categoria cat = (Categoria)value;
	                 setText( cat.getNome());
	                }
	            return this;
	        }
		});
		CategoriaDAO dao = new CategoriaDAO();
		categoriaBox.setModel(new DefaultComboBoxModel(new Vector<Categoria>(dao.getAll())));
		
		add(categoriaBox);
		
		setVisible(true);
	}

	
	//************* OUTROS M�TODOS AQUI  **************//
	
	public void limpar(){
		txtnomeTema.setText("");
		txtdescricaoTema.setText("");
		txtpreco.setText("");
		status.setSelectedItem("");
		genero.setSelectedItem("");
			
	}
	
	// Chamando a Tela de Imagem
	
	public void telaImagen(){
	    Imagen frame = new Imagen(); frame.setVisible(true); 
	}
		
	
	//Chamar a Tela Listar
	
	public void listarTema() throws Exception {
		ListarTema frame = new ListarTema(); 
		frame.setVisible(true);
	}
	
	//************************************************//
	
	
	
	//Instanciando a classe principal
	
	//public static void main(String[] args){
	//	AppTema objTema = new AppTema();
	//}
	
	// Fazendo todas as a��es(Salvar,Cancelar,Listar,e chamar a imagem
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()== btncancelar){
			limpar();
		}
		
		if(evento.getSource() == btnimagen){
			telaImagen();
		}
		
		if(evento.getSource() == btnlistar){
			try {
				listarTema();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		if(btnsalvar == evento.getSource()){
			Tema objTema = new Tema();
			objTema.setNome(txtnomeTema.getText());
			objTema.setStatus(status.getSelectedItem().toString());
	       	objTema.setDescricao(txtdescricaoTema.getText());	
			objTema.setGenero(genero.getSelectedItem().toString());
			objTema.setPreco(Double.parseDouble(txtpreco.getText()));
			objTema.setdataCompra(LocalDate.parse(dataCompra.getJFormattedTextField().getText()));
			objTema.setCategoria((Categoria)categoriaBox.getSelectedItem());
			
			try{
			TemaDAO dao = new TemaDAO();
			dao.inserir(objTema);
			JOptionPane.showMessageDialog(null,"Gravado com Sucesso");
			}catch (SQLException e){
				JOptionPane.showMessageDialog(null,"ERRO");
				e.printStackTrace();
				
			}
		}
	}
}