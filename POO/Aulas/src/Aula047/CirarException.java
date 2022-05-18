package Aula047;
public class CirarException {
	public static void main(String[] args) {
		int[] numeros = {1, 4, 8, 5, 3};
		int[] divisor = {0, 2, 4, 4, 2};

		for(int i=0; i<numeros.length; i++) {
			try {
				if(numeros[i]%2!=0) {
					//exception específica
					throw new NaoInteiroException(numeros[i], divisor[i]);
				}
				System.out.println(numeros[i]+"/"+divisor[i]+"="+numeros[i]/divisor[i]);
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException | NaoInteiroException e) {
				System.out.println("\nErro");
				e.printStackTrace();
}}}}