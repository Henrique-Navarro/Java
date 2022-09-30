package Ex01;

public class Ex01 {
	public static void main(String[] args) {
		try {
			int[] vetor = new int[] { 2, 4, 6, 8, 10, 12 };
			for (int i = 0; i <= 12; i++) {
			System.out.println(vetor[i]);
			}
		}catch(Exception e){
			System.out.println("O vetor acabou!");
		}
	}
}
