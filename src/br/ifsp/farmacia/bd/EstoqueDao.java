package br.ifsp.farmacia.bd;

import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Estoque;

public interface EstoqueDao {
	public void gravaEstoque(Estoque estoque);
	public ArrayList<Estoque> obterEstoque();
	public Estoque obterEstoque (int idLote);
	//public void AtualizarEstoque(Estoque estoque);
}
