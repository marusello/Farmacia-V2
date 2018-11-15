package br.ifsp.farmacia.visao;

import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;


import br.ifsp.farmacia.controle.CadastrarCaixaCtrl;
import br.ifsp.farmacia.modelo.Caixa;
import br.ifsp.farmacia.modelo.Funcionario;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CaixaUI {

	JFrame frameCax;
	private JTextField txtValor;
	

	public CaixaUI() {
		
		frameCax = new JFrame("Caixa");
		frameCax.setSize(358, 212);
		frameCax.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameCax.setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblOperador = new JLabel("Operador:  ");
		lblOperador.setBounds(10, 11, 105, 14);
		panel.add(lblOperador);
		
		
		CadastrarCaixaCtrl cf = new CadastrarCaixaCtrl();
		ArrayList<Funcionario> arrayFuncionario  = cf.obterFuncionario();
		
		JComboBox <Funcionario> cbOperador = new JComboBox<Funcionario>();
		cbOperador.setBounds(10, 30, 123, 20);
		
		for (Funcionario fun : arrayFuncionario) {
			cbOperador.addItem(fun);
		}
		panel.add(cbOperador);
		panel.add(cbOperador);
		
		JButton btnFecharCaixa = new JButton("Fechar Caixa");
		btnFecharCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null,"Caixa Fechado!\n");
				new RelatorioVendaUI();
				frameCax.dispose();
				
			}
		});
		btnFecharCaixa.setBounds(125, 83, 105, 61);
		panel.add(btnFecharCaixa);
		
		JButton btnAbrirCaixa = new JButton("Abrir Caixa");
		btnAbrirCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Caixa cax = new Caixa();
				cax.setEstado(true);
				cax.setValorTotal(Double.parseDouble(txtValor.getText()));
				Funcionario fu = (Funcionario) cbOperador.getSelectedItem();
				cax.setOperadorId(fu);			
				//cax.setFunId(Integer.parseInt(cbOperador.getSelectedItem().toString()));
				
				CadastrarCaixaCtrl cx = new CadastrarCaixaCtrl();
				cx.gravaCaixa(cax);
				
				JOptionPane.showMessageDialog(null,"Caixa Aberto!\n");
				frameCax.dispose();
				new VendaUI();
				
			}
		});
		btnAbrirCaixa.setBounds(10, 83, 105, 61);
		panel.add(btnAbrirCaixa);
		
		JLabel lblValorInicial = new JLabel("Valor Inicial:");
		lblValorInicial.setBounds(143, 11, 95, 14);
		panel.add(lblValorInicial);
		
		txtValor = new JTextField();
		txtValor.setBounds(143, 30, 86, 20);
		panel.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CaixaUI.class.getResource("/br/ifsp/farmacia/imagem/018-pills.png")));
		label.setBounds(237, 30, 105, 133);
		panel.add(label);
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setBounds(248, 11, 46, 14);
		panel.add(lblEstado);
		
		frameCax.setVisible(true);
	}
}
