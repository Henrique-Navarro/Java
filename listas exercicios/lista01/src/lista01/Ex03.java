package lista01;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		float num1, num2;
		Scanner ler= new Scanner(System.in);
		System.out.print("Digite num1:\n");
		num1= ler.nextFloat();
		System.out.print("Digite num2:\n");
		num2= ler.nextFloat();
		ler.close();
		String res=(num1>num2)? ("num1: "+num1+ " é maior") : ("num2: "+num2+" é maior");
		System.out.print(res);
	}
}
