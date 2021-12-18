public class App {
    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular();
        celularA.nome = "Iphone12"; // estado
        celularA.resolucao = 6.1f;
        celularA.sistemaOperacional = "IOS";
        celularA.memoria = 256;

        Celular celularB = new Celular();
        celularB.nome = "Xiomi";
        celularB.resolucao = 8.7f;
        celularB.sistemaOperacional = "Android";
        celularB.memoria = 128;

        System.out.format("\nCelular %s com tela de %.1f MP, sistema %s com memoria de %d gb\n", celularA.nome,
                celularA.resolucao, celularA.sistemaOperacional, celularA.memoria);

        System.out.format("\nCelular %s com tela de %.1f MP, sistema %s com memoria de %d gb\n", celularB.nome,
                celularB.resolucao, celularB.sistemaOperacional, celularB.memoria);

    }
}
