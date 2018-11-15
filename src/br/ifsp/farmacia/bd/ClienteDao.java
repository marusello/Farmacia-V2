package br.ifsp.farmacia.bd;

import java.util.ArrayList;
import br.ifsp.farmacia.modelo.Cliente;

public interface ClienteDao {

	public void gravaCliente (Cliente cliente);
	public ArrayList<Cliente> obterClientes();
	public Cliente obterCliente (int idCliente);
}
