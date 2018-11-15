package br.ifsp.farmacia.bd;

import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Venda;

public interface VendaDao {
	public void gravaVenda (Venda venda);
	public ArrayList<Venda> obterVenda();
	public Venda obterVenda (int idVenda);
}
