package br.ifsp.farmacia.modelo;

/**
 * Documentação da Classe Caixa
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Caixa {
	private int numCaixa;
	private boolean estado;
	private double valorTotal ;
	private Funcionario OperadorId;

	/**
	 * Documentação do método getNumCaixa
	 * @return the numCaixa
	 */
	public int getNumCaixa() {
		return numCaixa;
	}
	
	/**
	 * Documentação do método setNumCaixa
	 * @param numCaixa the numCaixa to set
	 */
	public void setNumCaixa(int numCaixa) {		  		
		this.numCaixa = numCaixa;
	}
	
	/**
	 * Documentação do método isEstado
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}
	
	/**
	 * Documentação do método setEstado
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	/**
	 * Documentação do método getValorTotal
	 * @return the valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}
	
	/**
	 * Documentação do Método setValorTotal
	 * @param valorTotal
	 * 
	 * Documentação do atributo valorTotal
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 * 
	 * Quando o usuário deixar o textBox do valor vazio que há no caixa a Exception será ativada
	 */
	public void setValorTotal(double valorTotal) {
		if (valorTotal <= 0)
            throw new IllegalArgumentException("Caixa não pode iniciar vazio");
		this.valorTotal = valorTotal;
	}
	
	/**
	 * Documentação do método getOperadorId
	 * @return the OperadorId
	 */	
	public Funcionario getOperadorId() {
		return OperadorId;
	}
	
	/**
	 * Documentação do método setOperadorId
	 * @param operadorId the operadorId to set
	 */	
	public void setOperadorId(Funcionario operadorId) {		 
		this.OperadorId = operadorId;
	}
}
