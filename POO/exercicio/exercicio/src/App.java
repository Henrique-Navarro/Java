public class App {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Henrique");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Alfenas");
        p2.abrirConta("CP");

        p1.depositar(500);
        p2.depositar(100);
        p2.sacar(250);

        p1.estado();
        p2.estado();
    }
}
