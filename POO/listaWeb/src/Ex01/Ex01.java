package Ex01;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		Pessoa p1 = new Pessoa(ler.next(), ler.nextInt(), ler.nextInt());
		Pessoa p2 = new Pessoa(ler.next(), ler.nextInt(), ler.nextInt());
		
		p1.mostrarDados();
		p2.mostrarDados();
		ler.close();
	}
}