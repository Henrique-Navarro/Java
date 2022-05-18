package ex01_semHeranca;

public class Quadrilatero {
	//atributtes
	private double lados[] = new double[4];
	
	//constructor
	public Quadrilatero(double[] lados) {
		for(int i=0; i<lados.length; i++) {
			this.lados[i]=lados[i];
		}
	}
	//metodos
	public double calcularPerimetro() {
		double soma=0;
		for(int i=0; i<lados.length; i++) {
			soma+=lados[i];
		}
		return soma;
	}
	
	public void exibirLados() {
		for(int i=0; i<lados.length; i++) {
			System.out.println("Lado"+i+": "+lados[i]);
		}
	}
}
