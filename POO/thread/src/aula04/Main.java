package aula04;
import aula04.ThreadRunnable;

public class Main {
	public static void main(String[] args) {
		ThreadRunnable thread1 = new ThreadRunnable("thread01", 400);
		ThreadRunnable thread2 = new ThreadRunnable("thread02", 400);
		ThreadRunnable thread3 = new ThreadRunnable("thread03", 400);
	
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();	
		t2.start();	
		t3.start();	
		
		//prioridade de execução
		t1.setPriority(3);
		t2.setPriority(2);
		t3.setPriority(1);
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
	}
}
