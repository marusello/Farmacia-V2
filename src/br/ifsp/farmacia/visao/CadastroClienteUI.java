package br.ifsp.farmacia.visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import br.ifsp.farmacia.controle.CadastrarClientesCtrl;
import br.ifsp.farmacia.modelo.Cliente;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class CadastroClienteUI {


	JFrame frameCli;
	private JTextField txtNome;
	private JLabel lblDataNasc;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtData;
	
	public CadastroClienteUI() {
		
		frameCli = new JFrame("Cadastro de Clientes");
		frameCli.setSize(288, 296);
		frameCli.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameCli.setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 86, 14);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 24, 148, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 52, 46, 14);
		panel.add(lblCpf);
		
		lblDataNasc = new JLabel("Data Nasc:");
		lblDataNasc.setBounds(10, 91, 86, 14);
		panel.add(lblDataNasc);
		
		lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 139, 46, 14);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 154, 148, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cli = new Cliente();
				cli.setNome(txtNome.getText());
				cli.setCpf(txtCPF.getText());
				cli.setEmail(txtEmail.getText());
				cli.setDataNasc(txtData.getText());
				CadastrarClientesCtrl cl = new CadastrarClientesCtrl();
				cl.gravarCliente(cli);
				JOptionPane.showMessageDialog(null,"Cliente salvo!\n");			}
		});
		btnSalvar.setBounds(10, 207, 106, 40);
		panel.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(144, 207, 98, 40);
		panel.add(btnCancelar);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(10, 66, 120, 20);
		panel.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtData = new JTextField();
		txtData.setBounds(10, 108, 120, 20);
		panel.add(txtData);
		txtData.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastroClienteUI.class.getResource("/br/ifsp/farmacia/imagem/048-insurance.png")));
		label.setBounds(164, 24, 98, 129);
		panel.add(label);
		
		frameCli.setVisible(true);
	}
}
