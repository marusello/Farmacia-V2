package br.ifsp.farmacia.controle;

import java.util.ArrayList;

import br.ifsp.farmacia.bd.ClienteDao;
import br.ifsp.farmacia.bd.JDBCClienteDao;
import br.ifsp.farmacia.bd.JDBCMedicamentoDao;
import br.ifsp.farmacia.bd.JDBCVendaDao;
import br.ifsp.farmacia.bd.MedicamentoDao;
import br.ifsp.farmacia.bd.VendaDao;
import br.ifsp.farmacia.modelo.Cliente;
import br.ifsp.farmacia.modelo.Medicamento;
import br.ifsp.farmacia.modelo.Venda;

public class VendaCtrl {
	
public void gravaVenda(Venda venda) {
		
	VendaDao ven = new JDBCVendaDao();	
		ven.gravaVenda(venda);		
	}
public ArrayList<Medicamento> obterMedicamento(){
		
		MedicamentoDao med = new JDBCMedicamentoDao();
		return med.obterMedicamento();
	}

public ArrayList<Cliente> obterClientes(){
	 ClienteDao cli = new JDBCClienteDao();
	return cli.obterClientes();
}

}
