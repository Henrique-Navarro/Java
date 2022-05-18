package Aula047;

public class Excecao {
	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			
			//erro: tentando acessar uma posição que não existe
			vetor[5]=1;
			
			System.out.println("Isso não será impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Excecao tratada: posição vetor não existe");
		}

	}
}
