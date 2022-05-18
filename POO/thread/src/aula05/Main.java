package aula05;

public class Main {
	public static void main(String[] args) {
		int[] numeros = {1, 2, 3, 4, 5};
		
		MinhaThread t1 = new MinhaThread("#01", numeros);
		MinhaThread t2 = new MinhaThread("#02", numeros);
	}
}
 