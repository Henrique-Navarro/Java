package ifsuldeminas.academico;
import ifsuldeminas.funcionarios.Professor;
import java.util.ArrayList;
import java.util.Collections;

import ifsuldeminas.alunos.Aluno;

public class Disciplina {
	//ATTRIBUTES
	private String nome;
	private int periodo;
	private int numAulasSemana;
	private int numTotalAulas;
	private Professor professor;

	private ArrayList <Aluno> alunos;
	private ArrayList <Double> notas;
	private ArrayList <Integer> frequencias;

	private int qtdAprovados=0;
	private int qtdReprovados=0;

	//CONSTRUCTOR
	public Disciplina(String nome, int periodo, int numAulasSemana, int numSemanas) {
		this.nome = nome;
		this.periodo = periodo;
		this.numAulasSemana = numAulasSemana;
		this.numTotalAulas = numAulasSemana*numSemanas;
		this.professor = null;

		this.alunos = new ArrayList<Aluno>();
		this.notas = new ArrayList<Double>();
		this.frequencias = new ArrayList<Integer>();
	}

	public Disciplina(String nome, int periodo, int numAulasSemana, int numSemanas, Professor professor) {
		this.nome = nome;
		this.periodo = periodo;
		this.numAulasSemana = numAulasSemana;
		this.numTotalAulas = numAulasSemana*numSemanas;
		this.professor = professor;

		this.alunos = new ArrayList<Aluno>();
		this.notas = new ArrayList<Double>();
		this.frequencias = new ArrayList<Integer>();
	}

	//METHODS
	public boolean matricularAluno(Aluno aluno) {
		//não pode matricular mesmo RA
		for(int i=0; i<alunos.size(); i++) {
			if(aluno.getRa() == alunos.get(i).getRa()) {
				System.out.println("Não foi possivel adicionar o aluno: "+aluno);
				return false;
			}
		}

		alunos.add(aluno);
		frequencias.add(0);
		notas.add((double)0);
		return true;
	}

	public boolean desmatricularAluno(int posAluno) {
		alunos.remove(posAluno);
		frequencias.remove(posAluno);
		notas.remove(posAluno);

		if(alunos.get(posAluno)==null&&frequencias.remove(posAluno)==null&&notas.remove(posAluno)==null) {
			return true;
		}
		return false;
	}

