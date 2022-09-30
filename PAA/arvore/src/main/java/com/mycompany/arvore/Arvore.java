package com.mycompany.arvore;

public class Arvore {

    private Diretorio raiz;
    private Diretorio diretorioAtual;

    public Arvore() {
        //PRIMEIRO DIRETORIO A SER CRIADO, SERÁ A RAIZ
        raiz = new Diretorio();
        diretorioAtual = this.raiz;
    }

    public void adicionar(Diretorio diretorioAtual) {
        //DIRETORIO ATUAL 
        diretorioAtual.adicionarFilho(new Diretorio());
    }
}
