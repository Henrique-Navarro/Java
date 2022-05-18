package Aula011;

public class Tecnico extends Aluno{
	//atributos
	private int registroProfissional;
	
	//getters setters
	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	//metodos
	public void praticar() {
		System.out.println("Praticando....");
	}
}
