package Ex04;

public class ControleRemoto extends Tevelisao implements Controle{
	//ControleRemoto herda atributos/métodos de Tevelisao e implementa os métodos de Controle
	//classe com métodos específicos
	//metodos abstratos
	@Override
	public void aumentarVolume() {
		this.setVolume(this.getVolume()+1);
	}
	@Override
	public void diminuirVolume() {
		this.setVolume(this.getVolume()-1);
	}
	@Override
	public void aumentarCanal() {
		this.setCanal(this.getCanal()+1);
	}
	@Override
	public void diminuirCanal() {
		this.setCanal(this.getCanal()-1);
	}
	@Override
	public void mudarCanal(int canal) {
		this.setCanal(canal);
	}
	@Override
	public void mostrarDados() {
		System.out.println("Canal: "+this.getCanal() +"\nVolume:"+ this.getVolume());
	}
	@Override
	public void mostrarVolume() {
		System.out.println("Volume: "+this.getVolume());
	}
	@Override
	public void mostrarCanal() {
		System.out.println("Canal: "+this.getCanal());
	}
}
