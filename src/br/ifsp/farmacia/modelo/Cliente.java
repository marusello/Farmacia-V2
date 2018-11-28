package br.ifsp.farmacia.modelo;

public class Cliente {

	private int idCliente;
	private String nome;
	private String cpf;
	private String dataNasc;
	private String email;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.equals("")) 
            throw new IllegalArgumentException("Nome n�o pode ficar vazio");   		
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.equals("")) {
            throw new IllegalArgumentException("Erro, CPF invalido !!!");     
		}
		this.cpf = cpf;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {		
		this.email = email;
	}
	@Override
	public String toString() {
		return nome;
	}
}
