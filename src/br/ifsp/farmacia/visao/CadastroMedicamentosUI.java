package br.ifsp.farmacia.visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import br.ifsp.farmacia.controle.CadastrarMedicamentoCtrl;
import br.ifsp.farmacia.modelo.Medicamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.sql.rowset.spi.TransactionalWriter;
import javax.swing.ImageIcon;
import java.awt.SystemColor;


public class CadastroMedicamentosUI{

	private JTextField txtNome;
	private JTextField txtcodBarras;
	private JTextField txtValor;
	private JTextField txtDescricao;
	private JTable tbListaMedicamento;

	JFrame frameMed;
	private JTable tbLista;
	
	public CadastroMedicamentosUI() {		
		
		frameMed = new JFrame("Cadastro de Medicamentos");
		frameMed.setSize(400, 439);
		frameMed.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		frameMed.setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblNomeMed = new JLabel("Nome do Medicamento:");
		lblNomeMed.setBounds(10, 8, 158, 14);
		panel.add(lblNomeMed);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 31, 149, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCodigoDeBarras = new JLabel("Codigo de Barras:");
		lblCodigoDeBarras.setBounds(10, 62, 112, 14);
		panel.add(lblCodigoDeBarras);
		
		txtcodBarras = new JTextField();
		txtcodBarras.setBounds(10, 87, 101, 20);
		panel.add(txtcodBarras);
		txtcodBarras.setColumns(10);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(201, 8, 59, 14);
		panel.add(lblStatus);
		
		JRadioButton rbAtivo = new JRadioButton("Ativo");
		rbAtivo.setBounds(201, 30, 72, 23);
		panel.add(rbAtivo);
		
		JRadioButton rbInativo = new JRadioButton("Inativo");
		rbInativo.setBounds(201, 58, 72, 23);
		panel.add(rbInativo);
				
		JLabel lblValorUnit = new JLabel("Valor Unit:");
		lblValorUnit.setBounds(121, 62, 59, 14);
		panel.add(lblValorUnit);
		
		txtValor = new JTextField();
		txtValor.setBounds(121, 87, 59, 20);
		panel.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(10, 118, 72, 14);
		panel.add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(10, 143, 101, 20);
		panel.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(174, 143, 86, 54);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int msg = 0;
				try {					
					Medicamento med = new Medicamento();
					
				
					med.setNome_medicamento(txtNome.getText());
					
					med.setDescricao_medicamento(txtDescricao.getText());
					med.setNumeracao_medicamento(txtcodBarras.getText());
					med.setValor_unit(Double.parseDouble(txtValor.getText()));
					
					if(rbAtivo.isSelected() == true) 
					med.setStatus(true);
					
					else 
						med.setStatus(false);
					
			
					
				
					CadastrarMedicamentoCtrl cm = new CadastrarMedicamentoCtrl();
					cm.gravarMedicamento(med);
					JOptionPane.showMessageDialog(null,"Medicamento salvo!\n");	
					}
			
				
				 catch (IllegalArgumentException e) {	
					
					JOptionPane.showMessageDialog(null, "Campo vazio");
					
				}
				
				
				
				
				}
		});
		
		
		panel.add(btnSalvar);
		
		tbListaMedicamento = new JTable();
		tbListaMedicamento.setBounds(344, 69, 0, 0);
		panel.add(tbListaMedicamento);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setBounds(270, 143, 98, 54);
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((DefaultTableModel) tbLista.getModel()).removeRow(tbLista.getSelectedRow());
			}
		});
		panel.add(btnApagar);
		
		JLabel lblListaDeMedicamentos = new JLabel("Lista de Medicamentos:");
		lblListaDeMedicamentos.setBounds(10, 196, 158, 14);
		panel.add(lblListaDeMedicamentos);
		
		
		
		
		CadastrarMedicamentoCtrl cm = new CadastrarMedicamentoCtrl();
		ArrayList<Medicamento> listaMedicamento = cm.obterMedicamentos();
		
		String[] colunas = new String []{"ID","Nome", "Descricao"};
				
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(colunas);
			
		for (Medicamento med : listaMedicamento) {
			String[] linha = 
					new String[]{String.valueOf(med.getId_medicamento()), 
							med.getNome_medicamento(), med.getDescricao_medicamento()};
			modelo.addRow(linha);
		}
		
		tbLista = new JTable(modelo);
		tbLista.setBounds(10, 210, 364, 171);
		panel.add(tbLista);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastroMedicamentosUI.class.getResource("/br/ifsp/farmacia/imagem/036-medicine-8.png")));
		label.setBounds(269, 8, 105, 119);
		panel.add(label);
		

		frameMed.setVisible(true);
	}
}
