package Ex04;

public class Main {
	public static void main(String[] args) {
		Teste t1 = new Teste();
		
		try {
			t1.exception(1);
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
		
		try {
			t1.exception(2);
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
		
		try {
			t1.exception(3);
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
	}
}
