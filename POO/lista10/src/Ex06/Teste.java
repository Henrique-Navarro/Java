package Ex06;
import java.io.EOFException;
import java.io.IOException;

public class Teste {
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		try {
			primeiro(x);
			System.out.println("Após o primeiro");
		}catch(IllegalArgumentException e) {
			System.out.println("trata primeiro");
		}
		System.out.println("saiu primeiro");
	}
	static void primeiro(int x) throws IllegalArgumentException{
		try {
			segundo(x);
			System.out.println("depois segundo");
		}catch(IOException e) {
			System.out.println("trata segundo");
		}
		System.out.println("saiu segundo");
	}
	static void segundo(int x) throws IllegalArgumentException, IOException{
		try {
			switch(x) {
			case 0:
				throw new IllegalArgumentException();
			case 1:
				throw new IOException();
			case 2:
				throw new EOFException();
			}
			System.out.println("depois do switch");
		}catch(EOFException e) {
			System.out.println("trata terceiro");
		}
		System.out.println("saiu terceiro");
	}
}
/*
 * Primeiramente, ao se tentar executar o código disponibilizado, ocorrerá um erro de execução, pois o mesmo não
 * pode ser compilado corretamente
 * 
 * caso a entrada seja: a saida será
 * 0:		 depois switch, saiu terceiro, depois segundo, saiu segundo, após primeiro, trata primeiro, saiu primeiro
 * 1: 		 depois switch, saiu terceiro, depois segundo, trata segundo, saiu segundo, após primeiro, saiu primeiro
 * 2:        depois switch, trata terceiro, saiu terceiro, depois segundo, saiu segundo, após primeiro, saiu primeiro
 * 3: 	     depois switch, saiu terceiro, depois segundo, saiu segundo, após primeiro, saiu primeiro
 * 4: 	     depois switch, saiu terceiro, depois segundo, saiu segundo, após primeiro, saiu primeiro
 * */
