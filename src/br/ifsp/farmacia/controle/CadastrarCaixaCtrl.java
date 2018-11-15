package br.ifsp.farmacia.controle;

import java.util.ArrayList;

import br.ifsp.farmacia.bd.CaixaDao;
import br.ifsp.farmacia.bd.FuncionarioDao;
import br.ifsp.farmacia.bd.JDBCCaixaDao;
import br.ifsp.farmacia.bd.JDBCFuncionarioDao;
import br.ifsp.farmacia.modelo.Caixa;
import br.ifsp.farmacia.modelo.Funcionario;

public class CadastrarCaixaCtrl {
	public void gravaCaixa(Caixa caixa) {
		
		CaixaDao cax = new JDBCCaixaDao();	
		cax.gravaCaixa(caixa);
		
	}
public ArrayList<Funcionario> obterFuncionario(){
		
		FuncionarioDao fu = new JDBCFuncionarioDao();
		return fu.obterFuncionario();
	}

}
