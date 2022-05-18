package ex01_semHeranca;
public class Main {
	public static void main(String[] args) {
		double ladosTriangulo[] = new double[] {3,4,5};
		double ladosQuadrilatero[] = new double[] {7,8,9,10};

		Triangulo t1 = new Triangulo(ladosTriangulo);
		Quadrilatero q1 = new Quadrilatero(ladosQuadrilatero);

		System.out.println("Per�metroTriangulo: "+t1.calcularPerimetro());
		t1.exibirLados();
		
		System.out.println("Per�metroQuadrilatero:" +q1.calcularPerimetro());
		q1.exibirLados();
		
		/*
		 * As principais desvantagem de n�o utilizar se heran�a � a 
		 * necessidade de escrever c�digos duplicados, e a falta de organiza��o
		 * dentro do c�digo.
		 * Utilizando o conceito de heran�a, seria nescess�rio
		 * escrever menos quantidade de linhas de c�digo duplicadas
		 * ou seja, resultando em um c�digo mais limpo e eficiente, al�m de que
		 * ficaria mais organizado
		 * 
		 * */
	}
}
