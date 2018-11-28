package br.ifsp.farmacia.modelo;

/**
 * Documentação da Classe Funcionario
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Funcionario {
	
	private int funId;
	private String nome;
	private String cargo;
	
	
	/**
	 * Documentação do método getFunId
	 * @return the funId
	 */
	public int getFunId() {
		return funId;
	}
	
	
	public void setFunId(int funId) {
		this.funId = funId;
	}
	
	/**
	 * Documentação do método getNome
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Documentação do Método setNome
	 * @param nome
	 * 
	 * Documentação do atributo nome
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 */
	public void setNome(String nome) {
		
			if (nome.equals("")) 
            throw new IllegalArgumentException("nome nao pode ser vazio");       
		
		this.nome = nome;
	}
	
	/**
	 * Documentação do método getIdLote
	 * @return the idLote
	 */
	public String getCargo() {
		return cargo;
	}
	
	
	/**
	 * Documentação do Método setCargo
	 * @param cargo
	 * 
	 * Documentação do atributo cargo
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 */
	public void setCargo(String cargo) {
		if (cargo.equals("")) 
            throw new IllegalArgumentException("cargo nao pode ser vazio");   
		
		this.cargo = cargo;
	}
	
	/**
	 * Documentação do método toString
	 * @return the cargo
	 */
	@Override
	public String toString() {
		return cargo;
	}
	
	
	
}
