package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Funcionario;

/**
 * Documentação da Classe JDBCFuncionarioDao
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class JDBCFuncionarioDao implements FuncionarioDao {

	/**
	 * Documentação do método gravaFuncionario
	 * @param funcionario the funcionario to set
	 * 
	 * Para inserir funcionario
	 */
	@Override
	public void gravaFuncionario(Funcionario funcionario) {

		try {

			System.out.println("Abrindo conexão...");
			Connection conexao = ConnectionFactory.createConnection();

			String sql = "INSERT INTO funcionario (nome, cargo)" + "VALUES ( ?, ?)";

			PreparedStatement comando = conexao.prepareStatement(sql);

			comando.setString(1, funcionario.getNome());
			comando.setString(2, funcionario.getCargo());

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
	 * Documentação do método obterFuncionario
	 * @return the listaFuncionario
	 * 
	 * Para listar os funcionarios usando ArrayList
	 */
	@Override
	public ArrayList<Funcionario> obterFuncionario() {
		try {
			System.out.println(" Abrindo conexão ... ");
			Connection conexao = ConnectionFactory.createConnection();

			String sql = "SELECT * FROM funcionario;";

			PreparedStatement comando = conexao.prepareStatement(sql);

			System.out.println(" Executando comando ... ");
			ResultSet resultado = comando.executeQuery();

			ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

			System.out.println(" Resultados encontrados : \n");

			while (resultado.next()) {
				System.out.printf(" %s - %s\n",
						resultado.getString("nome"), resultado.getString("cargo"));

				/**
				 * Guarda os dados do resultado e guarda em um cliente
				 */
				Funcionario f = new Funcionario();
				f.setNome(resultado.getString("nome"));
				f.setFunId(resultado.getInt("funId"));
				f.setCargo(resultado.getString("cargo"));

				listaFuncionario.add(f);// adiciona o cliente criado acima na lista
			}

			System.out.println("\n Fechando conexão ... ");
			conexao.close();

			return listaFuncionario;// retorna a lista de clientes

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