	public boolean verificarRA(int ra) {
		for(int i=0; i<alunos.size(); i++) {
			if(ra == alunos.get(i).getRa()) {
				System.out.println("Não foi possivel adicionar RA: "+ra+" já existente");
				return false;
			}
		}
		return true;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void removerProfessor() {
		this.professor=null;
	}

	public int getNumeroAlunos() { 
		return alunos.size();
	}

	public boolean addNota(int posAluno, double nota) {
		notas.set(posAluno, nota);
		if(notas.get(posAluno)==null) {
			return false;
		}
		return true;
	}

	public boolean addFrequencia(int posAluno, int frequenciaTotal) {
		frequencias.set(posAluno, frequenciaTotal);
		if(frequencias.get(posAluno)==null) {
			return false;
		}
		return true;
	}

	public boolean estaAprovado(int posAluno) {
		/*System.out.println("Frequencia: "+frequencias.get(posAluno));
		System.out.println("Aula: "+numTotalAulas);
		System.out.println("Freq/aula: "+(double)frequencias.get(posAluno)/numTotalAulas);*/
		double frequenciaPorc=(double)frequencias.get(posAluno)/numTotalAulas*100;
		
		if(notas.get(posAluno)>=6 && frequenciaPorc>=75) {
			return true;
		}
		return false;
	}

	public void exibirReprovados() {
		System.out.println("\nReprovados:");
		for(int i=0; i<alunos.size(); i++) {
			if(!estaAprovado(i)) {
				System.out.println("O aluno "+alunos.get(i).getNome()+" está reprovado");
				qtdReprovados++;
			}
		}
		if(qtdReprovados==0 && alunos.size()>0) {
			System.out.println("Não há alunos reprovados");
		}
		if(alunos.size()==0) {
			System.out.println("Disciplina não possui alunos matriculados");
		}
	}

	public void exibirAprovados() {
		System.out.println("\nAprovados:");
		for(int i=0; i<alunos.size(); i++) {
			if(estaAprovado(i)) {
				System.out.println("O aluno "+alunos.get(i).getNome()+" está aprovado");
				qtdAprovados++;
			}
		}
		if(qtdAprovados==0 && alunos.size()>0) {
			System.out.println("Não há alunos aprovados");
		}
		if(alunos.size()==0) {
			System.out.println("Disciplina não possui alunos matriculados");
		}
	}
	
	public double calcularMedia() {
		double totalNotas=0;
		for(int i=0; i<notas.size(); i++) {
			totalNotas+=notas.get(i);
		}
		/*System.out.println(totalNotas);
		System.out.println(notas.size());
		System.out.println(totalNotas/notas.size());*/
		return totalNotas/notas.size();
	}

	public void exibirMaiorNota() {
		double maiorNota=0;
		int posic = 0;
		for(int i=0; i<notas.size(); i++) {
			if(notas.get(i)>maiorNota) {
				maiorNota=notas.get(i);
				posic=i;
			}
		}
		System.out.println("Maior nota é: "+maiorNota+ " do "+alunos.get(posic).getNome());
	}

	public void exibirMenorNota() {
		double menorNota=10;
		int posic=0;
		for(int i=0; i<notas.size(); i++) {
			if(notas.get(i)<menorNota) {
				menorNota=notas.get(i);
				posic=i;
			}
		}
		System.out.println("Menor nota é: "+menorNota+" do "+alunos.get(posic).getNome());
	}

	public int getQuantidadeReprovados() {
		//return qtdReprovados;
		qtdReprovados=0;
		for(int i=0; i<alunos.size(); i++) {
			if(!estaAprovado(i)) {
				qtdReprovados++;
			}
		}
		if(alunos.size()==0) {
			qtdReprovados=0;
		}
		return qtdReprovados;
	}

	public int getQuantidadeAprovados() {
		qtdAprovados=0;
		for(int i=0; i<alunos.size(); i++) {
			if(estaAprovado(i)) {
				qtdAprovados++;
			}
		}
		if(alunos.size()==0) {
			qtdAprovados=0;
		}
		return qtdAprovados;
	}

	public void exibirProfessor() {
		if(professor==null) {
			System.out.println("Disciplina não possui professor");
		}
		else {
			System.out.println(professor.exibirProfessor());
		}
	}

	public double getAproveitamentoAluno(int posAluno) {
		return (double)frequencias.get(posAluno)/numTotalAulas*100;
	}

	public double getNotaAluno(int posAluno) {
		return notas.get(posAluno);
	}
	
	public void setNotaAluno(int posAluno, double nota) {
		notas.set(posAluno, nota);
	}
	
	public int getFrequenciaAluno(int posAluno) {
		return frequencias.get(posAluno);
	}

	public int getAulasTotal() {
		return numTotalAulas;
	}
	
	public void setFrequenciaAluno(int posAluno, int frequencia) {
		frequencias.set(posAluno, frequencia);
	}
	
	public void exibirQuantidades() {
		System.out.println("Tamanhos: ");
		System.out.println("Alunos: "+alunos.size());
		System.out.println("Notas: "+notas.size());
		System.out.println("Frequencias: "+frequencias.size());
	}
	
	public void exibirAlunosAcimaMedia() {
		double media = calcularMedia();
		for(int i=0; i<alunos.size(); i++) {
			if(notas.get(i) >= media) {
				System.out.println("O aluno "+alunos.get(i).getNome()+" está acima da média");
			}
		}
		if(alunos.size()==0) {
			System.out.println("Disciplina não possui alunos matriculados");
		}
	}

	public void exibirAlunosAbaixoMedia() {
		double media = calcularMedia();
		for(int i=0; i<alunos.size(); i++) {
			if(notas.get(i) < media) {
				System.out.println("O aluno "+alunos.get(i).getNome()+" está abaixo da média");
			}
		}
		if(alunos.size()==0) {
			System.out.println("Disciplina não possui alunos matriculados");
		}
	}

	public void exibirAlunoNotaAproveitamento() {
		for(int i=0; i<alunos.size(); i++) {
			System.out.println("Aluno: "+alunos.get(i).getNome());
			System.out.println("Nota: "+notas.get(i));
			System.out.println("Aproveitamento: "+getAproveitamentoAluno(i)+"%\n");
		}
		if(alunos.size()==0) {
			System.out.println("Disciplina não possui alunos matriculados");
		}
	}

	public void desmatricularAlunos() {
		for(int i=0; i<alunos.size(); i++) {
			alunos.remove(i);
			notas.remove(i);
			frequencias.remove(i);
		}
	}

	public void exibirOrdenadosPorNota() {
		ArrayList<Double> notasClone= new ArrayList<Double>();
		for(int i=0; i<notas.size(); i++) {
			notasClone.add(i, notas.get(i));
		}
		Collections.sort(notasClone);
		System.out.println(notas);
		System.out.println(notasClone);
		for(int i=0; i<alunos.size(); i++) {
			System.out.println("Nota: "+notasClone.get(i));
		}
		if(alunos.size()==0) {
			System.out.println("Disciplina não possui alunos matriculados");
		}
	}

	public void exibirDisciplina(){
		if(alunos.size()==0) {
			System.out.println("Disciplina não possui alunos matriculados");
		}else {
			System.out.println("\nDados Da Disciplina:");
			System.out.println(professor.exibirProfessor());
			System.out.println("Alunos: ");
			for(int i=0; i<alunos.size(); i++) {
				System.out.println("Aluno: "+alunos.get(i).getNome());
				System.out.println("Nota: "+notas.get(i));
				System.out.println("Frequencia: "+frequencias.get(i)+"%\n");
			}
			System.out.println("Média turma: "+calcularMedia());
			System.out.println("Quantidade total de alunos: "+alunos.size());
			System.out.println("Quantidade de aprovados: "+getQuantidadeAprovados());
			System.out.println("Quantidade de reprovados: "+getQuantidadeReprovados());
		}
	}
}
