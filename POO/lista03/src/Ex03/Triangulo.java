package Ex03;

public class Triangulo{
	//atributos
	public int lado1, lado2, lado3, angulo1, angulo2, angulo3;
	boolean exists;

	//constructor
	public Triangulo(int lado1, int lado2, int lado3, int angulo1, int angulo2, int angulo3){
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
		this.angulo1=angulo1;
		this.angulo2=angulo2;
		this.angulo3=angulo3;
		if((existencia(lado1, lado2, lado3)==true) && (angulo1+angulo2+angulo3==180)) {
			this.exists=true;} else {this.exists=false;}
	}

	//metodos
	public boolean existencia(int lado1, int lado2, int lado3) {
		if((lado1> Math.abs(lado2-lado3)) && (lado1<lado2+lado3)) {return true;} else{return false;}
	}
	public void area() {
		
	}
	public void mostrar(){
		System.out.println(exists +"\nlados: "+ lado1 +" "+ lado2 +" "+ lado3 +"\n"+"angulos: "+ angulo1 +" "+ angulo2 +" "+ angulo3 +"\n");
	}
}