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

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
		frameCli.setSize(369, 328);
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
		lblCpf.setBounds(10, 170, 46, 14);
		panel.add(lblCpf);

		lblDataNasc = new JLabel("Data Nasc:");
		lblDataNasc.setBounds(10, 122, 86, 14);
		panel.add(lblDataNasc);

		lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 55, 46, 14);
		panel.add(lblEmail);

		JLabel lblEmaiMsg = new JLabel("");
		lblEmaiMsg.setBounds(10, 90, 148, 14);
		panel.add(lblEmaiMsg);

		txtEmail = new JTextField();
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if ((txtEmail.getText().contains("@")) && (txtEmail.getText().contains("."))
						&& (!txtEmail.getText().contains(" "))) {
					
					String usuario = new String(txtEmail.getText().substring(0, txtEmail.getText().lastIndexOf('@')));
					String dominio = new String(txtEmail.getText().substring(txtEmail.getText().lastIndexOf('@') + 1,
							txtEmail.getText().length()));

					if ((usuario.length() >= 1) && (!usuario.contains("@")) && (dominio.contains("."))
							&& (!dominio.contains("@")) && (dominio.indexOf(".") >= 1)
							&& (dominio.lastIndexOf(".") < dominio.length() - 1)) {
						
						lblEmaiMsg.setText("E-mail válido");
						lblEmaiMsg.setForeground(Color.green);
						

					} else {

						lblEmaiMsg.setText("E-mail Inválido");
						lblEmaiMsg.setForeground(Color.red);

						txtEmail.requestFocus();
					}

				} else {

					lblEmaiMsg.setText("E-mail Inválido");
					lblEmaiMsg.setForeground(Color.red);

					txtEmail.requestFocus();
				}
			}
		});
		txtEmail.setBounds(10, 70, 148, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cli = new Cliente();

				try {

					cli.setNome(txtNome.getText());
					
					cli.setCpf(txtCPF.getText());					
					
					cli.setEmail(txtEmail.getText());
					cli.setDataNasc(txtData.getText());

					CadastrarClientesCtrl cl = new CadastrarClientesCtrl();
					cl.gravarCliente(cli);
					JOptionPane.showMessageDialog(null, "Cliente salvo!\n");

				} catch (IllegalArgumentException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());

				}
			}
		});
		btnSalvar.setBounds(10, 237, 106, 40);
		panel.add(btnSalvar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(161, 237, 98, 40);
		panel.add(btnCancelar);

		txtCPF = new JTextField();
		txtCPF.setBounds(10, 184, 120, 20);
		panel.add(txtCPF);
		txtCPF.setColumns(10);

		txtData = new JTextField();
		txtData.setBounds(10, 139, 120, 20);
		panel.add(txtData);
		txtData.setColumns(10);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastroClienteUI.class.getResource("/br/ifsp/farmacia/imagem/048-insurance.png")));
		label.setBounds(199, 11, 176, 220);
		panel.add(label);

		frameCli.setVisible(true);
	}
}
