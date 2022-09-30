package polimorfismo01;

public class Main {
	public static void main(String[] args) {
		//VOLUME, DURACAO
		Alarme despertador = new Despertador("Alto", 5);
		Alarme ambulancia = new Ambulancia("M�dio", 3);
		Alarme relogioMedieval = new RelogioMedieval("Baixo", 1);
		
		Notificacao n1 = new Notificacao();
		n1.addAlarme(despertador);
		n1.addAlarme(ambulancia);
		n1.addAlarme(relogioMedieval);
		
		n1.notificar();
		
		/*
		 * 5- O m�todo polim�rfico notificar � capaz de fazer v�rias fun��es diferentes
		 * dependendo do objeto que se esta lidando. Por exemplo se o objeto acessado for um
		 * despertador, ent�o o m�todo da classe Despertador ser� executado.
		 * N�o ser� necess�rio fazer nenhuma altera��o, nem na classe Notificacao nem na classe Alarme
		 * N�o ser� necess�rio fazer nenhuma altera��o, nem no m�todo addAlarme(), nem no m�todo notificar()*/
	}
}
