package br.ifsp.farmacia.controle;

import br.ifsp.farmacia.bd.MedicamentoDao;

import java.util.ArrayList;

import br.ifsp.farmacia.bd.JDBCMedicamentoDao;
import br.ifsp.farmacia.modelo.Medicamento;


public class CadastrarMedicamentoCtrl {

	public void gravarMedicamento(Medicamento medicamento){
		
		MedicamentoDao med = new JDBCMedicamentoDao();	
		med.gravaMedicamento(medicamento);
		
	}
	
	public ArrayList<Medicamento> obterMedicamentos(){
		
	MedicamentoDao med = new JDBCMedicamentoDao();
		return med.obterMedicamentos();
	}
}
