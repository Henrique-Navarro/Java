package polimorfismo01;

import java.util.ArrayList;

public class Notificacao {
	Alarme alarme;
	ArrayList<Alarme> alarmes = new ArrayList<Alarme>();
	
	//METHODS
	public void addAlarme(Alarme alarme) {
		alarmes.add(alarme);
	}

	public void notificar() {
		for(Alarme alarme: alarmes) {
			alarme.tocar();
		}
	}
}
