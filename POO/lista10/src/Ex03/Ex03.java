package Ex03;

import java.io.EOFException;

public class Ex03{
	public static void main(String[] args) {
		f(1);
		f(2);
		f(3);
	}

	public static void f (int i) {
		try {
			switch (i) {
			default:
			case 1: throw new Exception();
			case 2: throw new NumberFormatException();
			case 3: throw new EOFException();
			}
		}
		/*
		 * Apenas ser� printado "Exception", devido ao fato de estar dentro de um catch mais abrangente
		 * Uma vez que toda Exception ter� necess�riamente que passar por este primeiro catch,
		 * j� Exceptions mais espec�ficas como NumberFormatException e EOFException n�o
		 * ser�o capturadas, j� que est�o posicionadas depois do catch mais geb�rico catch (Exception e)*/
		catch (Exception e) {
			System.out.println("Exception");
		}
		catch (NumberFormatException e) {	
			System.out.println("NumberFormatException");
		}
		catch (EOFException e){
			System.out.println("EOFException");
		}
	}
}