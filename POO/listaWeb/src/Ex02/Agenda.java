package Ex02;

public class Agenda implements Operacoes{
	//atributos
	private int tam;
	private Pessoa[] pessoa;

	//constructor
	public Agenda() {this.tam=0;}
	public Agenda(Pessoa pessoa) {
		this.pessoa[tam]= pessoa;
	}
	
	//getters setters
	public Pessoa[] getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa[] pessoa) {
		this.pessoa = pessoa;
	}
	
	//metodos
	@Override
	public void armazenaPessoa(String nome, int idade, float altura) {
		this.pessoa[tam].setNome(nome);
		this.pessoa[tam].setIdade(idade);
		this.pessoa[tam].setAltura(altura);
		this.tam++;
		System.out.print("\nAdicionado!\n");
	}

	
	@Override
	public void removePessoa(String nome) {
		for(int i=0; i < pessoa.length; i++) {
			if(this.pessoa[i].getNome().equals(nome)) {
				this.pessoa[i].setNome(null);
				this.pessoa[i].setIdade(0);
				this.pessoa[i].setAltura(0);
				this.tam--;
				System.out.print("\nRemovido!\n");
				break;
			}
		}
	}

	@Override
	public int buscaPessoa(String nome) {
		int i;
		for(i=0; i < pessoa.length; i++) {
			if(this.pessoa[i].getNome().equals(nome)) {
				System.out.print("\nAchado!\n");
				break;
			}
		}
		return i;
	}

	@Override
	public void imprimeAgenda() {
		for(int i=0; i < pessoa.length; i++) {
			System.out.println("Nome: "+pessoa[i].getNome() +"\nIdade: "+ pessoa[i].getIdade() +"\nAltura: "+ pessoa[i].getAltura());
		}
	}

	@Override
	public void imprimePessoa(int i) {
		System.out.println("Nome: "+ pessoa[i].getNome() +"\nIdade: "+ pessoa[i].getIdade() +"\nAltura: "+ pessoa[i].getAltura());
	}
}