public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    // * metodo get retorna um valor
    // * metodo set atribui um valor

    // set - get modelo
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    // set - get ponta
    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    // set - get cor
    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    // set - get tampada
    public boolean getTampada() {
        return this.tampada;
    }

    // !public boolean setTampada(boolean t) {
    // ! this.tampada = t;}

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
        System.out.println(" ");
    }

    // *metodo construtor
    // * mesmo nome da classe
    public Caneta(String m, String c, float p) {
        this.tampar();
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
