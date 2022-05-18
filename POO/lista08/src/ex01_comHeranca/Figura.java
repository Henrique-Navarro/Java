package ex01_comHeranca;

public class Figura {
	//atributtes
	protected double lados[];
	
	/*//constructor
	public Figura(double lados[]) {
		lados = new double[3];
		for(int i=0; i<lados.length; i++) {
			this.lados[i]=lados[i];
		}
	}
	public Figura(double lados[]) {
		lados = new double[4];
		for(int i=0; i<lados.length; i++) {
			this.lados[i]=lados[i];
		}
	}*/
	
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
