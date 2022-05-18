public class Lutador {
    // !atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // !métodos getter - setter
    public int getAltura() {
        return altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPeso() {
        return peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        if (this.getPeso() >= 120) {
            this.setCategoria("Pesado");
        } else if (peso >= 100 && peso < 120) {
            this.setCategoria("Medio");
        } else if (peso < 100) {
            this.setCategoria("Leve");
        }
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    // !metodos especificos
    public void apresentar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitoria: " + this.getVitorias());
        System.out.println("Derrota: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println(" ");
    }

    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empatea: " + this.getEmpates());
        System.out.println(" ");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    // !metodos especiais
    public Lutador(String no, String na, int id, int al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
}