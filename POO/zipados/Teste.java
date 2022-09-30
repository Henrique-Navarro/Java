package ex4;

public class Teste {
	/*ATTRIBUTES*/
	private int valor;
	
	public Teste() {

	}
	
	/*SETTERS*/
	public void setValor(int valor){
		this.valor = valor;
	}
	
	/*GETTERS*/
	public int getValor() {
		return valor;
	}
	
	/*METHODS*/
	public void throwException() throws ExceptionA, ExceptionB, ExceptionC{
		switch(valor) {
			case 1: throw new ExceptionA();
			case 2: throw new ExceptionB();
			case 3: throw new ExceptionC();
		}
	}

	public static void main(String[] args) {
		Teste teste = new Teste();
		
		try {
			teste.setValor(1);
			teste.throwException();
		}catch(ExceptionA a) {
			System.out.println(a.getMessage());
		}
		
		try {
			teste.setValor(2);
			teste.throwException();
		}catch(ExceptionA a) {
			System.out.println(a.getMessage());
		}
		
		try {
			teste.setValor(3);
			teste.throwException();
		}catch(ExceptionA a) {
			System.out.println(a.getMessage());
		}
	}

}
