package br.ifsp.farmacia.visao;

import br.ifsp.farmacia.modelo.Medicamento;
import br.ifsp.farmacia.modelo.Remedio;

public class TesteObserver {

	public static void main(String[] args) {

		Remedio remedio = new Remedio("Dipirona", 2.56);
		
		Medicamento m1 = new Medicamento();
		
		m1.setNome_medicamento("Dipirona");
		m1.setValor_unit(3.00);
		
		remedio.registraInteressado(m1);
		
		remedio.setValor(3.00);
	}

}
