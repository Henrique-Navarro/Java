import java.util.Random;
public class Luta {
    // !atributos
    // *criar uma relação entre um tipo abstrato de dado (Lutador) com a instancia
    // de uma Classe
    // ? relacionamento tipo agregação Luta -> tem um -> Lutador
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // !metodos getter - setter
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador d) {
        this.desafiado = d;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean a) {
        this.aprovada = a;
    }

    // !metodos especificos
    public void marcarLuta(Lutador l1, Lutador l2) {
        // lutadores da mesma categoria
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            // desafiante e desafiado devem ser lutadores diferentes
            this.setAprovada(true);

            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.getAprovada() == true) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();

            Random random = new Random();
            int numero = random.nextInt(3);

            switch (numero) {
                case 0:
                    // !this.desafiado.setEmpates(this.desafiado.getEmpates() + 1);
                    // !this.desafiante.setEmpates(this.desafiante.getEmpates() + 1);
                    System.out.println("\n\nEmpatou\n\n");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    // !this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
                    // !this.desafiante.setVitorias(this.desafiante.getDerrotas() + 1);
                    System.out.println("\n\nO desafiado" + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    // !this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);
                    // !this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
                    System.out.println("\n\nO desafiante" + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Não foi possível acontecer");
        }
    }
}
