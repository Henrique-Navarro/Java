package Ex05;

public class Ex05 {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0]= new Pessoa("Henrique", 20, 'M');
		p[1]= new Pessoa("Andressa", 15, 'F');
		
		l[0]= new Livro("Livro00", "Jose", 300, p[0]);
		l[1]= new Livro("Livro01", "Maria", 400, p[1]);
		l[2]= new Livro("Livro02", "Carlos", 500, p[0]);
		
		l[0].abrir();
		l[0].folhear(400);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
	}
}
