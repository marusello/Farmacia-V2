package br.ifsp.farmacia.visao;

import javax.swing.JFrame;

import br.ifsp.farmacia.bd.Acesso;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class LoginUI {
	
	public static void main(String[] args) {
		
		// Criando o JFrame
		JFrame frmLogin = new JFrame("Farmacia");
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginUI.class.getResource("/br/ifsp/farmacia/imagem/048-insurance.png")));
		frmLogin.setTitle("Sistema de Software | Farmacia");
		frmLogin.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frmLogin.setSize(444, 377);
		frmLogin.setLocationRelativeTo(null);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN:");
		lblLogin.setBounds(163, 174, 46, 14);
		frmLogin.getContentPane().add(lblLogin);
		
		JTextField txtLogin = new JTextField();
		txtLogin.setBounds(212, 171, 176, 20);
		frmLogin.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(163, 205, 46, 14);
		frmLogin.getContentPane().add(lblSenha);
		
		JPasswordField pwdSenha = new JPasswordField();
		pwdSenha.setBounds(212, 202, 176, 20);
		frmLogin.getContentPane().add(pwdSenha);
		
		/** BOTÃO ENTRAR **/
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				Acesso acesso = new Acesso();
				
				acesso.Logar(txtLogin.getText(), pwdSenha.getText());
				
				if(acesso.permissao == true) {
					new MenuPrincipalUI();
					frmLogin.dispose();
				}
				
				if(acesso.permissao == false) {
					txtLogin.setText("");
					pwdSenha.setText("");
					txtLogin.requestFocus();
				}
				
				acesso.permissao = false;
			}
		});
		btnEntrar.setBounds(163, 260, 107, 23);
		frmLogin.getContentPane().add(btnEntrar);
		
		/** BOTÃO CANCELAR **/
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		btnCancelar.setBounds(281, 260, 107, 23);
		frmLogin.getContentPane().add(btnCancelar);
		
		JLabel lblFarmcia = new JLabel("Farmácia POO");
		lblFarmcia.setForeground(new Color(0, 128, 0));
		lblFarmcia.setFont(new Font("Calibri", Font.BOLD, 60));
		lblFarmcia.setBackground(new Color(255, 69, 0));
		lblFarmcia.setBounds(21, 45, 397, 115);
		frmLogin.getContentPane().add(lblFarmcia);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginUI.class.getResource("/br/ifsp/farmacia/imagem/024-pharmacist.png")));
		label.setBounds(31, 171, 107, 122);
		frmLogin.getContentPane().add(label);
		
		frmLogin.setVisible(true);
		}
}
