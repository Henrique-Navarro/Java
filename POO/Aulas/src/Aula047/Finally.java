package Aula047;

public class Finally {
	public static void main(String[] args) {
		int[] numeros = {1, 4, 8, 16, 32, 64, 128};
		int[] divisor = {0, 2, 4, 0};

		for(int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i]+"/"+divisor[i]+"="+numeros[i]/divisor[i]);
			} 
			//trata erro de divis?o por zero
			catch (ArithmeticException exception) {
				System.out.println("erro: Divis?o por zero");
			}

			//trata erro da posi??o do vetor
			catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("erro: Posi??o do vetor");
				
				//n?o executa finally
				System.exit(0);
			}
			
			//finally sempre executa depois do try/catch
			finally {
				System.out.println("Finally sempre executa depois do try/catch\n");
			}
		}
	}
}
