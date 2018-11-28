package br.ifsp.farmacia.modelo;

/**
 * Documentação da Interface RemedioObserver
 * @author Gustavo Maciel, Marcelo Augusto e Iuki Kobayakawa
 * @version 2.0
 */

public interface RemedioObserver {

	/**
	 * Documentação do Método notificaAlteracao
	 * @param remedio
	 * 
	 * Documentação do atributo remedio
	 * @throws IllegalArgumentException
	 * 	Documentação da situação que gera a exception IllegalArgumentException
	 */
	
	void notificaAlteracao(Remedio remedio);
}
