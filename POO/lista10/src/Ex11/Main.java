package Ex11;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(4);
		lista.add(7);
		lista.remove(2);
	}
}
/* e-) Sim. Na posi��o 2 da lista n�o foi adicionado nenhum dado, ent�o ao tentar remover ocorreu uma exce��o, 
pois tentou-se remover um valor que n�o existe.*/