package Aula047;

public class Excecao {
	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			
			//erro: tentando acessar uma posi��o que n�o existe
			vetor[5]=1;
			
			System.out.println("Isso n�o ser� impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excecao tratada: posi��o vetor n�o existe");
		}

	}
}
