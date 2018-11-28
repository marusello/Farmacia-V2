package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Venda;

/**
 * Documentação da Classe JDBCVendaDao
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class JDBCVendaDao implements VendaDao {

	/**
	 * Documentação do método gravaVenda
	 * @param venda the venda to set
	 * 
	 * Para inserir venda
	 */
	@Override
	public void gravaVenda(Venda venda) {
		try {
			System.out.println(" Abrindo conexão ... ");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "INSERT INTO venda (produto, quantidade, subTotal, valorTotal, id_cliente)" + " VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			comando.setInt(1, venda.getMedicamento().getId_medicamento());
			comando.setInt(2, venda.getQuantidade());
			comando.setDouble(3, venda.getSubTotal());
			comando.setDouble(4, venda.getValorTotal());
			comando.setInt(5, venda.getCliente().getIdCliente());
			
			System.out.println(" Executando comando ... ");
			comando.execute();
			
			System.out.println(" Fechando conexão ... ");
			conexao.close();
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Documentação do método obterVenda
	 * @return the listaVendas
	 * 
	 * Para listar as vendas usando ArrayList
	 */
	@Override
	public ArrayList<Venda> obterVenda() {
		
		try {
			
			System.out.println("Abrindo conexao...");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "SELECT * FROM venda;";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			System.out.println("Executando comando...");
			ResultSet resultado = comando.executeQuery();
			
			ArrayList<Venda> listaVendas = new ArrayList<Venda>();
			
			System.out.println(" Resultados encontrados: \n" );
			
			while (resultado.next()) {
				System.out.printf("%d : %d - %.2f - %.2f  \n",
					resultado.getInt("codVenda"),
					resultado.getInt("quantidade"),
					resultado.getDouble("subTotal"),
					resultado.getDouble("valortotal"));				
				
				Venda v = new Venda();
				v.setCodVenda(resultado.getInt("codVenda"));
				v.setQuantidade(resultado.getInt("quantidade"));
				v.setSubTotal(resultado.getDouble("subTotal"));
				v.setValorTotal(resultado.getDouble("valortotal"));
				
				listaVendas.add(v);
			}
			
			System.out.println("\n Fechando conexao...");
			conexao.close();
			
			return listaVendas;
		}
		
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 
	

	@Override
	public Venda obterVenda(int idVenda) {
		
		return null;
	}

}
