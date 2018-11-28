package br.ifsp.farmacia.modelo;

/**
 * Documenta��o da Classe Estoque
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Estoque {
	private int idLote;
	private Medicamento nomeProduto;
	private int quantidade;
	
	/**
	 * Documenta��o do m�todo getIdLote
	 * @return the idLote
	 */
	public int getIdLote() {
		return idLote;
	}
	
	/**
	 * Documenta��o do m�todo setIdLote
	 * @param idLote the idLote to set
	 */
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	
	/**
	 * Documenta��o do m�todo getNomeProduto
	 * @return the nomeProduto
	 */
	public Medicamento getNomeProduto() {
		return nomeProduto;
	}
	
	/**
	 * Documenta��o do m�todo setNomeProduto
	 * @param nomeProduto the nomeProduto to set
	 */
	public void setNomeProduto(Medicamento nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	/**
	 * Documenta��o do m�todo getQuantidade
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	
	/**
	 * Documenta��o do m�todo setQuantidade
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
}