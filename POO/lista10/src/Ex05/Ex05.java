package Ex05;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * � printado uma Exception no console:
		 * Exception in thread "main" java.lang.NumberFormatException: For input string: "2virgula04*/

		try {
			double valor = Double.valueOf("2virgula04");
			System.out.println("Valor V�lido: "+valor);
		}
		catch(NumberFormatException e) {
			System.out.println("String n�o � um valor v�lido");
		}
	}
}