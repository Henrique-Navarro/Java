package motoqueiro;

import java.util.ArrayList;
import java.util.Collections;

public class Entrega2 {

    ArrayList<Integer> entregas;
    ArrayList<Integer> entregasTotal;
    Motoqueiro motoqueiro01;
    Motoqueiro motoqueiro02;
    boolean acabou = false;
    int i = 0, posic = 0, tamanho;
    int menorDiffValue = 10000, menorDiffPosic01 = 0, menorDiffPosic02 = 0;

    public Entrega2(ArrayList<Integer> entregas, Motoqueiro motoqueiro01, Motoqueiro motoqueiro02) {
        this.entregas = entregas;
        this.entregasTotal = entregas;
        this.motoqueiro01 = motoqueiro01;
        this.motoqueiro02 = motoqueiro02;
        
        System.out.println("\n\n\nAlgoritmo02");
        System.out.println("_Total Entregas_");
        for (int i = 0; i < entregasTotal.size(); i++) {
            System.out.print(entregasTotal.get(i) + " ");
        }
        
        int ultimo01 = entregas.get(entregas.size() - 1);
        entregas.remove(entregas.size() - 1);
        int ultimo02 = entregas.get(entregas.size() - 1);
        entregas.remove(entregas.size() - 1);

        this.tamanho = entregas.size();

        while (i < tamanho) {
            decidirMotorista(i);

            menorDiffPosic01 = 10000;
            menorDiffPosic02 = 10000;
            menorDiffValue = 10000;
            i++;
            i++;
        }
        if (motoqueiro01.tempoTotal < motoqueiro02.tempoTotal) {
            motoqueiro01.tempoTotal += ultimo01;
            motoqueiro01.comidas.add(ultimo01);

            motoqueiro02.tempoTotal += ultimo02;
            motoqueiro02.comidas.add(ultimo02);

        } else {
            motoqueiro01.tempoTotal += ultimo02;
            motoqueiro01.comidas.add(ultimo02);

            motoqueiro02.tempoTotal += ultimo01;
            motoqueiro02.comidas.add(ultimo01);
        }
        //finalizar(motoqueiro01, motoqueiro02);
        printar();
    }

    public void printar() {

        System.out.println("\n\n_Entregas Motoqueiro01_");
        for (int i = 0; i < motoqueiro01.comidas.size(); i++) {
            System.out.print(motoqueiro01.comidas.get(i) + " ");
        }

        System.out.println("\n\n_Entregas Motoqueiro02_");
        for (int i = 0; i < motoqueiro02.comidas.size(); i++) {
            System.out.print(motoqueiro02.comidas.get(i) + " ");
        }

        System.out.println("\n\nTempo Motoqueiro01: " + motoqueiro01.tempoTotal + " min");
        System.out.println("\nTempo Motoqueiro02: " + motoqueiro02.tempoTotal + " min");

        if (motoqueiro01.tempoTotal >= motoqueiro02.tempoTotal) {
            System.out.println("\nMelhor tempo: " + motoqueiro01.tempoTotal);
        } else {
            System.out.println("\nMelhor tempo: " + motoqueiro02.tempoTotal + " min");
        }

        int diff = motoqueiro01.tempoTotal - motoqueiro02.tempoTotal;
        if (diff < 0) {
            diff = diff * (-1);
        }
        System.out.println("\nDiferença: " + (diff) + " min");
    }

    public void decidirMotorista(int i) {

        for (int j = 0; j < entregas.size(); j++) {
            for (int k = 0; k < entregas.size(); k++) {
                if (j != k) {
                    if (entregas.get(j) > entregas.get(k)) {
                        if (entregas.get(j) - entregas.get(k) <= menorDiffValue) {
                            menorDiffPosic01 = j;
                            menorDiffPosic02 = k;
                            menorDiffValue = entregas.get(j) - entregas.get(k);

                        }
                    } else {
                        if (entregas.get(k) - entregas.get(j) <= menorDiffValue) {
                            menorDiffPosic01 = k;
                            menorDiffPosic02 = j;
                            menorDiffValue = entregas.get(k) - entregas.get(j);

                        }
                    }
                }
            }
        }

        if (motoqueiro01.tempoTotal > motoqueiro02.tempoTotal) {

            motoqueiro02.tempoTotal += entregas.get(menorDiffPosic01) * 2;
            motoqueiro02.comidas.add(entregas.get(menorDiffPosic01));

            motoqueiro01.tempoTotal += entregas.get(menorDiffPosic02) * 2;
            motoqueiro01.comidas.add(entregas.get(menorDiffPosic02));

            entregas.remove(menorDiffPosic01);
            entregas.remove(menorDiffPosic02);

        } else if (motoqueiro01.tempoTotal < motoqueiro02.tempoTotal) {

            motoqueiro02.tempoTotal += entregas.get(menorDiffPosic02) * 2;
            motoqueiro02.comidas.add(entregas.get(menorDiffPosic02));

            motoqueiro01.tempoTotal += entregas.get(menorDiffPosic01) * 2;
            motoqueiro01.comidas.add(entregas.get(menorDiffPosic01));

            entregas.remove(menorDiffPosic01);
            entregas.remove(menorDiffPosic02);

        } else {

            motoqueiro02.tempoTotal += entregas.get(menorDiffPosic01) * 2;
            motoqueiro02.comidas.add(entregas.get(menorDiffPosic01));

            motoqueiro01.tempoTotal += entregas.get(menorDiffPosic02) * 2;
            motoqueiro01.comidas.add(entregas.get(menorDiffPosic02));

            entregas.remove(menorDiffPosic01);
            entregas.remove(menorDiffPosic02);
        }

    }

    public void adicionar(Motoqueiro motoqueiro, int entregaVez) {
        motoqueiro.comidas.add(entregaVez);
        motoqueiro.tempoTotal += entregaVez * 2;
        //motoqueiro.entregaAtual = entregaVez;
        posic++;
    }

    public void finalizar(Motoqueiro motoqueiro01, Motoqueiro motoqueiro02) {
        motoqueiro01.tempoTotal -= motoqueiro01.comidas.get(motoqueiro01.comidas.size() - 1);
        motoqueiro02.tempoTotal -= motoqueiro02.comidas.get(motoqueiro02.comidas.size() - 1);

    }
}
