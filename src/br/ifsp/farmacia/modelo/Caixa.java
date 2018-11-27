package br.ifsp.farmacia.modelo;

public class Caixa {
	private int numCaixa;
	private boolean estado;
	private double valorTotal ;
	private Funcionario OperadorId;
	
	public int getNumCaixa() {
		return numCaixa;
	}
	public void setNumCaixa(int numCaixa) {		  		
		this.numCaixa = numCaixa;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		if (valorTotal <= 0)
            throw new IllegalArgumentException("Caixa não pode iniciar vazio");
		this.valorTotal = valorTotal;
	}
	public Funcionario getOperadorId() {
		return OperadorId;
	}
	public void setOperadorId(Funcionario operadorId) {		 
		this.OperadorId = operadorId;
	}
	
	
	
}
