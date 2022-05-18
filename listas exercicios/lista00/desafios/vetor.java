import java.util.Scanner;

public class vetor {
    public static void main(){
        Scanner ler = new Scanner(System.in);

        int array[] = new int[5];

        int posic, num, tam= ler.nextInt();
        System.out.println("1- Adicionar\n2- Pesquisar\n3- Remover\n4- Ordenar\n5- Sair");
        while(true){
            int op= ler.nextInt();
            
            switch(op){
                //adicionar
                case 1:
                    System.out.println("Voce quer adicionar em qual posicao? ");
                    posic= ler.nextInt();
                    System.out.print("Voce quer adicionar qual numero");
                    num= ler.nextInt();
                    array.add(num);
                    System.out.printf("O numero %d foi adiciona na posicao %d", num, posic);

                //pesquisar
                case 2:
                    System.out.println("Voce quer procurar qual numero? ");
                    num= ler.nextInt();
                    posic= array.binarySearch(num,1);
                    System.out.print("Seu numero esta na posicao: "+posic);

                //remover
                case 3:
                    System.out.println("Voce quer remover pela posição? ");
                        String op2;
                        op2= ler.next();
                        op2.toUpperCase();

                        if((op2 == "SIM") || (op2== "S")){
                            posic= ler.nextInt();
                            pop
                        }
                        else if((op2 == "NAO") || (op2 == "N")){
                            //pesquisar posic
                            pop
                        }
            }
        }
    }
}
