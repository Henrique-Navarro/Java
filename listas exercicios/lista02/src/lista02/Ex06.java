package lista02;
import java.util.Scanner;
public class Ex06 {
	static int fatorial(int num) {
		for(int i=num-1; i>0; i--) {
			num=num*i;
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("Fatorial de qual numero?");
		Scanner ler= new Scanner(System.in);
		int num= ler.nextInt();
		System.out.print("Fatorial de "+num+" = " +fatorial(num));
		ler.close();
	}
}