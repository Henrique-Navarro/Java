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
		 * Apenas será printado "Exception", devido ao fato de estar dentro de um catch mais abrangente
		 * Uma vez que toda Exception terá necessáriamente que passar por este primeiro catch,
		 * já Exceptions mais específicas como NumberFormatException e EOFException não
		 * serão capturadas, já que estão posicionadas depois do catch mais gebérico catch (Exception e)*/
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