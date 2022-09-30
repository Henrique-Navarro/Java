package Ex02;

public class ContaCorrente{
	protected double saldo;
	protected double taxa;

	public ContaCorrente(double saldo) {
		this.saldo=saldo;
		this.taxa=0.5;
	}

	public void depositar(double valor) {
		try {
			negativo(valor);
			saldo+=valor;
		}catch(ValorNegativo e) {
			System.out.println("Impossível operar com valores negativos");
		}
	}

	public void sacar(double valor){
		try {
			limite(valor);
			negativo(valor);
			saldo-=valor+((taxa/100)*valor);
		}catch(ValorNegativo e) {
			System.out.println("Impossível operar com valores negativos");
		}
		catch(ValorLimite e) {
			System.out.println("Impossível sacar valor maior que o saldo");
		}
	}

	public void exibir() {
		System.out.println("Saldo: R$"+saldo+"\n");
	}

	public void limite(double valor) throws ValorLimite{
		if(valor>saldo) {
			throw new ValorLimite();
		}
	}
	public void negativo(double valor) throws ValorNegativo{
		if(valor<0) {
			throw new ValorNegativo();
		}
	}
}
