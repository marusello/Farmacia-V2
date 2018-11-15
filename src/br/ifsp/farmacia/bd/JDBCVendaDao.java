package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Venda;

public class JDBCVendaDao implements VendaDao {

	@Override
	public void gravaVenda(Venda venda) {
		try {
			System.out.println(" Abrindo conexão ... ");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "INSERT INTO venda (produto, quantidade, subTotal, valorTotal, clienteEspecial)" + " VALUES (?, ?, ?, ?, ?)";
			
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

	@Override
	public ArrayList<Venda> obterVenda() {
		return null;
	}

	@Override
	public Venda obterVenda(int idVenda) {
		// TODO Auto-generated method stub
		return null;
	}

}
