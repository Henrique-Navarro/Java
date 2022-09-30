package Ex02;

public class Ex02 {
	public static void main(String[] args) {
		double valor=900;

		ContaCorrente c1= new ContaCorrente(1000);
		c1.sacar(valor);
		c1.depositar(valor);
		c1.exibir();

		ContaCorrente c2 = new ClienteEspecial(1000);
		c2.sacar(valor);
		c2.depositar(valor);
		c2.exibir();

	}
}
