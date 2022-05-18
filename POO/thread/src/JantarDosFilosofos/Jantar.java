package JantarDosFilosofos;

public class Jantar{
	public static void main (String[] args){
		Mesa mesa = new Mesa ();
		//cria 5 thread (filósofos)
		for (int filosofo = 0; filosofo < 5; filosofo++){
			new Filosofo("Filosofo_" + filosofo, mesa, filosofo);
		}
	}
}