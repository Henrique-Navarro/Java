public class App {
    public static void main(String[] args) throws Exception {
        // * crio uma caneta passando poucos parametros, e com poucos comandos
        Caneta c1 = new Caneta("BIC", "Azul", 0.2f);

        // acessou o atributo pelo metodo acessor
        c1.setModelo("BIC");

        // acessou diretamente o atributo
        // não da erro pq o atributo 'modelo' é public
        c1.modelo = "BIC";

        // acessou o atributo pelo metodo acessor
        c1.setPonta(0.5f);
        
        // acessou diretamente o atributo
        // da erro pq o atributo 'ponta' é private
        // ! c1.ponta = 0.5f;

        c1.status();

        Caneta c2 = new Caneta("LOCA", "Laranja", 1.5f);
        c2.status();
    }
}
