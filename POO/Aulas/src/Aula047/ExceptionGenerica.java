package Aula047;
public class ExceptionGenerica {
	public static void main(String[] args) {
		int[] numeros = {1, 4, 8, 16, 32, 64, 128};
		int[] divisor = {0, 2, 4, 0};

		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i]+"/"+divisor[i]+"="+numeros[i]/divisor[i]);
			} 
			
			//erro genérico
			catch (Exception e) {
				//mostra o tipo de erro
				System.out.println(e.getMessage());
				//mostra onde o erro aconteceu
				e.printStackTrace();
}}}}