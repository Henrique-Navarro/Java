package Aula047;

public class NaoInteiroException extends Exception{
	private int num;
	private int div;
	
	public NaoInteiroException(int num, int div) {
		this.num=num;
		this.div=div;
	}

	@Override
	public String toString() {
		return "Resultado: "+num+"/"+div+" não é inteiro";
}}