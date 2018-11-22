package br.ifsp.farmacia.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Acesso {

	public boolean permissao;
	
	public void Logar (String login, String senha) {
		
		try {
			Connection conexao = ConnectionFactory.createConnection();
		
			String sql = "SELECT login, senha FROM usuario where login = ? AND senha = ?;";
			PreparedStatement comando = conexao.prepareStatement(sql);
			
			comando.setString(1, login);
			comando.setString(2, senha);
			
			ResultSet resultado = comando.executeQuery();

			if (resultado.next()) {
				JOptionPane.showMessageDialog(null, "Acesso permitido");
				permissao = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "login ou senha incorreta");
				permissao = false;
			}
		}
		
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
