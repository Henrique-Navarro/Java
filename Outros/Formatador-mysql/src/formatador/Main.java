package formatador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static String categoria = "", enunciado = "", alt01 = "", alt02 = "", alt03 = "", alt04 = "", alt05 = "",
			correta = "", questoes = "";

	public static void main(String args[]) throws IOException {
		ler_arquivo();
		escrever_arquivo(questoes);
		System.out.println(questoes);
	}

	public static void ler_arquivo() throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader("./QUESTOES_OBFEP_2017.txt"));

		String linha = buffRead.readLine();
		while (linha != null) {
			categoria = linha;
			enunciado = buffRead.readLine();
			alt01 = buffRead.readLine();
			alt02 = buffRead.readLine();
			alt03 = buffRead.readLine();
			alt04 = buffRead.readLine();
			alt05 = buffRead.readLine();
			correta = buffRead.readLine();

			montar_questao();

			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void montar_questao() throws IOException {
		String texto = "";
		texto = "('" + categoria + "','" + enunciado + "','" + alt01 + "','" + alt02 + "','" + alt03 + "','" + alt04
				+ "','" + alt05 + "'," + correta + "),";
		// texto = "('" + categoria + "','" + enunciado + "','" + alt01 + "','" + alt02
		// + "','" + alt03 + "','" + alt04
		// + "'," + correta + "),";
		questoes = questoes + texto + "\n";
	}

	public static void escrever_arquivo(String texto) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("./FORMATADAS_OBFEP_2017.txt"));
		buffWrite.append(texto + "\n");
		buffWrite.close();
	}
}
