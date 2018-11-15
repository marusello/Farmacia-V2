package br.ifsp.farmacia.modelo;

public class Medicamento {

	private int id_medicamento;	
	private String nome_medicamento;
	private boolean status;
	private String descricao_medicamento;
	private String numeracao_medicamento;
	private double valor_unit;
	
	
	public String getNome_medicamento() {
		return nome_medicamento;
	}
	public void setNome_medicamento(String nome_medicamento) {
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
	public void setNumeracao_medicamento(String numeracao_medicamento) {
		this.numeracao_medicamento = numeracao_medicamento;
	}
	public double getValor_unit() {
		return valor_unit;
	}
	public void setValor_unit(double valor_unit) {
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
	
}
