package br.ifsp.farmacia.bd;
import java.util.ArrayList;

import br.ifsp.farmacia.modelo.Medicamento;;

public interface MedicamentoDao {
	
	public void gravaMedicamento (Medicamento medicamento);
	public ArrayList<Medicamento> obterMedicamento();
	public Medicamento obterMedicamentos (int idMedicamento);

}
