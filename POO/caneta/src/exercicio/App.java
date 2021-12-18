
public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();

        c1.cor = "Azul";

        // erro pq atributo ponta está privado
        c1.ponta = 0.5f;

        // atributos protegidos, funciona pq a Classe App, dentro do metodo principal /
        // função main utiliza a classe Caneta

        c1.tampa = false;
        c1.carga = 90;

        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Microsoft";
        c2.cor = "Amarela";
        c2.destampar();
        c2.status();
    }
}
