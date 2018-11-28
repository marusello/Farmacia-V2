package br.ifsp.farmacia.visao;

import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import br.ifsp.farmacia.controle.CadastrarCaixaCtrl;
import br.ifsp.farmacia.controle.VendaCtrl;
import br.ifsp.farmacia.modelo.Cliente;
import br.ifsp.farmacia.modelo.Funcionario;
import br.ifsp.farmacia.modelo.Medicamento;
import br.ifsp.farmacia.modelo.Venda;

import java.awt.Color;
import javax.swing.JRadioButton;

public class VendaUI  {

	JFrame frameVenda;
	private JTextField txtCodVenda;
	private JTextField txtQtd;
	private JTable table;
	private JTable tbVenda;
	private JTextField txtTotalVenda;
	
	public VendaUI() {
		
		frameVenda = new JFrame("Venda");
		frameVenda.setSize(410, 372);
		frameVenda.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameVenda.setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblCodVenda = new JLabel("Cod Venda:");
		lblCodVenda.setBounds(10, 11, 76, 14);
		panel.add(lblCodVenda);
		
		txtCodVenda = new JTextField();
		txtCodVenda.setEditable(false);
		txtCodVenda.setBounds(96, 8, 47, 20);
		panel.add(txtCodVenda);
		txtCodVenda.setColumns(10);
		
		JLabel lblMedicamento = new JLabel("Medicamento:");
		lblMedicamento.setBounds(29, 47, 114, 14);
		panel.add(lblMedicamento);
		
		VendaCtrl cv = new VendaCtrl();
		ArrayList<Medicamento> arrayMedicamento  = cv.obterMedicamento();
		
		JComboBox<Medicamento> cbMedicamento = new JComboBox<Medicamento>();
		cbMedicamento.setBounds(144, 44, 92, 20);
		
		for (Medicamento med : arrayMedicamento) {
			cbMedicamento.addItem(med);			
		}
		
		panel.add(cbMedicamento);		
		
		JLabel lblClienteEspecial = new JLabel("Cliente Especial:");
		lblClienteEspecial.setBounds(29, 83, 105, 14);
		panel.add(lblClienteEspecial);
		
		ArrayList<Cliente> arrayCliente  = cv.obterClientes();
		
		JComboBox<Cliente> cbCliente = new JComboBox<Cliente>();
		cbCliente.setBounds(144, 80, 92, 20);
		
		for (Cliente cli : arrayCliente) {
			cbCliente.addItem(cli);			
		}
		
		panel.add(cbCliente);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(246, 47, 73, 14);
		panel.add(lblQuantidade);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(323, 44, 47, 20);
		panel.add(txtQtd);
		txtQtd.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(281, 79, 89, 23);
		panel.add(btnInserir);
		
		table = new JTable();
		table.setBounds(43, 280, 276, -128);
		panel.add(table);
		
		tbVenda = new JTable();
		tbVenda.setBorder(new LineBorder(new Color(0, 0, 0)));
		tbVenda.setBounds(10, 120, 362, 132);
		panel.add(tbVenda);
		
		JRadioButton rbCartao = new JRadioButton("Cart\u00E3o");
		rbCartao.setBounds(36, 259, 77, 23);
		panel.add(rbCartao);
		
		JRadioButton rbDinheiro = new JRadioButton("Dinheiro");
		rbDinheiro.setBounds(115, 259, 77, 23);
		panel.add(rbDinheiro);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setBounds(205, 263, 55, 14);
		panel.add(lblTotal);
		
		txtTotalVenda = new JTextField();
		txtTotalVenda.setBounds(259, 260, 72, 20);
		panel.add(txtTotalVenda);
		txtTotalVenda.setColumns(10);
		
		frameVenda.setVisible(true);
	}
}
