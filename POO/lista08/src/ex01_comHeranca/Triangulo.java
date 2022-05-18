package ex01_comHeranca;

public class Triangulo extends Figura{

	public Triangulo(double lados[]) {
		super();
		lados = new double[3];
		for(int i=0; i<lados.length; i++) {
			this.lados[i]=lados[i];
		}
	}
}
