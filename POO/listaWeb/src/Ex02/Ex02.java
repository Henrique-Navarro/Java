package Ex02;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];
		Agenda agenda = new Agenda();
		
		for(int i=0; i<2; i++) {
			Pessoa p = new Pessoa();
			
			p.setNome(ler.next());
			p.setIdade(ler.nextInt());
			p.setAltura(ler.nextFloat());
			
			pessoas[i]=p;
		}
		agenda.setPessoa(pessoas);
		agenda.imprimeAgenda();
		ler.close();
	}
}