package ifsuldeminas.academico;
import ifsuldeminas.funcionarios.Professor;
import java.util.ArrayList;
import ifsuldeminas.alunos.Aluno;

public class Disciplina {
	//attributes
	private String nome;
	private int periodo;
	private int numAulasSemana;
	private int numTotalAulas;
	private Professor professor;

	private ArrayList <Aluno> alunos;
	private ArrayList <Double> notas;
	private ArrayList <Integer> frequencias;

	//constructor
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

	//metodos
	public boolean matricularAluno(Aluno aluno) {
		//não pode matricular mesmo RA
		for(int i=0; i<alunos.size(); i++) {
			if(aluno.getRa() == alunos.get(i).getRa()) {
				System.out.println("Não foi possivel adicionar o aluno: "+aluno);
				return false;
			}
		}
		if(alunos.add(aluno)&&frequencias.add(0)&&notas.add((double)0)) {
			return true;
		}
	}

	public boolean desmatricularAluno(int posAluno) {

	}
}
