package polimorfismo01;

public class Main {
	public static void main(String[] args) {
		//VOLUME, DURACAO
		Alarme despertador = new Despertador("Alto", 5);
		Alarme ambulancia = new Ambulancia("Médio", 3);
		Alarme relogioMedieval = new RelogioMedieval("Baixo", 1);
		
		Notificacao n1 = new Notificacao();
		n1.addAlarme(despertador);
		n1.addAlarme(ambulancia);
		n1.addAlarme(relogioMedieval);
		
		n1.notificar();
		
		/*
		 * 5- O método polimórfico notificar é capaz de fazer várias funções diferentes
		 * dependendo do objeto que se esta lidando. Por exemplo se o objeto acessado for um
		 * despertador, então o método da classe Despertador será executado.
		 * Não será necessário fazer nenhuma alteração, nem na classe Notificacao nem na classe Alarme
		 * Não será necessário fazer nenhuma alteração, nem no método addAlarme(), nem no método notificar()*/
	}
}
