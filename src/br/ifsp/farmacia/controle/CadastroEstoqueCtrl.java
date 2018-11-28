package br.ifsp.farmacia.controle;


import java.util.ArrayList;

import br.ifsp.farmacia.bd.EstoqueDao;
import br.ifsp.farmacia.bd.JDBCEstoqueDao;
import br.ifsp.farmacia.bd.JDBCMedicamentoDao;
import br.ifsp.farmacia.bd.MedicamentoDao;
import br.ifsp.farmacia.modelo.Estoque;
import br.ifsp.farmacia.modelo.Medicamento;

public class CadastroEstoqueCtrl {
	
public ArrayList<Medicamento> obterMedicamento(){
		
		MedicamentoDao me = new JDBCMedicamentoDao();
		return me.obterMedicamento();
	}
	
	public void gravarEstoque(Estoque estoque) {
		
		EstoqueDao es = new JDBCEstoqueDao();	
		es.gravaEstoque(estoque);
	}
	
	
	
}
