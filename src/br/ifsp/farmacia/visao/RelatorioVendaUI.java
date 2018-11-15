package br.ifsp.farmacia.visao;

import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RelatorioVendaUI  {


	JFrame frameRe;
	
	public RelatorioVendaUI() {
		
	
		frameRe = new JFrame("Relatorio de Vendas");
		frameRe.setSize(288, 296);
		frameRe.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameRe.setContentPane(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RelatorioVendaUI.class.getResource("/br/ifsp/farmacia/imagem/breve.png")));
		label.setBounds(10, 0, 262, 247);
		panel.add(label);
		
		frameRe.setVisible(true);

	}
}
