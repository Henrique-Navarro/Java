package Ex04;

public class Teste {
	int valor;
	
	public void exception(int num) throws ExceptionA, ExceptionB, ExceptionC{
		if(num==1) {
			throw new ExceptionA();
		}
		else if(num==2) {
			throw new ExceptionB();
		}
		else if(num==3) {
			throw new ExceptionC();
		}
	}
}
