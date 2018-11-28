package br.ifsp.farmacia.modelo;

/**
 * Documenta��o da Classe Caixa
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Caixa {
	private int numCaixa;
	private boolean estado;
	private double valorTotal ;
	private Funcionario OperadorId;

	/**
	 * Documenta��o do m�todo getNumCaixa
	 * @return the numCaixa
	 */
	public int getNumCaixa() {
		return numCaixa;
	}
	
	/**
	 * Documenta��o do m�todo setNumCaixa
	 * @param numCaixa the numCaixa to set
	 */
	public void setNumCaixa(int numCaixa) {		  		
		this.numCaixa = numCaixa;
	}
	
	/**
	 * Documenta��o do m�todo isEstado
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}
	
	/**
	 * Documenta��o do m�todo setEstado
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	/**
	 * Documenta��o do m�todo getValorTotal
	 * @return the valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}
	
	/**
	 * Documenta��o do M�todo setValorTotal
	 * @param valorTotal
	 * 
	 * Documenta��o do atributo valorTotal
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 * 
	 * Quando o usu�rio deixar o textBox do valor vazio que h� no caixa a Exception ser� ativada
	 */
	public void setValorTotal(double valorTotal) {
		if (valorTotal <= 0)
            throw new IllegalArgumentException("Caixa n�o pode iniciar vazio");
		this.valorTotal = valorTotal;
	}
	
	/**
	 * Documenta��o do m�todo getOperadorId
	 * @return the OperadorId
	 */	
	public Funcionario getOperadorId() {
		return OperadorId;
	}
	
	/**
	 * Documenta��o do m�todo setOperadorId
	 * @param operadorId the operadorId to set
	 */	
	public void setOperadorId(Funcionario operadorId) {		 
		this.OperadorId = operadorId;
	}
}
