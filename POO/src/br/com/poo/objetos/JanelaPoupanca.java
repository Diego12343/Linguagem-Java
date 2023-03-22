package br.com.poo.objetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class JanelaPoupanca extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeroBanco;
	private JTextField txtAgencia;
	private JTextField txtConta;
	private JTextField txtTitular;
	private JTextField txtSaldoInicial;
	private JTextField txtRendimento;
	private JTextField textValor;
	private JButton btnVerificaSaldo;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public JanelaPoupanca() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 528, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.setBounds(209, 237, 89, 23);
		contentPane.add(btnDepositar);
		
		JButton btnsacar = new JButton("Sacar");
		btnsacar.setBounds(387, 237, 89, 23);
		contentPane.add(btnsacar);
		
		JLabel lblNumerodoBanco = new JLabel("Número do Banco:");
		lblNumerodoBanco.setBounds(10, 11, 113, 23);
		contentPane.add(lblNumerodoBanco);
		
		txtNumeroBanco = new JTextField();
		txtNumeroBanco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
		
				if(txtNumeroBanco.getText().equals("") || txtNumeroBanco.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null,"Número banco obrigatório");
					txtNumeroBanco.setFocusable(true);
					txtNumeroBanco.requestFocus();
				}
			}
		});
		txtNumeroBanco.setBounds(10, 45, 86, 20);
		contentPane.add(txtNumeroBanco);
		txtNumeroBanco.setColumns(10);
		
		JLabel lblAgencia = new JLabel("Agência:");
		lblAgencia.setBounds(10, 76, 101, 23);
		contentPane.add(lblAgencia);
		
		txtAgencia = new JTextField();
		txtAgencia.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtAgencia.getText().equals("") || txtAgencia.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null,"Número Agência obrigatório");
					txtAgencia.setFocusable(true);
					txtAgencia.requestFocus();
				}
			}
		});
		txtAgencia.setColumns(10);
		txtAgencia.setBounds(10, 110, 113, 20);
		contentPane.add(txtAgencia);
		
		JLabel lblConta = new JLabel("Conta:");
		lblConta.setBounds(139, 11, 101, 23);
		contentPane.add(lblConta);
		
		txtConta = new JTextField();
		txtConta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtConta.getText().equals("") || txtConta.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null,"Número Conta obrigatório");
					txtConta.setFocusable(true);
					txtConta.requestFocus();
				}
			}
		});
		txtConta.setColumns(10);
		txtConta.setBounds(124, 45, 101, 20);
		contentPane.add(txtConta);
		
		JLabel lblTitular = new JLabel("Titular:");
		lblTitular.setBounds(10, 141, 101, 23);
		contentPane.add(lblTitular);
		
		txtTitular = new JTextField();
		txtTitular.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtTitular.getText().equals("") || txtTitular.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null,"Número Titular obrigatório");
					txtTitular.setFocusable(true);
					txtTitular.requestFocus();
				}
			}
		});
		txtTitular.setColumns(10);
		txtTitular.setBounds(10, 174, 492, 20);
		contentPane.add(txtTitular);
		
		JLabel lblSaldo = new JLabel("Saldo Inicial:");
		lblSaldo.setBounds(293, 11, 101, 23);
		contentPane.add(lblSaldo);
		
		txtSaldoInicial = new JTextField();
		txtSaldoInicial.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtSaldoInicial.getText().equals("") || txtSaldoInicial.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null,"Número Saldo Inicial obrigatório");
					txtSaldoInicial.setFocusable(true);
					txtSaldoInicial.requestFocus();
				}
			}
		});
		txtSaldoInicial.setColumns(10);
		txtSaldoInicial.setBounds(276, 45, 156, 20);
		contentPane.add(txtSaldoInicial);
		
		JLabel lblRendimento = new JLabel("Rendimento:");
		lblRendimento.setBounds(293, 76, 101, 23);
		contentPane.add(lblRendimento);
		
		txtRendimento = new JTextField();
		txtRendimento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtRendimento.getText().equals("") || txtRendimento.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null,"Número Rendimento obrigatório");
					txtRendimento.setFocusable(true);
					txtRendimento.requestFocus();
				}
				btnVerificarSaldo.setText("Abrir Conta");
				btnVerificarSaldo.setEnabled(true);
			}
		});
		txtRendimento.setColumns(10);
		txtRendimento.setBounds(276, 110, 156, 20);
		contentPane.add(txtRendimento);
		
		textValor = new JTextField();
		textValor.setText("Valor:");
		textValor.setBounds(10, 271, 156, 125);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		btnVerificaSaldo = new JButton("Verificar Saldo");
		btnVerificaSaldo.setBounds(24, 237, 113, 23);
		contentPane.add(btnVerificaSaldo);
	}
}
