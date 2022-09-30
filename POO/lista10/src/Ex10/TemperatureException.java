package Ex10;

public class TemperatureException extends Exception{
	public TemperatureException() {
		super("Erro de Temperatura");
	}
	
	public TemperatureException(String erro) {
		super(erro);
	}
}
