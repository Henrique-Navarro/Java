package Ex10;

public class FahrenheitException extends TemperatureException{
	public FahrenheitException() {
		super("Menor que zero absoluto");
	}
}