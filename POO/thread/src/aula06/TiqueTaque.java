package aula06;

public class TiqueTaque {
	boolean tique;

	synchronized void tique(boolean estaExecutando) {
		if(!estaExecutando) {
			tique = true;
			notify();
			return;
		}
		
		//imprime tique, notifica a Thread que pode executar o método taque
		System.err.print("Tique ");
		tique = true;
		notify();
		try {
			//enquanto for tique, espera até ser notificado para continuar pelo método taque
			while(tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean estaExecutando) {
		if(!estaExecutando) {
			tique = false;
			notify();
			return;
		}
		
		System.err.print("Taque\n");
		tique = false;
		notify();
		try {
			while(!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
