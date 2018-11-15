package br.ifsp.farmacia.modelo;

public class Funcionario {
	
	private int funId;
	private String nome;
	private String cargo;
	
	public int getFunId() {
		return funId;
	}
	public void setFunId(int funId) {
		this.funId = funId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		
			if (nome.equals("")) 
            throw new IllegalArgumentException("nome nao pode ser vazio");       
		
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		if (cargo.equals("")) 
            throw new IllegalArgumentException("cargo nao pode ser vazio");   
		
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return cargo;
	}
	
	
	
}
