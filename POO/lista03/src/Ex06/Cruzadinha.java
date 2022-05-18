package Ex06;

public class Cruzadinha {
	//atributos
	private String v1,v2,v3,v4; 
	
	//constructor
	public Cruzadinha(String v1, String v2, String v3, String v4) {
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
		this.v4=v4;
	}
	
	//metodos
	public void mostrar() {
		if(this.v1=="classe" && this.v2=="String" && this.v3=="atributo" && this.v4=="new") {
			System.out.println("Valores corretos");
		}
		else {
			System.out.println("Valores incorretos");
		}
	}
}
