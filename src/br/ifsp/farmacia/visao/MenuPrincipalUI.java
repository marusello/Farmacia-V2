package br.ifsp.farmacia.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MenuPrincipalUI {

	public MenuPrincipalUI() {
		
		// Criando o JFrame
		JFrame frame = new JFrame("Farmacia");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setSize(669, 557);
		frame.setLocationRelativeTo(null);
		
		// Criando o MenuBar
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(
				new BevelBorder(BevelBorder.RAISED));
		
		JMenu menuCadastro = new JMenu("Cadastro");
		JMenu menuRelatorio = new JMenu("Relatorios");
		
		// Criando o MenuItem 
		JMenuItem menuItemClientes = new JMenuItem("Medicamento");
		menuItemClientes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Cadastro não existe");
			 new CadastroMedicamentosUI();
			
			}
		});
		menuCadastro.add(menuItemClientes);
		
		// Criando o MenuItem com Evento para executar 
		// o Cadastro 
		JMenuItem menuItemContas = new JMenuItem("Cliente");  
		menuItemContas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new CadastroClienteUI();
			}
		});
		
		menuCadastro.add(menuItemContas);
		
		// Criando o MenuItem com Evento 
		// para executar a Lista 
		JMenuItem menuItemListaClientes = new JMenuItem("Relatorio de vendas");  
		menuItemListaClientes.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				new RelatorioVendaUI();
			}
		});  
		menuRelatorio.add(menuItemListaClientes);
		
		JMenuItem mntmFuncionario = new JMenuItem("Funcionario");
		mntmFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CadastroFuncionarioUI();
			}
		});
		menuCadastro.add(mntmFuncionario);

		JMenuItem mntmEstoque = new JMenuItem("Estoque");
		mntmEstoque.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastrarEstoqueUI();
			}
		});
		menuCadastro.add(mntmEstoque);
		
		menuCadastro.addSeparator();
		
		// Criando o MenuItem Sair com Evento para sair da aplicação
		JMenuItem menuItemSair = new JMenuItem("Sair"); 
		menuItemSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		menuCadastro.add(menuItemSair);
		
		// Adicionando JMenu no JMenuBar
		menuBar.add(menuCadastro);
		
		JMenu mnNewMenu = new JMenu("Caixa");
		
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmTeste = new JMenuItem("caixa");
		mntmTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CaixaUI();
			}
		});
		mnNewMenu.add(mntmTeste);
		menuBar.add(menuRelatorio);
		
		// Adicionando o JMenuBar no JFrame
		frame.setJMenuBar(menuBar);
		
		JMenu mnVenda = new JMenu("Venda");
		menuBar.add(mnVenda);
		
		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new VendaUI();
			}
		});
		mnVenda.add(mntmVenda);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuPrincipalUI.class.getResource("/br/ifsp/farmacia/imagem/logo.png")));
		lblNewLabel.setBounds(10, 11, 703, 485);
		frame.getContentPane().add(lblNewLabel);
		
		frame.setVisible(true);
	}
}