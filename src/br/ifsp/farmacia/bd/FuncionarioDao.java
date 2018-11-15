package br.ifsp.farmacia.bd;

import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Funcionario;;

public interface FuncionarioDao {
	
	public void gravaFuncionario(Funcionario funcionario);
	public ArrayList<Funcionario> obterFuncionario();
	
}
