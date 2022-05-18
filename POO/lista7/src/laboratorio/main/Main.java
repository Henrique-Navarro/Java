/*
 * Feito por:
 * Henrique Navarro Morais
 * João Pedro Xavier
 * 5° Período eng. comp.
 * Lista7 - Programação Orientada a Objetos
 */

package laboratorio.main;
import laboratorio.util.Tempo;
import laboratorio.mistura.*;

public class Main {
	public static void main(String[] args) {
		Tempo t1 = new Tempo();
		Tempo t2 = new Tempo();
		Tempo t3 = new Tempo();

		//hh:mm:ss
		t1.setTempo(12, 30, 59);
		t2.setTempo(20, 12, 36);
		t3.setTempo(9, 25, 47);
			/*TESTE:
			System.out.println(t1.exibirTempo());
			System.out.println(t2.exibirTempo());*/
			
		//nome, tempo
		Mistura m1 = new Mistura("Azul", t1);
		Mistura m2 = new Mistura("Verde", t2);
		Mistura m3 = new Mistura("Lilás", t3);
			/*TESTE:
			m1.exibirMistura();
			m2.exibirMistura();*/
		
		Experimento e1 = new Experimento();
		System.out.println("Mistura foi adicionada? "+e1.registrarMistura(m1));
		System.out.println("Mistura foi adicionada? "+e1.registrarMistura(m2));
		System.out.println("Mistura foi adicionada? "+e1.registrarMistura(m3));
	
		e1.exibirExperimento();
	}
}
