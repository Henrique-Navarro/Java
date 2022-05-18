package ex02;

public class Main {
	public static void main(String[] args) {
		Pagamento p1 = new AVista(30);
		Pagamento p2 = new Parcelado(10, 5);

		p1.exibirValorAVista();
		p2.exibirValorParcelado();
		
		//Parcelado p1 = new Pagamento(100);
	}
}
