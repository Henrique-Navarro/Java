package Ex04;

public class Quadrado {
	//atributos
	int l1,l2;
	
	//constructor
	public Quadrado(int l1, int l2){
		this.l1=l1;
		this.l2=l2;
	}
	
	//metodos
	public void area() {
		System.out.print("Area: "+l1*l2 +"\n");
	}

	public void mostrar() {
		if(l1==l2) {
			System.out.println("Quadrado com lado: " +l1+"\n");
		}
		else {
			System.out.println("Retangulo com lados: " +l1+" e "+ l2+"\n");
		}
	}
}
