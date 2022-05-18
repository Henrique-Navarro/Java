package Aula054;

public class Teste {
	public static void main(String[] args) {
		usandoEnum();
	}
	
	//atribui valor constante a variavel
	public static void usandoEnum() {
		Constantes segunda = Constantes.SEGUNDA;
		Constantes terca = Constantes.TERCA;
		Constantes quarta = Constantes.QUARTA;
		Constantes quinta = Constantes.QUINTA;
		Constantes sexta = Constantes.SEXTA;
		Constantes sabado = Constantes.SABADO;
		Constantes domingo = Constantes.DOMINGO; 

		System.out.println("Usando enum em java");
	
		//passa a variavel como parâmetro, contendo valor constante
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	//receber uma constante e imprime o dia referente
	public static void imprimeDiaSemana(Constantes dia) {
		switch(dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA: 	
			System.out.println("Terca-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
}