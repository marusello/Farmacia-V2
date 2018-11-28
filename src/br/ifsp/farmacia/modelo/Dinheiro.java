package br.ifsp.farmacia.modelo;

public class Dinheiro implements VendaStrategy {

	@Override
	public double total(double total) {
		double f;
		
		f = total * 0.05;
		
		return f;
	}

}
