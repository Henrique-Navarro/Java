package jantarFilosofoMinhaImplementacao;

public class Garfos {
	private boolean[] vet_garfos = new boolean[5]; 

	public Garfos() {
	}

	public synchronized void pegar(Filosofo f) { 
		
		int chave;
		chave = f.getChave();
		
		while (vet_garfos[chave] || vet_garfos[((chave + 1) % 5)]) {
			
			f.setStatus(2);
			try {
				wait();
			}
			catch (Exception e) {
			}
		}
		vet_garfos[chave] = true;
		vet_garfos[((chave + 1) % 5)] = true;
		//System.out.println("Garfo1:  "+chave+" Garfo2: "+((chave + 1) % 5) +"");
		f.setStatus(1); 
	}

	public synchronized void liberar(Filosofo f) {
		int chave;
		chave = f.getChave();
		vet_garfos[chave] = false;
		int aux = (chave + 1) % 5;
		vet_garfos[aux] = false;
		try {
			notifyAll();
		}
		catch (Exception e) {
		}
	}
}