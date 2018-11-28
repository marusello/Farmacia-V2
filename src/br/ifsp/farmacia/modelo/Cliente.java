package br.ifsp.farmacia.modelo;

/**
 * Documenta��o da Classe Cliente
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Cliente {

	private int idCliente;
	private String nome;
	private String cpf;
	private String dataNasc;
	private String email;
	
	/**
	 * Documenta��o do m�todo getIdCliente
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	
	/**
	 * Documenta��o do m�todo setIdCliente
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
	 * 
	 * O Textbox n�o pode ficar vazio, sen�o a Exception � ativada
	 */
	public void setNome(String nome) {
		if (nome.equals("")) 
            throw new IllegalArgumentException("Nome n�o pode ficar vazio");   		
		this.nome = nome;
	}
	
	/**
	 * Documenta��o do m�todo getCpf
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Documenta��o do M�todo setCpf
	 * @param cpf
	 * 
	 * Documenta��o do atributo cpf
	 * @throws IllegalArgumentException
	 * 	Documenta��o da situa��o que gera a exception IllegalArgumentException
	 * 
	 * O Textbox n�o pode ficar vazio, sen�o a Exception � ativada
	 */
	public void setCpf(String cpf) {
		if(cpf.equals("")) {
            throw new IllegalArgumentException("Erro, CPF invalido !!!");     
		}
		this.cpf = cpf;
	}
	
	/**
	 * Documenta��o do m�todo getDataNasc
	 * @return the dataNasc
	 */
	public String getDataNasc() {
		return dataNasc;
	}
	
	/**
	 * Documenta��o do m�todo setDataNasc
	 * @param dataNasc the dataNasc to set
	 */	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	/**
	 * Documenta��o do m�todo getEmail
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Documenta��o do m�todo setEmail
	 * @param email the email to set
	 */	
	public void setEmail(String email) {		
		this.email = email;
	}
	@Override
	public String toString() {
		return nome;
	}
}
