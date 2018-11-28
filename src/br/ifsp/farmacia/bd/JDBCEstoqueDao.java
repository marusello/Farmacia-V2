package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//import br.ifsp.farmacia.modelo.Cliente;
import br.ifsp.farmacia.modelo.Estoque;

/**
 * Documentação da Classe JDBCEstoqueDao
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class JDBCEstoqueDao implements EstoqueDao {

	/**
	 * Documentação do método gravaEstoque
	 * @param estoque the estoque to set
	 * 
	 * Para inserir estoque
	 */
	@Override
	public void gravaEstoque(Estoque estoque) {
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "INSERT INTO estoque (nomeProduto, quantidade)" + "VALUES (?, ?);";
		
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			comando.setInt(1, estoque.getNomeProduto().getId_medicamento());			
			comando.setInt(2, estoque.getQuantidade());		
			
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
	 * Documentação do método obterEstoque
	 * @return the listaEstoque
	 * 
	 * Para listar o estoque usando ArrayList
	 */
	@Override
	public ArrayList<Estoque> obterEstoque() {
		try {
			System.out.println (" Abrindo conexão ... ");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "SELECT * FROM estoque;";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			System.out.println(" Executando comando ... ");
			ResultSet resultado = comando.executeQuery();
			
			ArrayList<Estoque> listaEstoque = new ArrayList<Estoque>();
			
			System.out.println(" Resultados encontrados : \n");
			
			while (resultado.next()) {
				System.out.printf("%d : %d", 
						//resultado.getInt("idLoote"), 
						resultado.getInt("quantidade"));
				
				Estoque c = new Estoque();
				//c.setIdLote(resultado.getInt("idLote"));
				//c.setNomeProdute(resultado.getInt("nomeProduto"));
				c.setQuantidade(resultado.getInt("quantidade"));
			
				
				listaEstoque.add(c);
			}
			
			System.out.println("\n Fechando conexão ... ");
			conexao . close ();
			
			return listaEstoque;//retorna a lista de estoque
			
		} catch ( Exception e) {
			e. printStackTrace ();
			return null;
		}
	}

	@Override
	public Estoque obterEstoque(int idLote) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Documentação do método AtualizarEstoque
	 * @param estoque the estoque to set
	 * 
	 * Para ataualizar o estoque
	 */
	@Override
	public void AtualizarEstoque(Estoque estoque) {
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "UPDATE farmacia.estoque SET quantidade = ? WHERE nomeProduto = ?;" ;
		
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			comando.setInt(1, estoque.getQuantidade());	
			comando.setInt(2, estoque.getNomeProduto().getId_medicamento());			
				
			
			System.out.println(" Executando comando ... ");
			comando.execute();
			
			System.out.println(" Fechando conexão ... ");
			conexao.close();
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
