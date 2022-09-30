package motoqueiro;

import java.util.ArrayList;

public class Motoqueiro {

    ArrayList<Integer> comidas;
    int tempoTotal;
    int entregaAtual;

    public Motoqueiro() {
        this.comidas = new ArrayList<Integer>();
        this.tempoTotal = 0;
        this.entregaAtual = 0;
    }
}
