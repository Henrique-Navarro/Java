package aula05;
//recebe um vetor e faz a soma entre os n�meros
public class Calculadora {
	private int soma;
	
	//sem o synchronized as Threads compartilham a variavel soma
	//synchronized faz com que somente uma Thread acesse o m�todo por vez
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		for(int i=0; i<array.length; i++) {
			soma += array[i];
			System.out.println("Executando a soma "+ Thread.currentThread().getName()+ " somando valor "+array[i]+" total: "+soma);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return soma;
	}
}
