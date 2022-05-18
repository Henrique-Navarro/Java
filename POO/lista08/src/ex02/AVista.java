package ex02;

public class AVista extends Pagamento{
	//atributtes
	private int desconto;

	//constructor
	public AVista(int desconto) {
		super();
		this.desconto=desconto;
	}
	
	//getters setters
	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	//metodos
	public void exibirValorAVista() {
		System.out.println("Valor com desconto: "+ (desconto/100*getValor()-getValor()));
	}
}
