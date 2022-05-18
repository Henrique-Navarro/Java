package ex01_semHeranca;
public class Main {
	public static void main(String[] args) {
		double ladosTriangulo[] = new double[] {3,4,5};
		double ladosQuadrilatero[] = new double[] {7,8,9,10};

		Triangulo t1 = new Triangulo(ladosTriangulo);
		Quadrilatero q1 = new Quadrilatero(ladosQuadrilatero);

		System.out.println("PerímetroTriangulo: "+t1.calcularPerimetro());
		t1.exibirLados();
		
		System.out.println("PerímetroQuadrilatero:" +q1.calcularPerimetro());
		q1.exibirLados();
		
		/*
		 * As principais desvantagem de não utilizar se herança é a 
		 * necessidade de escrever códigos duplicados, e a falta de organização
		 * dentro do código.
		 * Utilizando o conceito de herança, seria nescessário
		 * escrever menos quantidade de linhas de código duplicadas
		 * ou seja, resultando em um código mais limpo e eficiente, além de que
		 * ficaria mais organizado
		 * 
		 * */
	}
}
