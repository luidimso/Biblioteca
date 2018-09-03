package apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class TelaCadastrarCliente {

	private JFrame frmAdicionarCliente;
	private JTextField fieldMatricula;
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
					TelaCadastrarCliente window = new TelaCadastrarCliente();
					window.frmAdicionarCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastrarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdicionarCliente = new JFrame();
		frmAdicionarCliente.setTitle("Adicionar Cliente");
		frmAdicionarCliente.setBounds(100, 100, 800, 353);
		frmAdicionarCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdicionarCliente.getContentPane().setLayout(null);
		
		JPanel panelCliente = new JPanel();
		panelCliente.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)), "DADOS DO CLIENTE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCliente.setBounds(10, 11, 764, 120);
		frmAdicionarCliente.getContentPane().add(panelCliente);
		panelCliente.setLayout(null);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
		lblMatrcula.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMatrcula.setBounds(10, 22, 64, 14);
		panelCliente.add(lblMatrcula);
		
		fieldMatricula = new JTextField();
		fieldMatricula.setEditable(false);
		fieldMatricula.setBounds(84, 19, 69, 20);
		panelCliente.add(fieldMatricula);
		fieldMatricula.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(178, 22, 46, 14);
		panelCliente.add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(234, 19, 399, 20);
		panelCliente.add(fieldNome);
		fieldNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBounds(643, 22, 46, 14);
		panelCliente.add(lblIdade);
		
		fieldIdade = new JTextField();
		fieldIdade.setBounds(699, 19, 55, 20);
		panelCliente.add(fieldIdade);
		fieldIdade.setColumns(10);
		
		JLabel lblAniversrio = new JLabel("Anivers\u00E1rio:");
		lblAniversrio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAniversrio.setBounds(10, 53, 72, 14);
		panelCliente.add(lblAniversrio);
		
		JDateChooser fieldCalendario = new JDateChooser();
		fieldCalendario.setBounds(84, 50, 116, 20);
		panelCliente.add(fieldCalendario);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(234, 53, 46, 14);
		panelCliente.add(lblEmail);
		
		fieldEmail = new JTextField();
		fieldEmail.setBounds(286, 51, 287, 20);
		panelCliente.add(fieldEmail);
		fieldEmail.setColumns(10);
		
		JLabel lblProfisso = new JLabel("Profiss\u00E3o:");
		lblProfisso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProfisso.setBounds(10, 86, 64, 14);
		panelCliente.add(lblProfisso);
		
		fieldProfissao = new JTextField();
		fieldProfissao.setBounds(84, 84, 411, 20);
		panelCliente.add(fieldProfissao);
		fieldProfissao.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(583, 53, 64, 14);
		panelCliente.add(lblTelefone);
		
		fieldTelefone = new JTextField();
		fieldTelefone.setBounds(653, 51, 101, 20);
		panelCliente.add(fieldTelefone);
		fieldTelefone.setColumns(10);
		
		JLabel lblStatusBloqueio = new JLabel("Status de Bloqueio:");
		lblStatusBloqueio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatusBloqueio.setBounds(505, 86, 133, 14);
		panelCliente.add(lblStatusBloqueio);
		
		JComboBox comboBoxStatusBloqueio = new JComboBox();
		comboBoxStatusBloqueio.setModel(new DefaultComboBoxModel(new String[] {"", "Sim", "N\u00E3o"}));
		comboBoxStatusBloqueio.setBounds(643, 84, 111, 20);
		panelCliente.add(comboBoxStatusBloqueio);
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)), "DADOS DE ENDERE\u00C7O", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelEndereco.setBounds(10, 142, 764, 128);
		frmAdicionarCliente.getContentPane().add(panelEndereco);
		panelEndereco.setLayout(null);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRua.setBounds(10, 25, 30, 14);
		panelEndereco.add(lblRua);
		
		fieldRua = new JTextField();
		fieldRua.setBounds(50, 23, 552, 20);
		panelEndereco.add(fieldRua);
		fieldRua.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNmero.setBounds(612, 25, 51, 14);
		panelEndereco.add(lblNmero);
		
		fieldNumero = new JTextField();
		fieldNumero.setBounds(668, 23, 86, 20);
		panelEndereco.add(fieldNumero);
		fieldNumero.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComplemento.setBounds(344, 61, 94, 14);
		panelEndereco.add(lblComplemento);
		
		fieldComplemento = new JTextField();
		fieldComplemento.setBounds(438, 59, 154, 20);
		panelEndereco.add(fieldComplemento);
		fieldComplemento.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCep.setBounds(602, 61, 35, 14);
		panelEndereco.add(lblCep);
		
		fieldCep = new JTextField();
		fieldCep.setBounds(640, 59, 114, 20);
		panelEndereco.add(fieldCep);
		fieldCep.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBairro.setBounds(10, 61, 46, 14);
		panelEndereco.add(lblBairro);
		
		fieldBairro = new JTextField();
		fieldBairro.setBounds(60, 59, 274, 20);
		panelEndereco.add(fieldBairro);
		fieldBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCidade.setBounds(10, 97, 46, 14);
		panelEndereco.add(lblCidade);
		
		fieldCidade = new JTextField();
		fieldCidade.setBounds(70, 95, 473, 20);
		panelEndereco.add(fieldCidade);
		fieldCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUf.setBounds(556, 97, 46, 14);
		panelEndereco.add(lblUf);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"", "Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par\u00E1", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Piau\u00ED", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		comboBoxEstado.setBounds(585, 95, 169, 20);
		panelEndereco.add(comboBoxEstado);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(586, 281, 89, 23);
		frmAdicionarCliente.getContentPane().add(btnAdicionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(685, 281, 89, 23);
		frmAdicionarCliente.getContentPane().add(btnCancelar);
	}
}
