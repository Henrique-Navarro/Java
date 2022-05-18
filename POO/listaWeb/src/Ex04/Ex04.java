package Ex04;

public class Ex04 {
	public static void main(String[] args) {
		//só é possível mexer nos atributos pelo ControleRemoto
		ControleRemoto c1 = new ControleRemoto();
		c1.mostrarDados();
		c1.aumentarCanal();
		c1.diminuirVolume();
		c1.mudarCanal(100);
		c1.mostrarDados();
	}
}
