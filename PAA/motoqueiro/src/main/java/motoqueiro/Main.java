package motoqueiro;

import java.util.Collections;

public class Main {

    public static void main(String args[]) {
        //Path caminho = Paths.get("C:\\Users\\Usuario\\OneDrive\\Documentos\\IF\\Programação\\Java\\PAA\\motoqueiro\\teste.txt");
        Arquivo arq = new Arquivo("teste.txt");

        Collections.sort(arq.entregas);
        new Entrega(arq.entregas, new Motoqueiro(), new Motoqueiro());
        new Entrega2(arq.entregas, new Motoqueiro(), new Motoqueiro());
    }
}
