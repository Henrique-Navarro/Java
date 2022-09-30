/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * */
package heranca;

public class Main {
	public static void main(String[] args) {
		//numeroCarro, equipe
		Veiculo carroCorrida = new CarroCorrida(10, "Os 666");
		carroCorrida.exibirDados();
		
		//numero portas
		Veiculo carroPasseio = new CarroPasseio(4);
		carroPasseio.exibirDados();
		
		//bagagem
		Veiculo moto = new Moto(35);
		moto.exibirDados();
		
		//peso
		Veiculo caminhao = new Caminhao(560);
		caminhao.exibirDados();
	}
}