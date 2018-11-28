package br.ifsp.farmacia.modelo;

/**
 * Documenta��o da Classe Funcionario
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Funcionario {
	
	private int funId;
	private String nome;
	private String cargo;
	
	
	/**
	 * Documenta��o do m�todo getFunId
	 * @return the funId
	 */
	public int getFunId() {
		return funId;
	}
	
	
	public void setFunId(int funId) {
		this.funId = funId;
	}
	
	/**
	 * Documenta��o do m�todo getNome
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Documenta��o do M�todo setNome
	 * @param nome
	 * 
	 * Documenta��o do atributo nome
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 */
	public void setNome(String nome) {
		
			if (nome.equals("")) 
            throw new IllegalArgumentException("nome nao pode ser vazio");       
		
		this.nome = nome;
	}
	
	/**
	 * Documenta��o do m�todo getIdLote
	 * @return the idLote
	 */
	public String getCargo() {
		return cargo;
	}
	
	
	/**
	 * Documenta��o do M�todo setCargo
	 * @param cargo
	 * 
	 * Documenta��o do atributo cargo
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 */
	public void setCargo(String cargo) {
		if (cargo.equals("")) 
            throw new IllegalArgumentException("cargo nao pode ser vazio");   
		
		this.cargo = cargo;
	}
	
	/**
	 * Documenta��o do m�todo toString
	 * @return the cargo
	 */
	@Override
	public String toString() {
		return cargo;
	}
	
	
	
}
