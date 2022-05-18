package ex02;

/*
 * (a)Aponte a superclasse.
 * Superclasse: Pagamento
 * 
 * (b) Podemos dizer que todo objeto Parcelado � tamb�m um objeto Pagamento?
 * Todos os objetos Parcelado s�o tamb�m Pagamento, pois Parcelado � filho de Pagamento
 * 
 * (c) Podemos dizer que todo objeto Pagamento � um objeto AVista?
 * Nenhum objeto Pagamento � um objeto Avista, pois Pagamento � pai de AVista
 * 
 * */

public abstract class Pagamento {
	//atributtes
	protected double valor;

	//constructor
	public Pagamento(double valor) {
		this.valor = valor;
	}

	//getters setters
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	//metodos
	public void exibirValor() {
		System.out.println("Valor: "+valor);
	}
}
