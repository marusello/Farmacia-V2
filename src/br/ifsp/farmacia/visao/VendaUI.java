package br.ifsp.farmacia.visao;

import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VendaUI  {

	JFrame frameVenda;
	
	public VendaUI() {
		
		frameVenda = new JFrame("Venda");
		frameVenda.setSize(288, 296);
		frameVenda.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameVenda.setContentPane(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RelatorioVendaUI.class.getResource("/br/ifsp/farmacia/imagem/breve.png")));
		label.setBounds(10, 0, 262, 247);
		panel.add(label);
		
		frameVenda.setVisible(true);
	}

}
