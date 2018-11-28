package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Cliente;

public class JDBCClienteDao implements ClienteDao {

	@Override
	public void gravaCliente(Cliente cliente) {
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "INSERT INTO cliente (nome, cpf, email, dataNasc)" + "VALUES ( ?, ?,?, ?)";
		
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			comando.setString(1, cliente.getNome());			
			comando.setString(2, cliente.getCpf());			
			comando.setString(3, cliente.getEmail());
			comando.setString(4, cliente.getDataNasc());
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
	public ArrayList<Cliente> obterClientes() {
		try {
			System.out.println (" Abrindo conexão ... ");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "SELECT * FROM cliente;";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			System.out.println(" Executando comando ... ");
			ResultSet resultado = comando.executeQuery();
			
			ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
			
			System.out.println(" Resultados encontrados : \n");
			
			while (resultado.next()) {
				System.out.printf("%d : %s - %s - %s - %s \n", 
						resultado.getInt("idCliente"), 
						resultado.getString("nome"), 
						resultado.getString("cpf"), 
						resultado.getString("dataNasc"),
						resultado.getString("email"));
				
				Cliente c = new Cliente();
				c.setIdCliente(resultado.getInt("idCliente"));
				c.setNome(resultado.getString("nome"));
				c.setCpf(resultado.getString("cpf"));
				c.setDataNasc(resultado.getString("dataNasc"));
				c.setEmail(resultado.getString("email"));
				
				listaCliente.add(c);//adiciona o cliente criado acima na lista 
			}
			
			System.out.println("\n Fechando conexão ... ");
			conexao . close ();
			
			return listaCliente;//retorna a lista de clientes
			
		} catch ( Exception e) {
			e. printStackTrace ();
			return null;
		}
	}

	@Override
	public Cliente obterCliente(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
