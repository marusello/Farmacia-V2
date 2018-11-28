package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.ifsp.farmacia.modelo.Medicamento;

public class JDBCMedicamentoDao implements MedicamentoDao {

	@Override
	public void gravaMedicamento(Medicamento medicamento) {
		try {
			System.out.println(" Abrindo conexão ... ");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "INSERT INTO medicamento (nome, estado, descricao, codBarras, valorUnit)" + " VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			comando.setString(1, medicamento.getNome_medicamento());
			comando.setBoolean(2, medicamento.isStatus());
			comando.setString(3, medicamento.getDescricao_medicamento());
			comando.setString(4, medicamento.getNumeracao_medicamento());
			comando.setDouble(5, medicamento.getValor_unit());
			
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
	public ArrayList<Medicamento> obterMedicamento() {
		
		try {
			
			System.out.println("Abrindo conexao...");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "SELECT * FROM medicamento;";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			System.out.println("Executando comando...");
			ResultSet resultado = comando.executeQuery();
			
			ArrayList<Medicamento> listaMedicamentos = new ArrayList<Medicamento>();
			
			System.out.println(" Resultados encontrados: \n" );
			
			while (resultado.next()) {
				System.out.printf("%d : %s - %s - %s - %s  \n",
					resultado.getInt("id_medicamento"),
					resultado.getString("nome"),
					resultado.getBoolean("estado"),
					resultado.getString("descricao"),
					resultado.getString("codBarras"));
					//resultado.getDouble("valorUnit"));
				
				Medicamento m = new Medicamento();
				m.setId_medicamento(resultado.getInt("id_medicamento"));
				m.setNome_medicamento(resultado.getString("nome"));
				m.setStatus(resultado.getBoolean("estado"));
				m.setDescricao_medicamento(resultado.getString("descricao"));
				m.setNumeracao_medicamento(resultado.getString("codBarras"));
				//m.setValor_unit(resultado.getDouble("valorUnit"));
				
				listaMedicamentos.add(m);
			}
			
			System.out.println("\n Fechando conexao...");
			conexao.close();
			
			return listaMedicamentos;
		}
		
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 

	
	@Override
	public Medicamento obterMedicamentos(int idMedicamento) {
		
		try {
			System.out.println("Abrindo conexao...");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "SELECT * FROM medicamento WHERE id = ?;";
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			comando.setInt(1, idMedicamento);
			
			System.out.println("Executando comando...");
			ResultSet resultado = comando.executeQuery();
			
			System.out.println("Resultado encontrado: \n");
			
			Medicamento m = new Medicamento();
			
			while (resultado.next()) {
				System.out.printf("%d : %s - %s - %s - %s - %.2f \n",
						resultado.getInt("id_medicamento"),
						resultado.getString("nome_medicamento"),
						resultado.getBoolean("status"),
						resultado.getString("descricao_medicamento"),
						resultado.getString("numeracao_medicamento"),
						resultado.getDouble("valor_unit"));
					
					m.setId_medicamento(resultado.getInt("id_medicamento"));
					m.setNome_medicamento(resultado.getString("nome_medicamento"));
					m.setStatus(resultado.getBoolean("status"));
					m.setDescricao_medicamento(resultado.getString("descricao_medicamento"));
					m.setNumeracao_medicamento(resultado.getString("numeracao_medicamento"));
					m.setValor_unit(resultado.getDouble("valor_unit"));
			}
			
			System.out.println("\n Fechando conexao...");
			conexao.close();
			
			return m;
		}
		
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 
}
