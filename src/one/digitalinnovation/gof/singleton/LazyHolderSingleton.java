package one.digitalinnovation.gof.singleton;
/**
 * Singleton "apressado"
 * @author lucasmkrolow
 *
 */
public class LazyHolderSingleton {

	private static LazyHolderSingleton instancia = new LazyHolderSingleton();;
	
	private LazyHolderSingleton() {
		super();
	}
	
	public static LazyHolderSingleton getInstancia() {
		return instancia;
	}
}
