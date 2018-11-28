package br.ifsp.farmacia.modelo;

public class aposentado implements VendaStrategy {

	@Override
	public double total(double total) {
		double f;
		
		f = total * 0.20;
		return f;
	}

}
