package com.mycompany.arvore;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        boolean stop = false;
        Diretorio diretorioAtual;
        String diretorioAtualNome;

        while (!stop) {

            Scanner scan = new Scanner(System.in);
            diretorioAtualNome = scan.nextLine();

            //função para procurar em todos os diretorios, atualizando diretorio atual
            //função para criar no diretório atual ./
            
            Diretorio d1 = new Diretorio("Raiz");
            d1.adicionarFilho(diretorioAtualNome);
            d1.exibir();

            if (diretorioAtualNome.equals("exit")) {
                System.out.println("\n\nsaindo...");
                stop = true;
            }
        }
    }
}
