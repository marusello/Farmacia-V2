package br.ifsp.farmacia.visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ifsp.farmacia.bd.Acesso;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.Font;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField pwdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Users\\User\\Desktop\\workspace\\FarmaciaLogin\\src\\imagem\\hospital-2_icon-icons.com_66067.png"));
		setTitle("Sistema de Software | Farm\u00E1cia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN:");
		lblLogin.setBounds(166, 145, 46, 14);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(215, 142, 176, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(166, 176, 46, 14);
		contentPane.add(lblSenha);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setBounds(215, 173, 176, 20);
		contentPane.add(pwdSenha);
		
		/** BOTÃO ENTRAR **/
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso acesso = new Acesso();
				
				acesso.Logar(txtLogin.getText(), pwdSenha.getText());
				
				if(acesso.permissao == true) {
					MenuPrincipalUI home = new MenuPrincipalUI();
					home.show();
					home.setExtendedState(new MenuPrincipalUI().MAXIMIZED_BOTH);
					dispose();
				}
				
				if(acesso.permissao == false) {
					txtLogin.setText("");
					pwdSenha.setText("");
					txtLogin.requestFocus();
				}
				
				acesso.permissao = false;
			}
		});
		btnEntrar.setBounds(166, 217, 107, 23);
		contentPane.add(btnEntrar);
		
		/** BOTÃO CANCELAR **/
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		btnCancelar.setBounds(284, 217, 107, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblFarmcia = new JLabel("Farm\u00E1cia");
		lblFarmcia.setForeground(new Color(0, 128, 0));
		lblFarmcia.setFont(new Font("BlackJack", Font.BOLD, 93));
		lblFarmcia.setBackground(new Color(255, 69, 0));
		lblFarmcia.setBounds(24, 16, 389, 115);
		contentPane.add(lblFarmcia);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/imagem/024-pharmacist.png")));
		label.setBounds(34, 128, 112, 123);
		contentPane.add(label);
	}
}
