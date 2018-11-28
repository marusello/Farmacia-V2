package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.ifsp.farmacia.modelo.Caixa;

/**
 * Documentação da Classe JDBCCaixaDao
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class JDBCCaixaDao implements CaixaDao {

	/**
	 * Documentação do método gravaCaixa
	 * @param caixa the caixa to set
	 * 
	 * Para abrir o caixa
	 */
	@Override
	public void gravaCaixa(Caixa caixa) {
		try {
			System.out.println("Abrindo conexão...");
			Connection conexao = ConnectionFactory.createConnection();
			
			String sql = "INSERT INTO caixa (estado, valorTotal, operador)" + "VALUES (?,?,?)";
		
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			//comando.setBoolean(1, caixa.isEstado());			

			comando.setBoolean(1, caixa.isEstado());
			comando.setDouble(2, caixa.getValorTotal());
			comando.setInt(3, caixa.getOperadorId().getFunId());
			
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

