package br.ifsp.farmacia.visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.ifsp.farmacia.controle.CadastrarFuncionarioCtrl;
import br.ifsp.farmacia.modelo.Funcionario;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class CadastroFuncionarioUI {

	JFrame frameFun;

	private JTextField txtNome;

	public CadastroFuncionarioUI() {

		frameFun = new JFrame("Cadastro de Funcionario");
		frameFun.setSize(413, 164);
		frameFun.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameFun.setContentPane(panel);
		panel.setLayout(null);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 11, 69, 14);
		panel.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(10, 27, 252, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 58, 69, 14);
		panel.add(lblCargo);

		JComboBox<String> cbCargo = new JComboBox<String>();
		cbCargo.setBounds(51, 58, 89, 20);
		panel.add(cbCargo);
		frameFun.setVisible(true);

		cbCargo.removeAllItems();
		cbCargo.addItem("");
		cbCargo.addItem("Funcionario");
		cbCargo.addItem("Gerente");

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Funcionario fu = new Funcionario();
				try {
					
					fu.setCargo(cbCargo.getSelectedItem().toString());					
					fu.setNome(txtNome.getText());
					
					CadastrarFuncionarioCtrl cfl = new CadastrarFuncionarioCtrl();
					cfl.gravaFuncionario(fu);

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}

			}
		});

		btnSalvar.setBounds(162, 85, 100, 31);
		panel.add(btnSalvar);

		JLabel label = new JLabel("");
		label.setIcon(
				new ImageIcon(CadastroFuncionarioUI.class.getResource("/br/ifsp/farmacia/imagem/024-pharmacist.png")));
		label.setBounds(273, 0, 114, 116);
		panel.add(label);

	}
}
