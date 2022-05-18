package Ex01;

public class Pessoa {
	//atributos
	private String nome;
	private int dataNascimento;
	private int altura;
	
	//constructor
	protected Pessoa() {System.out.println("Objeto Criado!");}
	protected Pessoa(String nome, int dataNascimento, int altura) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setAltura(altura);
	}
	
	//metodos get - set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//metodos abstratos
	public void mostrarDados() {
		System.out.println("Nome: "+this.getNome() +"\nAnoNascimento: "+ this.getDataNascimento() +"\nAltura: "+ this.getAltura() +"\nIdade: "+this.calcIdade() +"\n");
	}
	
	public int calcIdade() {
		return 2022-this.getDataNascimento();
	}
}