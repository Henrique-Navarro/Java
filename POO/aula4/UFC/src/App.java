public class App {
    public static void main(String[] args) throws Exception {
        Lutador vetor[] = new Lutador[6];

        vetor[0] = new Lutador("Henrique", "Brasil", 12, 100, 100, 9, 5, 8);
        vetor[1] = new Lutador("Julio", "Portugal", 13, 130, 130, 8, 3, 5);
        vetor[2] = new Lutador("Paulo", "França", 14, 180, 180, 7, 2, 4);
        vetor[3] = new Lutador("Maria", "Argentina", 15, 200, 200, 6, 2, 3);
        vetor[4] = new Lutador("Joao", "Paranhol", 16, 220, 220, 5, 1, 2);
        vetor[5] = new Lutador("LOCO", "America", 17, 50, 210, 4, 0, 1);

        for (int i = 4; i < 6; i++) {
            vetor[i].apresentar();
        }
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(vetor[4], vetor[5]);
        UFC01.lutar();

        vetor[4].status();
        vetor[5].status();
    }
}
