package ex02;

public class Parcelado extends Pagamento{
	//atributtes
	private int numParcelas;
	private int jurosParcela;

	//constructor
	public Parcelado(int numParcelas, int jurosParcela) {
		super(jurosParcela/100*this.valor+this.valor);
		this.numParcelas=numParcelas;
		this.jurosParcela=jurosParcela;
	}

	//getters setters
	public int getNumParcelas() {
		return numParcelas;
	}
	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}
	public int getJurosParcela() {
		return jurosParcela;
	}
	public void setJurosParcela(int jurosParcela) {
		this.jurosParcela = jurosParcela;
	}

	//metodos
	public void exibirValorParcelado() {
		System.out.println("Valor por parcela: "+(jurosParcela/100)*getValor() + getValor()/numParcelas);
	}
}
