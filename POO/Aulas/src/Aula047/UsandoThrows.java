package Aula047;
import java.util.Scanner;
public class UsandoThrows {
	public static void main(String[] args) {
		try {
			double num = lerNumero();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("Entrada inválida!");
			e.printStackTrace();
		}
	}
	
	public static double lerNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		scan.close();
		return num;
}}