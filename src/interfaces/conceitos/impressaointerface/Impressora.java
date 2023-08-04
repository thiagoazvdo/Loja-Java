package interfaces.conceitos.impressaointerface;

public interface Impressora {
	/*
	 * usamos a palavra interface ao inves de class uma interface eh como se fosse
	 * uma classe 100% abstrata, porque todos os metodos sao abstratos nenhum tem
	 * implementacao (public abstract())
	 */

	public void imprimir(Imprimivel imprimivel);

}
