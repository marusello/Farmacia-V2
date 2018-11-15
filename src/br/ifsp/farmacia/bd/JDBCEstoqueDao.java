package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Estoque;


public class JDBCEstoqueDao implements EstoqueDao {

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

	@Override
	public ArrayList<Estoque> obterEstoque() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estoque obterEstoque(int idLote) {
		// TODO Auto-generated method stub
		return null;
	}

}
