package apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaAlterarCliente {

	private JFrame frmAlterarCliente;
	private JTextField fieldMatrícula;
	private JTextField fieldNome;
	private JTextField fieldIdade;
	private JTextField fieldEmail;
	private JTextField fieldProfissao;
	private JTextField fieldTelefone;
	private JTextField fieldRua;
	private JTextField fieldNumero;
	private JTextField fieldComplemento;
	private JTextField fieldCep;
	private JTextField fieldBairro;
	private JTextField fieldCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAlterarCliente window = new TelaAlterarCliente();
					window.frmAlterarCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAlterarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlterarCliente = new JFrame();
		frmAlterarCliente.setTitle("Alterar Cliente");
		frmAlterarCliente.setBounds(100, 100, 800, 353);
		frmAlterarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlterarCliente.getContentPane().setLayout(null);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setLayout(null);
		panelCliente.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)), "DADOS DO CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCliente.setBounds(10, 11, 764, 120);
		frmAlterarCliente.getContentPane().add(panelCliente);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula:");
		lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMatricula.setBounds(10, 22, 64, 14);
		panelCliente.add(lblMatricula);
		
		fieldMatrícula = new JTextField();
		fieldMatrícula.setEditable(false);
		fieldMatrícula.setColumns(10);
		fieldMatrícula.setBounds(84, 19, 69, 20);
		panelCliente.add(fieldMatrícula);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(178, 22, 46, 14);
		panelCliente.add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setColumns(10);
		fieldNome.setBounds(234, 19, 399, 20);
		panelCliente.add(fieldNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBounds(643, 22, 46, 14);
		panelCliente.add(lblIdade);
		
		fieldIdade = new JTextField();
		fieldIdade.setColumns(10);
		fieldIdade.setBounds(699, 19, 55, 20);
		panelCliente.add(fieldIdade);
		
		JLabel lblAniversario = new JLabel("Anivers\u00E1rio:");
		lblAniversario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAniversario.setBounds(10, 53, 72, 14);
		panelCliente.add(lblAniversario);
		
		JDateChooser fieldCalendario = new JDateChooser();
		fieldCalendario.setBounds(84, 50, 116, 20);
		panelCliente.add(fieldCalendario);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(234, 53, 46, 14);
		panelCliente.add(lblEmail);
		
		fieldEmail = new JTextField();
		fieldEmail.setColumns(10);
		fieldEmail.setBounds(286, 51, 287, 20);
		panelCliente.add(fieldEmail);
		
		JLabel lblProfissao = new JLabel("Profiss\u00E3o:");
		lblProfissao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProfissao.setBounds(10, 86, 64, 14);
		panelCliente.add(lblProfissao);
		
		fieldProfissao = new JTextField();
		fieldProfissao.setColumns(10);
		fieldProfissao.setBounds(84, 84, 411, 20);
		panelCliente.add(fieldProfissao);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(583, 53, 64, 14);
		panelCliente.add(lblTelefone);
		
		fieldTelefone = new JTextField();
		fieldTelefone.setColumns(10);
		fieldTelefone.setBounds(653, 51, 101, 20);
		panelCliente.add(fieldTelefone);
		
		JLabel lblStatusBloqueio = new JLabel("Status de Bloqueio:");
		lblStatusBloqueio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatusBloqueio.setBounds(505, 86, 133, 14);
		panelCliente.add(lblStatusBloqueio);
		
		JComboBox comboBoxStatusBloqueio = new JComboBox();
		comboBoxStatusBloqueio.setBounds(643, 84, 111, 20);
		panelCliente.add(comboBoxStatusBloqueio);
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setLayout(null);
		panelEndereco.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)), "DADOS DE ENDERE\u00C7O", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelEndereco.setBounds(10, 142, 764, 128);
		frmAlterarCliente.getContentPane().add(panelEndereco);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRua.setBounds(10, 25, 30, 14);
		panelEndereco.add(lblRua);
		
		fieldRua = new JTextField();
		fieldRua.setColumns(10);
		fieldRua.setBounds(50, 23, 552, 20);
		panelEndereco.add(fieldRua);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero.setBounds(612, 25, 51, 14);
		panelEndereco.add(lblNumero);
		
		fieldNumero = new JTextField();
		fieldNumero.setColumns(10);
		fieldNumero.setBounds(668, 23, 86, 20);
		panelEndereco.add(fieldNumero);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComplemento.setBounds(344, 61, 94, 14);
		panelEndereco.add(lblComplemento);
		
		fieldComplemento = new JTextField();
		fieldComplemento.setColumns(10);
		fieldComplemento.setBounds(438, 59, 154, 20);
		panelEndereco.add(fieldComplemento);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCep.setBounds(602, 61, 35, 14);
		panelEndereco.add(lblCep);
		
		fieldCep = new JTextField();
		fieldCep.setColumns(10);
		fieldCep.setBounds(640, 59, 114, 20);
		panelEndereco.add(fieldCep);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBairro.setBounds(10, 61, 46, 14);
		panelEndereco.add(lblBairro);
		
		fieldBairro = new JTextField();
		fieldBairro.setColumns(10);
		fieldBairro.setBounds(60, 59, 274, 20);
		panelEndereco.add(fieldBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCidade.setBounds(10, 97, 46, 14);
		panelEndereco.add(lblCidade);
		
		fieldCidade = new JTextField();
		fieldCidade.setColumns(10);
		fieldCidade.setBounds(70, 95, 473, 20);
		panelEndereco.add(fieldCidade);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUf.setBounds(556, 97, 46, 14);
		panelEndereco.add(lblUf);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setBounds(585, 95, 169, 20);
		panelEndereco.add(comboBoxEstado);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(586, 281, 89, 23);
		frmAlterarCliente.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(685, 281, 89, 23);
		frmAlterarCliente.getContentPane().add(btnCancelar);
	}

}
