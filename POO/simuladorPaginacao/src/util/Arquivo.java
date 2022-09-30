package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Arquivo {
	 long tamVirtual;
	 long tamFisica;
	 long acessos;
	
	 long memVirtual[];
	 long memFisica[];
	 long arrayAcessos[];
	
	String nomeArquivo;
	
	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		lerArquivo(nomeArquivo);
	}
	
	public  void lerArquivo(String nomeArquivo) {
		try { 
			//LER ARQUIVO
			String line = "";
			FileReader arq = new FileReader(nomeArquivo);
			BufferedReader lerArq = new BufferedReader(arq);

			line = lerArq.readLine();
			tamVirtual=tratarArquivo(line, "virtual"); 
			System.out.println("Virtual: "+tamVirtual);

			line = lerArq.readLine();
			line=removeAccents(line);
			tamFisica=tratarArquivo(line, "fisico");
			System.out.println("Físico: "+tamFisica);

			line = lerArq.readLine();
			acessos=tratarArquivo(line, "acesso");
			System.out.println("Acessos: "+acessos+"\n");
			
			memVirtual=new long[(int)tamVirtual];
			memFisica=new long[(int)tamFisica];
			arrayAcessos=new long[(int)acessos];
			 
			//PREENCHER ARRAY ACESSOS
			int posic=0;
			line = lerArq.readLine();
			while(line!=null) {
				long res = Long.valueOf(line).longValue();
				arrayAcessos[posic]=res;
				line = lerArq.readLine();
				posic++;
			}
			
			//PREENCHER A FÍSICA
			for(int i=0; i<memVirtual.length;i++) {
				memVirtual[i]=-1;
			}
			
			//PREENCHER A VIRTUAL
			for(int i=0; i<memFisica.length;i++) {
				memFisica[i]=-1;
			}
			
			//printarArrays("virtual");
			//printarArrays("fisica");
			//printarArrays("acessos");
			//printarArrays("tamanhos");
			
			arq.close();
		}
		catch(Exception e) {
			System.out.println("Erro ao ler arquivo!: "+e);
			e.printStackTrace();
		}
	}
	
	public  void printarArrays(String op) {
		switch(op) {
		case "virtual":
			System.out.println("Memória Virtual: ");
			for(int i=0;i<memVirtual.length;i++) {
				System.out.println(memVirtual[i]);
			}
			break;
			
		case "fisica":
			System.out.println("Memória Física: ");
			for(int i=0;i<memFisica.length;i++) {
				System.out.println(memFisica[i]);
			}
			break;
			
		case "acessos":
			System.out.println("Acessos: ");
			for(int i=0;i<arrayAcessos.length;i++) {
				System.out.println(arrayAcessos[i]);
			}
			break;
			
		case "tamanhos":
			System.out.println("\nTam virtual: "+memVirtual.length);
			System.out.println("Tam fisica: "+memFisica.length);
			System.out.println("Tam acessos: "+arrayAcessos.length);
			break;
		}
	}

	public  long tratarArquivo(String line, String op) {
		long res = 0;
		switch(op) {
		case "virtual":
			line = line.replaceAll("Virtual: ", "");
			line = line.replaceAll("Memória Virtual: ", "");
			res=Long.valueOf(line).longValue();
			return res;

		case "fisico":
			line = line.replaceAll("Fisica: ", "");
			line = line.replaceAll("Memória Fisica: ", "");
			res=Long.valueOf(line).longValue();
			return res;

		case "acesso":
			res=Long.valueOf(line).longValue();
			return res;
		}
		return res;
	}

	public  String removeAccents(String value) {
	    String normalizer = Normalizer.normalize(value, Normalizer.Form.NFD);
	    Pattern pattern = Pattern.compile("[^\\p{ASCII}]");
	    return pattern.matcher(normalizer).replaceAll("");
	}
}