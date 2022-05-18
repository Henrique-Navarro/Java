package Ex02;

public interface Operacoes {
	abstract public void armazenaPessoa(String nome, int idade, float altura);
	abstract public void removePessoa(String nome);
	abstract public int buscaPessoa(String nome);
	abstract public void imprimeAgenda();
	abstract public void imprimePessoa(int i);
}
