package lista01;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite num1:\n");
		num1=ler.nextInt();
		System.out.printf("Digite num2:\n");
		num2=ler.nextInt();
		ler.close();
		System.out.printf("\n%d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);
	}
}
