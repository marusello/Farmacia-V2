package br.ifsp.farmacia.modelo;
import java.util.HashSet;
import java.util.Set;

public class Remedio {
	
	private String codigo;
	private double valor;
	
	private Set<RemedioObserver> interessados = new HashSet<RemedioObserver>();
	
	public Remedio(String codigo, double valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public void registraInteressado(RemedioObserver interessado) {
		this.interessados.add(interessado);
	}
	
	public void cancelaInteresse(RemedioObserver interessado) {
		this.interessados.remove(interessado);
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
		for (RemedioObserver interessado : this.interessados) {
			interessado.notificaAlteracao(this);
		}
	}
	
	public String getCodigo() {
		return codigo;
	}
}
