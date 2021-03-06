package br.ufrj.dcc.comp2.ple.raphael.lista2.programa1.veiculos.interfaces;

/** Interface que representa a capacidade de um veículo off-road.
 * 
 * @author Raphael Mesquita &lt;raphafm.rf@gmail.com&gt;
 *
 */
public interface OffRoad {
	/**
	 * Tipos de caminho que um veículo off-road suporta.
	 */
	public static final String tiposDeCaminho[] = {"rodovia", "estrada de terra"};

	/**
	 * Método que verifica se o veículo viaja ou não no caminho passado como parâmetro.
	 * @param tipoDeCaminho A <b>String</b> o tipo de caminho.
	 * @return Se viaja ou não no caminho.
	 */
	public boolean viajaNoClima(String clima);
	
	/**
	 * Método que verifica se o veículo viaja ou não no clima passado como parâmetro.
	 * @param tipoDeCaminho A <b>String</b> o clima.
	 * @return Se viaja ou não no clima.
	 */
	public boolean viajaNoCaminho(String caminho);
}