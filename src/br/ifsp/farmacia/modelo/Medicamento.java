package br.ifsp.farmacia.modelo;

/**
 * Documenta��o da Classe Medicamento
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Medicamento implements RemedioObserver {

	private int id_medicamento;	
	private String nome_medicamento;
	private boolean status;
	private String descricao_medicamento;
	private String numeracao_medicamento;
	private double valor_unit;
	
	
	public String getNome_medicamento() {
		return nome_medicamento;
	}
	
	/**
	 * Documenta��o do M�todo setNome_medicamento
	 * @param nome_medicamento
	 * 
	 * Documenta��o do atributo nome_medicamento
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 * 
	 * O Textbox n�o pode ficar vazio, sen�o a Exception � ativada
	 */
	public void setNome_medicamento(String nome_medicamento) {
		if (nome_medicamento.equals("")) 
            throw new IllegalArgumentException("Nome n�o pode estar vazio");
		
		this.nome_medicamento = nome_medicamento;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDescricao_medicamento() {
		return descricao_medicamento;
	}
	public void setDescricao_medicamento(String descricao_medicamento) {
		this.descricao_medicamento = descricao_medicamento;
	}
	public String getNumeracao_medicamento() {
		return numeracao_medicamento;
	}
	
	/**
	 * Documenta��o do M�todo setNumeracao_medicamento
	 * @param numeracao_medicamento
	 * 
	 * Documenta��o do atributo numeracao_medicamento
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 * 
	 * O Textbox n�o pode ficar vazio, sen�o a Exception � ativada
	 */
	public void setNumeracao_medicamento(String numeracao_medicamento) {
		if (numeracao_medicamento.equals("")) 
        throw new IllegalArgumentException("Codigo de Barras est� vazio"); 
		
		this.numeracao_medicamento = numeracao_medicamento;
	}
	public double getValor_unit() {
		return valor_unit;
	}
	
	/**
	 * Documenta��o do M�todo setValor_unit
	 * @param valor_unit
	 * 
	 * Documenta��o do atributo cargo
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 * 
	 * � preciso inserir um valor maior que zero, sen�o a Exception � ativada 
	 */
	public void setValor_unit(double valor_unit) {
		if (valor_unit <= 0) 
	        throw new IllegalArgumentException("Insira uma valor "); 
		this.valor_unit = valor_unit;
	}
	public int getId_medicamento() {
		return id_medicamento;
	}
	public void setId_medicamento(int id_medicamento) {
		this.id_medicamento = id_medicamento;
	}
	@Override
	public String toString() {
		return nome_medicamento;
	}
	
	
	/**
	 * Documenta��o do M�todo notificaAlteracao
	 * @param remedio
	 * 
	 * Documenta��o do atributo remedio
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 * 
	 * Toda altera��o de pre�o que ocorre, um observer notifica a a��o
	 */
	@Override
	public void notificaAlteracao(Remedio remedio) {
		
	System.out.println("Estoque " + this.getNome_medicamento() + " sendo notificado");
	System.out.println("O medicamento " + remedio.getCodigo() + " teve o seu valor alterado para " + this.getValor_unit());
	}
	
}
