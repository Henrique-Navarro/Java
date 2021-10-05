
import java.util.Scanner;
public class exerc2 {
    public static void main(String[]  args){
        Scanner ler= new Scanner(System.in);
        String nome,sexo,estado;
        int anos;
        
        nome= ler.next();
        nome=nome.toUpperCase();
        sexo= ler.next();
        sexo=sexo.toUpperCase();
        estado= ler.next();
        estado=estado.toUpperCase();

        if(sexo.equals("F") && (estado.equals("CASADA"))){
            anos= ler.nextInt();
            System.out.printf("\nNome: %s\nSexo: %s\nEstado: %s\nAnos: %d\n", nome,sexo,estado,anos);
        }
        else{
            System.out.printf("\nNome: %s\nSexo: %s\nEstado: %s\n", nome,sexo,estado);
        }
    }
}
