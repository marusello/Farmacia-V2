package br.ifsp.farmacia.modelo;

/**
 * Documentação da Venda.
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public class Venda {
	private int codVenda;
	private Medicamento medicamento;
	private int quantidade;
	private double subTotal;
	private double valorTotal;
	private Caixa caixa;
	private Cliente cliente;
	private String pagamento;
	
	public int getCodVenda() {
		return codVenda;
	}
	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		
		if(pagamento == "dinheiro") {
			VendaStrategy st = new Dinheiro();
			
			this.valorTotal = st.total(valorTotal);
			
			 
		}
		else if(cliente.equals(true)){
			VendaStrategy sa = new aposentado();
			
			this.valorTotal = sa.total(valorTotal);
			
		}else {
			this.valorTotal = valorTotal;
		}
		
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
