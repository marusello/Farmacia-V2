package br.ifsp.farmacia.modelo;

/**
 * Documentação da Classe Medicamento
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
	 * Documentação do Método setNome_medicamento
	 * @param nome_medicamento
	 * 
	 * Documentação do atributo nome_medicamento
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 * 
	 * O Textbox não pode ficar vazio, senão a Exception é ativada
	 */
	public void setNome_medicamento(String nome_medicamento) {
		if (nome_medicamento.equals("")) 
            throw new IllegalArgumentException("Nome não pode estar vazio");
		
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
	 * Documentação do Método setNumeracao_medicamento
	 * @param numeracao_medicamento
	 * 
	 * Documentação do atributo numeracao_medicamento
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 * 
	 * O Textbox não pode ficar vazio, senão a Exception é ativada
	 */
	public void setNumeracao_medicamento(String numeracao_medicamento) {
		if (numeracao_medicamento.equals("")) 
        throw new IllegalArgumentException("Codigo de Barras está vazio"); 
		
		this.numeracao_medicamento = numeracao_medicamento;
	}
	public double getValor_unit() {
		return valor_unit;
	}
	
	/**
	 * Documentação do Método setValor_unit
	 * @param valor_unit
	 * 
	 * Documentação do atributo cargo
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 * 
	 * É preciso inserir um valor maior que zero, senão a Exception é ativada 
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
	 * Documentação do Método notificaAlteracao
	 * @param remedio
	 * 
	 * Documentação do atributo remedio
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 * 
	 * Toda alteração de preço que ocorre, um observer notifica a ação
	 */
	@Override
	public void notificaAlteracao(Remedio remedio) {
		
	System.out.println("Estoque " + this.getNome_medicamento() + " sendo notificado");
	System.out.println("O medicamento " + remedio.getCodigo() + " teve o seu valor alterado para " + this.getValor_unit());
	}
	
}
