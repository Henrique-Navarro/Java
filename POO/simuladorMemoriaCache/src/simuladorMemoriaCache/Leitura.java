package simuladorMemoriaCache;
import java.io.*;
import java.util.*;
public class Leitura {

	public static void main(String[] args) {
		//arquivos de configuração
		lerConfig("config.txt");

		//arquivo teste1
		/*String teste1 = ler("teste_1.txt");
		if(teste1.isEmpty())
			System.out.println("Vazio!");
		else
			System.out.println(teste1);

		//arquivo teste2
		String teste2 = ler("teste_2.txt");
		if(teste2.isEmpty())
			System.out.println("Vazio!");
		else
			System.out.println(teste2);*/

		//System.out.println(teste1.length());
		//System.out.println(teste2.length());
	}

	public static void lerConfig(String nomeConfig) {
		try { 
			FileReader arq = new FileReader(nomeConfig);
			BufferedReader lerArq = new BufferedReader(arq);
			String line = "";

			int mem;
			String memUnidade;

			int palavra;
			String palavraUnidade = "";

			int cache;
			String cacheUnidade = "";

			int linha;
			String linhaUnidade = "";

			line = lerArq.readLine();
			line = line.replaceAll(";", "");
			String vetMem[] = line.split(" ");
			mem= Integer.parseInt(vetMem[2]);
			memUnidade= vetMem[3];

			line = lerArq.readLine(); 	
			line = line.replaceAll(";", "");
			String vetPalavra[] = line.split(" ");
			palavra = Integer.parseInt(vetPalavra[2]);
			palavraUnidade= vetPalavra[3];

			line = lerArq.readLine(); 	
			line = line.replaceAll(";", "");
			String vetCache[] = line.split(" ");
			cache = Integer.parseInt(vetCache[2]);
			cacheUnidade= vetCache[3];

			line = lerArq.readLine(); 	
			line = line.replaceAll(";", "");
			String vetLinha[] = line.split(" ");
			linha = Integer.parseInt(vetLinha[2]);
			linhaUnidade = vetLinha[3];

			System.out.println("mem= "+(mem)+" "+memUnidade);
			System.out.println("palavra= "+(palavra)+" "+palavraUnidade);
			System.out.println("cache= "+(cache)+" "+cacheUnidade);
			System.out.println("linha= "+(linha)+" "+linhaUnidade);

			arq.close();
		}catch (Exception e) {System.out.println("Erro");}
	}

	public static String ler(String nomeArquivo) {
		String conteudo = "";
		try { 
			FileReader arq = new FileReader(nomeArquivo);
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";

			linha = lerArq.readLine(); 			
			while(linha!=null) {
				//System.out.println(linha);
				conteudo += linha+"\r\n";
				linha = lerArq.readLine();
			}
			arq.close();

		}catch (Exception e) {conteudo = "Erro";}
		if(conteudo.contains("Erro")) 
			return "";
		else 
			return conteudo;
	}
}
