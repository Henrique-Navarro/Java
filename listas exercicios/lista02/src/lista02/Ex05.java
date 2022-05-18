package lista02;

public class Ex05 {
	public static void main(String[] args) {
		int num1=1, num2=0;
		 System.out.print(num2+" ");
	     System.out.print(num1+" ");
		for(int i=0; i<10; i++) {
			num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(num1+" ");			
		}
	}
}
