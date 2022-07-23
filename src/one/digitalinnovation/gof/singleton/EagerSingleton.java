package one.digitalinnovation.gof.singleton;
/**
 * Singleton "Lazy Holder"
 * @author lucasmkrolow
 *
 */
public class EagerSingleton {
	
	private static class Holder {
		private static EagerSingleton instancia = new EagerSingleton();;
	}
	private EagerSingleton() {
		super();
	}
	
	public static EagerSingleton getInstancia() {
		return Holder.instancia;
	}
}
