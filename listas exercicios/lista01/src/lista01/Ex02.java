package lista01;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		int num;
		Scanner ler= new Scanner(System.in);
		System.out.print("Digite num: \n");
		num= ler.nextInt();
		ler.close();
		String res=(num%2==0)? "É par" : "É ímpar";
		System.out.print(res);
	}
}
