package ex01_comHeranca;

public class Quadrilatero extends Figura{
	public Quadrilatero(double lados[]) {
		lados = new double[4];
		for(int i=0; i<lados.length; i++) {
			this.lados[i]=lados[i];
		}
	}
}
