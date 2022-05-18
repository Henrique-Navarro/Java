public class App {
    public static void main(String[] args) throws Exception {
        //tipo nome

        //variável int
        //byte cabe apenas até o valor 127 
        byte numeroPequeno=127;
        short numeroShort=3276;
        int numeroInt=13891;
        //dps do numero grande coloca a letra l
        long numeroEnorme=1893783278l;

        //variavel ponto flutuante
        //colocar a letra f
        float peso= 78.9f;
        double pi= 3.1415926535;

        //variavel letra
        char letra= 'c';

        //variavel booleana
        boolean estouComFome= false;

        //variavel string
        String nome= "Lucas";
        String nomeCompleto= "Lucas doido";

        String data= "dia/mes";
        //!=
        String Data= "dia/mes";

        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroEnorme);

        System.out.println("Meu peso e de: " + peso);
        System.out.println("Meu nome completo e: " + nomeCompleto);

        System.out.println("Meu nome e " +nomeCompleto+ " tenho " +peso+ " quilos e " +numeroPequeno+ " de idade");
        System.out.format("Meu nome e %s tenho %.2f quilos e %d de idade\n", nomeCompleto, peso, numeroPequeno);

        String texto= String.format("Meu nome e %s tenho %.2f quilos e %d de idade\n", nomeCompleto, peso, numeroPequeno);
        System.out.println(texto);

        String mensagem1= "Ola, bom dia! ";
        String mensagem2= "Como vai voce?";
        String mensagemFinal= mensagem1+mensagem2;

        System.out.println(mensagemFinal);
    }
}
