package Ex02;

public class Ex02 {
	public static void main(String[] args){
		Animal animais[] = new Animal[3];
		animais[0]= new Animal("Terrestre");
		animais[1]= new Animal("Aquatico");
		animais[2]= new Animal("Aereo");


		for(int i=0; i<animais.length; i++){
			animais[i].mostrar();
		}
	}
}