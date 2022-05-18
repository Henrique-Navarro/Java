package aula03;
public class Aula03{
	public static void main(String[] args) {
		//criar
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread01", 100);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread02", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread03", 900);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		t1.start();
		t2.start();
		t3.start();

		
		//espera a finalização das 3 para executar o restante de código
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\nPrograma Finalizado\n");
	}
}