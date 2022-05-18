package Ex03;

public class Ex03 {
	public static void main(String[] args) {
		Funcionario f1= new Funcionario("Henrique", 1200, "medico", 'M', 20);
		Funcionario f2= new Funcionario("Andressa", 2500, "enfermerira", 'F', 15);
		
		f1.mostrar();
		f2.mostrar();
	}
}
