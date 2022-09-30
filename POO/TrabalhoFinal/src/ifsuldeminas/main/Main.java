package ifsuldeminas.main;

import java.util.Random;
import java.util.Scanner;

import ifsuldeminas.academico.Disciplina;
import ifsuldeminas.alunos.Aluno;
import ifsuldeminas.funcionarios.Professor;

public class Main {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		int numAulas=20;
		int numSemanas=5;

		Disciplina d1 = new Disciplina("Matemática",2, numAulas, numSemanas);

		Aluno a01 = new Aluno("Henrique", 110, "Engenharia Computação");
		Aluno a02 = new Aluno("  João  ", 120, "Engenharia Computação");
		Aluno a03 = new Aluno("  Breno ", 130, "Engenharia Computação");
		Aluno a04 = new Aluno("  Paulo ", 140, "Engenharia Computação");
		Aluno a05 = new Aluno("  Aline ", 150, "Engenharia Computação");
		Aluno a06 = new Aluno(" Vitória", 160, "Engenharia Computação");
		Aluno a07 = new Aluno("Andressa", 170, "Engenharia Computação");
		Aluno a08 = new Aluno(" Rafael ", 180, "Engenharia Computação");
		Aluno a09 = new Aluno("Maurício", 190, "Engenharia Computação");
		Aluno a10 = new Aluno("  Maria ", 200, "Engenharia Computação");

		d1.matricularAluno(a01);
		d1.matricularAluno(a02);
		d1.matricularAluno(a03);
		d1.matricularAluno(a04);
		d1.matricularAluno(a05);
		d1.matricularAluno(a06);
		d1.matricularAluno(a07);
		d1.matricularAluno(a08);
		d1.matricularAluno(a09);
		d1.matricularAluno(a10);

		for(int i=0; i<10; i++) {
			Random rand = new Random();
			double notaRand=rand.nextInt((10 - 4) + 1) + 4;
			int freqRand=rand.nextInt((100 - 65) + 1) + 65;
			d1.addNota(i, notaRand);
			d1.addFrequencia(i, freqRand);
		}

		Professor p1 = new Professor("Humberto", 12345);

		d1.setProfessor(p1);

		Scanner scan = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\nDigite uma opção:");
			opcao = scan.nextInt();
			switch(opcao) {
			case 1:
				d1.exibirDisciplina();
				break;

			case 2:
				System.out.println("Numero de alunos: "+d1.getNumeroAlunos());
				d1.exibirAprovados();
				d1.exibirReprovados();
				break;

			case 3:
				d1.exibirAprovados();
				break;

			case 4:
				d1.exibirReprovados();
				break;

			case 5:
				d1.exibirMaiorNota();
				d1.exibirMenorNota();
				break;

			case 6:
				d1.exibirProfessor();
				break;

			case 7:
				System.out.println("Media: "+d1.calcularMedia());
				d1.exibirAlunosAcimaMedia();
				break;

			case 8:
				System.out.println("Media: "+d1.calcularMedia());
				d1.exibirAlunosAbaixoMedia();
				break;

			case 9:
				d1.exibirAlunoNotaAproveitamento();
				break;

			case 10:
				d1.exibirOrdenadosPorNota();
				break;

			case 11:
				System.out.println("Digite o Nome: ");
				String nome = scan.next();
				
				/*int ra=0;
				while(!(ra>0&&ra<9999)) {
					System.out.println("Digite o RA: ");
					ra = scan.nextInt();
				}*/
				int ra;
				while(true) {
					System.out.println("\nDigite o RA: ");
					ra = scan.nextInt();
					if(ra>=0&&ra<=9999&&d1.verificarRA(ra))break;
					System.out.println("Valor incorreto!\nValor entre [0, 9999]");
				}
				
				System.out.println("\nDigite o Curso: ");
				String curso = scan.next();

				Aluno aluno = new Aluno(nome, ra, curso);
				boolean adicionou=d1.matricularAluno(aluno);

				double nota;
				while(true) {
					System.out.println("\nDigite a nota: ");
					nota = scan.nextDouble();
					if(nota>=0&&nota<=10)break;
					System.out.println("Valor incorreto!\nValor entre [0, 10]");
				}
				
				int frequencia;
				while(true) {
					System.out.println("\nDigite a frequência: ");
					frequencia = scan.nextInt();
					if(frequencia>=0&&frequencia<=d1.getAulasTotal())break;
					System.out.println("Valor incorreto!\nValor entre [0, "+d1.getAulasTotal()+"]");
				}

				int posic= d1.getNumeroAlunos()-1;

				//d1.exibirQuantidades();
				
				d1.setFrequenciaAluno(posic, frequencia);
				d1.setNotaAluno(posic, nota);

				if(adicionou) {
					System.out.println("\nAluno adicionado com sucesso!");
				}
				else {
					System.out.println("\nErro ao adicionar aluno!");
				}
				break;

			case 0:
				d1.desmatricularAlunos();
				d1.removerProfessor();
				break;
				
				default:
					System.out.println("Opção inválida [0, 11]");
			}
		}while(opcao!=0);
		System.out.println("\n\nFinalizado...\n");
		scan.close();
	}
}
