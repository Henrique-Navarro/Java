package aula02;

public class Aula02 {
	public static void main(String[] args) {  
		//CRIAÇÃO DE THREADS
		MinhaThreadRunnable t1 = new MinhaThreadRunnable("thread01", 100);
		MinhaThreadRunnable t2 = new MinhaThreadRunnable("thread02", 400);
		MinhaThreadRunnable t3 = new MinhaThreadRunnable("thread03", 1000);
	}
}
