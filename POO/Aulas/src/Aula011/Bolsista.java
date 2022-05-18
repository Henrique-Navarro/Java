package Aula011;

public class Bolsista extends Aluno{
	//atributos
	private float bolsa;
	
	//getters setters
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	//metodos
	public void renovarBolsa() {
		
	}
	//ja existe na classe Aluno
	@Override //sobrepor
	public void pagarMensalidade() {
		System.out.println("Mensalidade de <Bolsista> Paga!");
	}
}
