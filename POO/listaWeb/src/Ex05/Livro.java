package Ex05;

public class Livro implements Publicacao{
	//atributos
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//constructor
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	//metodos getters setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totPaginas) {
		this.totalPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	//metodos abstratos
	public String detalhes() {
		return "titulo=" + titulo + "\nautor=" + autor + "\ntotalPaginas=" + totalPaginas + "\npagAtual=" + pagAtual + "\naberto=" + aberto + "\nleitor=" + leitor.getNome() +" "+ leitor.getIdade() +" "+ leitor.getSexo();
	}
	@Override
	public void abrir() {
		this.setAberto(true);
	}
	@Override
	public void fechar() {
		this.setAberto(false);
	}
	@Override
	public void folhear(int p) {
		this.pagAtual = p;
	}
	@Override
	public void avancarPag() {
		this.pagAtual++;
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}
