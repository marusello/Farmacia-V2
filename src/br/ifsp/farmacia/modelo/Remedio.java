package br.ifsp.farmacia.modelo;
import java.util.HashSet;
import java.util.Set;

/**
 * Documenta��o da Classe Remedio
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Remedio {
	
	private String codigo;
	private double valor;
	
	/**
	 * Documenta��o do Set 
	 * Implementa��o de um Hash para listar os medicamentos observados
	 * 
	 */
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
	
	/**
	 * Documenta��o do m�todo setValor
	 * @param valor the valor to set
	 * 
	 * Implementa��o de um Foreach
	 */
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
