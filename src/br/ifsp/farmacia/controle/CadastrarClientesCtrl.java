package br.ifsp.farmacia.controle;

import br.ifsp.farmacia.bd.ClienteDao;
import br.ifsp.farmacia.bd.JDBCClienteDao;
import br.ifsp.farmacia.modelo.Cliente;


public class CadastrarClientesCtrl {
	
	public void gravarCliente(Cliente cliente) {
		
		ClienteDao cli = new JDBCClienteDao();	
		cli.gravaCliente(cliente);
		
	}


}
