package br.ifsp.farmacia.visao;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.ifsp.farmacia.controle.AtualizarEstoqueCtrl;
import br.ifsp.farmacia.modelo.Estoque;
import br.ifsp.farmacia.modelo.Medicamento;

import javax.swing.JComboBox;

public class AtualizarEstoqueUI {

	JFrame frameCli;
	private JTextField txtQuantidade;
	
	public AtualizarEstoqueUI() {
		
		frameCli = new JFrame("Cadastro de Clientes");
		frameCli.setSize(288, 238);
		frameCli.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameCli.setContentPane(panel);
		panel.setLayout(null);
		
				
		JLabel lblMedicamento = new JLabel("Medicamento");
		lblMedicamento.setBounds(10, 11, 106, 14);
		panel.add(lblMedicamento);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(10, 72, 51, 20);
		panel.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade");
		lblNewLabel_1.setBounds(10, 56, 90, 14);
		panel.add(lblNewLabel_1);
		
		AtualizarEstoqueCtrl ce = new AtualizarEstoqueCtrl();
		ArrayList<Medicamento> arrayMedicamento  = ce.obterMedicamento();
		
		JComboBox <Medicamento> cbMedicamento = new JComboBox<Medicamento>();
		
		for (Medicamento medicamento : arrayMedicamento) {
			cbMedicamento.addItem(medicamento);
		}
		cbMedicamento.setBounds(10, 25, 238, 20);
		panel.add(cbMedicamento);
		
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Estoque es = new Estoque();
				
				Medicamento medicamento = (Medicamento) cbMedicamento.getSelectedItem();
				es.setNomeProduto(medicamento);
				
				es.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
				
				
				ce.AtualizarEstoque(es);
				JOptionPane.showMessageDialog(null,"Produto Atualizado!\n");			
				}
		});
		btnAtualizar.setBounds(10, 118, 106, 51);
		panel.add(btnAtualizar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(150, 118, 98, 51);
		panel.add(btnCancelar);
		
		frameCli.setVisible(true);


	}
}
