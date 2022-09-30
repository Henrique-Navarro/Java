/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package encapsulamento;

public class Main {
	public static void main(String[] args) {
		CarroCorrida c1 = new CarroCorrida(12, "henrique", "equipe666", 120);
		c1.exibirDados();
		
		c1.ligar();
		
		c1.acelerar(50);
		c1.acelerar(10);
		c1.frear(50);
		c1.acelerar(100);
	}
}