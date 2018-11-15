package br.ifsp.farmacia.modelo;

public class Estoque {
	private int idLote;
	private Medicamento nomeProduto;
	private int quantidade;
	
	public int getIdLote() {
		return idLote;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}	
	public Medicamento getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(Medicamento nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
