/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico1;

import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class TrabalhoPratico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> teste = FileManager.stringReader("./dados/teste_1.txt");
        for (String linha : teste) {
            System.out.println(linha);
            int acesso = Integer.parseInt(linha);
            int bin[] = intToBinary(acesso, 24);
            String stringBin = intToBinaryString(acesso, 24);
            System.out.println(stringBin);
        }
        int bin[] = intToBinary(3, 4);
        if (bin != null){
            for (int i = 0; i < bin.length; i++) {
                System.out.println(i + " - " + bin[i]);
            }
        }
        else {
            System.out.println("Numero de bits insuficiente..");
        }
    }

    public static int[] intToBinary(int value, int size) {
        if (value > Math.pow(2, size) - 1) {
            return null;
        }
        int bin[] = new int[size];
        int i = 0;
        while (value > 0 && i < size) {
            int num = value % 2;
            value = value / 2;
            bin[i] = num;
            i++;
        }
        for (int j = 0; j <= size / 2; j++) {
            int temp = bin[j];
            bin[j] = bin[size - j - 1];
            bin[size - j - 1] = temp;
        }
        return bin;
    }

    public static String intToBinaryString(int value, int size) {
        if (value > Math.pow(2, size) - 1) {
            return null;
        }
        char bin[] = new char[size];
        for (int i = 0; i < size; i++) {
            bin[i] = '0';
        }
        int i = 0;
        while (value > 0 && i < size) {
            int num = value % 2;
            value = value / 2;
            bin[i] = (num + "").charAt(0);
            i++;
        }
        for (int j = 0; j <= size / 2; j++) {
            char temp = bin[j];
            bin[j] = bin[size - j - 1];
            bin[size - j - 1] = temp;
        }
        String nova = new String(bin);
        return nova;
    }

}
