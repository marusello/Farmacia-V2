package br.ifsp.farmacia.modelo;

public class Aposentado implements VendaStrategy {

	@Override
	public double total(double total) {
		double f;
		
		f = total * 0.20;
		return f;
	}

}
