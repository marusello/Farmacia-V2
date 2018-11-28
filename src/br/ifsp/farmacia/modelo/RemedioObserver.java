package br.ifsp.farmacia.modelo;

/**
 * Documenta��o da Interface RemedioObserver
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public interface RemedioObserver {

	/**
	 * Documenta��o do M�todo notificaAlteracao
	 * @param remedio
	 *
	 * Assinatura de m�todo notificaAlteracao
	 */
	
	void notificaAlteracao(Remedio remedio);
}
