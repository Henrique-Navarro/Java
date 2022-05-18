package ex01_comHeranca;
public class Main {
	public static void main(String[] args) {
		double ladosTriangulo[] = new double[] {3,4,5};
		double ladosQuadrilatero[] = new double[] {7,8,9,10};

		Figura t1 = new Triangulo(ladosTriangulo);
		Figura q1 = new Quadrilatero(ladosQuadrilatero);

		System.out.println("PerímetroTriangulo: "+t1.calcularPerimetro());
		t1.exibirLados();
		
		System.out.println("PerímetroQuadrilatero:" +q1.calcularPerimetro());
		q1.exibirLados();
	}
}