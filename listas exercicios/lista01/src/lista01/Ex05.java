package lista01;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		int mes, op;
		Scanner ler= new Scanner(System.in);
		
		while(true) {
			System.out.println("Digite o mes:");
			mes= ler.nextInt();
			switch(mes) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Marco");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maio");
				break;
			case 6:
				System.out.println("Junho");
				break;
			case 7:
				System.out.println("Julho");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Setembro");
				break;
			case 10:
				System.out.println("Outubro");
				break;
			case 11:
				System.out.println("Novembro");
				break;
			case 12:
				System.out.println("Dezembro");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			System.out.println("Deseja continuar? [0]-sair");
			op= ler.nextInt();
			if(op==0) {break;}
		}
		ler.close();
	}
}
