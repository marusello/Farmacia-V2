package br.ifsp.farmacia.modelo;

/**
 * Documentação da Classe Cliente
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
	 * Documentação do método getIdCliente
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}
	
	/**
	 * Documentação do método setIdCliente
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
	 * 
	 * O Textbox não pode ficar vazio, senão a Exception é ativada
	 */
	public void setNome(String nome) {
		if (nome.equals("")) 
            throw new IllegalArgumentException("Nome não pode ficar vazio");   		
		this.nome = nome;
	}
	
	/**
	 * Documentação do método getCpf
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	
	/**
	 * Documentação do Método setCpf
	 * @param cpf
	 * 
	 * Documentação do atributo cpf
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 * 
	 * O Textbox não pode ficar vazio, senão a Exception é ativada
	 */
	public void setCpf(String cpf) {
		if(cpf.equals("")) {
            throw new IllegalArgumentException("Erro, CPF invalido !!!");     
		}
		this.cpf = cpf;
	}
	
	/**
	 * Documentação do método getDataNasc
	 * @return the dataNasc
	 */
	public String getDataNasc() {
		return dataNasc;
	}
	
	/**
	 * Documentação do método setDataNasc
	 * @param dataNasc the dataNasc to set
	 */	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	/**
	 * Documentação do método getEmail
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Documentação do método setEmail
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
