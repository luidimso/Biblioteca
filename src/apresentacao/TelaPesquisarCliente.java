package apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Button;
import java.awt.Choice;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.AbstractListModel;
import javax.swing.JEditorPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import persistencia.DMCliente;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaPesquisarCliente {

	private JFrame frmPesquisarCliente;
	private JTextField fieldNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPesquisarCliente window = new TelaPesquisarCliente();
					window.frmPesquisarCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPesquisarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		DMCliente dmc = new DMCliente();
		
		frmPesquisarCliente = new JFrame();
		frmPesquisarCliente.setTitle("Pesquisar Cliente");
		frmPesquisarCliente.setBounds(100, 100, 800, 231);
		frmPesquisarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPesquisarCliente.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(10, 11, 46, 14);
		frmPesquisarCliente.getContentPane().add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(57, 9, 641, 20);
		frmPesquisarCliente.getContentPane().add(fieldNome);
		fieldNome.setColumns(10);
		
		List listClientes = new List();
		listClientes.setBounds(73, 47, 392, 133);
		frmPesquisarCliente.getContentPane().add(listClientes);
		
		Button btnPesquisar = new Button("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = fieldNome.getText();
				dmc.conectar("biblioteca", "root", "root");
				ResultSet resultado = (ResultSet) dmc.pesquisar(nome);
				if(resultado != null) {
					try {
						listClientes.removeAll();
						while(resultado.next()){
							listClientes.add(resultado.getString(3));
						}					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnPesquisar.setBounds(704, 7, 70, 22);
		frmPesquisarCliente.getContentPane().add(btnPesquisar);
		
		JLabel lblClientes = new JLabel("Clientes:");
		lblClientes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClientes.setBounds(10, 47, 57, 14);
		frmPesquisarCliente.getContentPane().add(lblClientes);
		
		Button btnAlterar = new Button("Alterar");
		btnAlterar.setBounds(472, 47, 70, 22);
		frmPesquisarCliente.getContentPane().add(btnAlterar);
		
		Button btnDeletar = new Button("Deletar");
		btnDeletar.setBounds(471, 75, 70, 22);
		frmPesquisarCliente.getContentPane().add(btnDeletar);
	}
}
