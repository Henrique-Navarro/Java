import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*int numero;
        //Scanner -> classe
        Scanner leitor= new Scanner(System.in);
        numero= leitor.nextInt();
        System.out.println(numero);

        float num;
        Scanner ler= new Scanner(System.in);
        num= ler.nextFloat();
        System.out.format("O numero e: %.2f\n",num);

        //next le até o espaço " "
        //ler até quebra de linha
        String nomeCompleto;
        Scanner leitura= new Scanner(System.in);
        leitura.useDelimiter("[\r\n]+");
        nomeCompleto= leitura.next();
        System.out.println(nomeCompleto);*/


        //EXEMPLO
        String elo;
        int tier;
        String campeao;

        Scanner ler= new Scanner(System.in);

        elo= ler.nextLine();

        //tier= ler.nextInt();
        String valor;
        valor= ler.nextLine();
        tier= Integer.parseInt(valor);


        //lendo o \n do int de cima(fica bugado)
        //por segurança usar o nextLine inves do nextInt
        campeao= ler.nextLine();

        System.out.format("%s %d %s\n",elo, tier+2, campeao);
    }
}
