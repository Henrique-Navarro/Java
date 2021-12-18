
public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    protected boolean tampa;

    protected void tampar() {
        this.tampa = true;
    }

    public void rabiscar() {
        if (tampa == true) {
            System.out.println("Estou rabiscando");
        } else {
            System.out.println("Não é possível");
        }
    }

    protected void destampar() {
        // this é referencia ao proprio objeto que chamou a função
        // c1.destampar
        // this -> c1

        // apenas pode modificar um atributo privado dentro da propria classe
        this.tampa = false;
    }

    public void status() {
        System.out.println("Caneta: " + this.cor);
        System.out.println("Tampada? " + this.tampa);
        System.out.println("Cor: " + this.cor);
    }
}
