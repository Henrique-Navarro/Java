package Ex03;

public class Ex03 {
	public static void main(String[] args) {
		Elevador e1 = new Elevador();
		
		e1.iniciar(22, 2);
		e1.entrar();
		e1.entrar();
		e1.mostrarDadosAtual();
		e1.sair();
		e1.mostrarDadosAtual();
		e1.sair();
		e1.mostrarDadosAtual();
		e1.sair();
		e1.mostrarDadosAtual();
	}
}
