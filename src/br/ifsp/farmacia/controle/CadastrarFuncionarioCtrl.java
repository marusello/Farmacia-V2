package br.ifsp.farmacia.controle;

import br.ifsp.farmacia.bd.FuncionarioDao;
import br.ifsp.farmacia.bd.JDBCFuncionarioDao;
import br.ifsp.farmacia.modelo.Funcionario;

public class CadastrarFuncionarioCtrl {
	
	public void gravaFuncionario(Funcionario funcionario) {
		
		FuncionarioDao fun = new JDBCFuncionarioDao();	
		fun.gravaFuncionario(funcionario);
	}

}
