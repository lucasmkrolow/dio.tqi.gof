package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.EagerSingleton;
import one.digitalinnovation.gof.singleton.LazyHolderSingleton;
import one.digitalinnovation.gof.singleton.LazySingleton;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton:
		System.out.println("---Teste de Singleton---");
		
		LazySingleton lazy = LazySingleton.getInstancia();
		System.out.println(lazy);
		lazy = LazySingleton.getInstancia();
		System.out.println(lazy);
		

		EagerSingleton  eager = EagerSingleton.getInstancia();
		System.out.println(eager);
		eager = EagerSingleton.getInstancia();
		System.out.println(eager);
		

		LazyHolderSingleton holder = LazyHolderSingleton.getInstancia();
		System.out.println(holder);
		holder = LazyHolderSingleton.getInstancia();
		System.out.println(holder);
		
		//Strategy:
		System.out.println("---Teste de Strategy---");
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);		
		robo.mover();
		robo.setComportamento(agressivo);		
		robo.mover();	
		robo.mover();	
		robo.mover();
		
		// Facade
		System.out.println("---Teste de Facade---");
		
		Facade facade = new Facade();
		facade.migrarCliente("Lucas", "78000-000");
	}

}
