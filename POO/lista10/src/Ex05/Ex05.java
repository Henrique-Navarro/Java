package Ex05;

public class Ex05 {
	public static void main(String[] args) {
		/*
		 * É printado uma Exception no console:
		 * Exception in thread "main" java.lang.NumberFormatException: For input string: "2virgula04*/

		try {
			double valor = Double.valueOf("2virgula04");
			System.out.println("Valor Válido: "+valor);
		}
		catch(NumberFormatException e) {
			System.out.println("String não é um valor válido");
		}
	}
}