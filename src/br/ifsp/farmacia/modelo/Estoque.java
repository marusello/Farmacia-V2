package br.ifsp.farmacia.modelo;

/**
 * Documentação da Classe Estoque
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Estoque {
	private int idLote;
	private Medicamento nomeProduto;
	private int quantidade;
	
	/**
	 * Documentação do método getIdLote
	 * @return the idLote
	 */
	public int getIdLote() {
		return idLote;
	}
	
	/**
	 * Documentação do método setIdLote
	 * @param idLote the idLote to set
	 */
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	
	/**
	 * Documentação do método getNomeProduto
	 * @return the nomeProduto
	 */
	public Medicamento getNomeProduto() {
		return nomeProduto;
	}
	
	/**
	 * Documentação do método setNomeProduto
	 * @param nomeProduto the nomeProduto to set
	 */
	public void setNomeProduto(Medicamento nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	/**
	 * Documentação do método getQuantidade
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	
	/**
	 * Documentação do método setQuantidade
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
}