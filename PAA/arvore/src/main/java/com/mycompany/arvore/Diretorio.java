package com.mycompany.arvore;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Diretorio {

    //ATTRIBUTES
    ArrayList<Diretorio> filhos;
    String nome;
    DateTimeFormatter createDate;

    public Diretorio(String nome) {
        this.nome = nome;
        filhos = new ArrayList<Diretorio>();
        createDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    }

    public void adicionarFilho(String diretorioFilho) {
        filhos.add(new Diretorio(diretorioFilho));
    }

    public void exibir() {
        System.out.println("\nAtributos do diretorio: " + this.nome);
        System.out.println("nome: " + nome);
        System.out.println("data: " + createDate.format(LocalDateTime.now()));
        System.out.print("filhos: ");
        filhos.forEach((n) -> System.out.print(n.getNome() + " "));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
