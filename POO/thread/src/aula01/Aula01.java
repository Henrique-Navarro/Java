package aula01;

public class Aula01{
	public static void main(String[] args) {
		MinhaThread thread1 = new MinhaThread("Thread01", 100);
		MinhaThread thread2 = new MinhaThread("Thread02", 1000);
		MinhaThread thread3 = new MinhaThread("Thread03", 2000);
	}
}
