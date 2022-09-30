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
/* e-) Sim. Na posição 2 da lista não foi adicionado nenhum dado, então ao tentar remover ocorreu uma exceção, 
pois tentou-se remover um valor que não existe.*/