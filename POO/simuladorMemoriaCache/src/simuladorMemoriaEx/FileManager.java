package simuladorMemoriaEx;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager{
	public FileManager(){}
	public FileManager(double qtdBitsEndereco) {
		this.qtdBitsEndereco=qtdBitsEndereco;
	}
	public ArrayList<String> stringReader (String path){ 
		BufferedReader buffRead = null;
		try {
			buffRead = new BufferedReader(new FileReader(path));
			ArrayList<String> text = new ArrayList<String>();
			String line = buffRead.readLine();
			while (line != null) {
				text.add(line);
				line = buffRead.readLine();
			}   buffRead.close();
			return text;
		} catch (FileNotFoundException ex) {
			Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		} catch (IOException ex) {
			Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		} finally {
			try {
				buffRead.close();
			} catch (IOException ex) {
				Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	} 

	public ArrayList<String> transformar(ArrayList<String> teste) {
		for (String linha : teste) {
			//System.out.println("Numero: "+linha);
			int acesso = Integer.parseInt(linha);
			int bin[] = intToBinary(acesso, 24);
			//bits total do endereço			
			//System.out.println(t.getQtdBitsEndereco());
			
			String stringBin = intToBinaryString(acesso, (int)qtdBitsEndereco);
			
			numerosBin.add(stringBin);
			//System.out.println("Binário: " +stringBin);
			
			//String tag = stringBin.substring(0, qtdBitsTag);
			//String linha = stringBin.substring(qtdBitTag, qtdBitTag+qtdBitsLinha);
		}
		
		int bin[] = intToBinary(3, 4);
		if (bin != null){
			for (int i = 0; i < bin.length; i++) {
				//System.out.println(i + " - " + bin[i]);
			}
		}
		else {
			System.out.println("Numero de bits insuficiente..");
		}
		
		return numerosBin;
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
	
	
	
	double qtdPalavrasRam;double memGastaLinhaCache;
	double qtdLinhasCache;double qtdBitsEndereco;
	double qtdBitsTag;double qtdBitsPalavra;double qtdBitsLinha;
	String tipoMap;
	ArrayList<String> numerosBin = new ArrayList<String>();

	public int[] lerConfig(String nomeConfig) {
		try { 
			FileReader arq = new FileReader(nomeConfig);
			BufferedReader lerArq = new BufferedReader(arq);
			String line = "";

			int mem, palavra, cacheTam, linha;
			String memUnidade, palavraUnidade, cacheUnidade, linhaUnidade;

			line = lerArq.readLine();
			line = line.replaceAll(";", "");
			String vetMem[] = line.split(" ");
			mem= Integer.parseInt(vetMem[2]);
			memUnidade= vetMem[3];
			mem = calcularTam(mem, memUnidade);

			line = lerArq.readLine(); 	
			line = line.replaceAll(";", "");
			String vetPalavra[] = line.split(" ");
			palavra = Integer.parseInt(vetPalavra[2]);
			palavraUnidade= vetPalavra[3];
			palavra = calcularTam(palavra, palavraUnidade);

			line = lerArq.readLine(); 	
			line = line.replaceAll(";", "");
			String vetCache[] = line.split(" ");
			cacheTam = Integer.parseInt(vetCache[2]);
			cacheUnidade= vetCache[3];
			cacheTam = calcularTam(cacheTam, cacheUnidade);

			line = lerArq.readLine(); 	
			line = line.replaceAll(";", "");
			String vetLinha[] = line.split(" ");
			linha = Integer.parseInt(vetLinha[2]);
			linhaUnidade = vetLinha[3];
			linha = calcularTam(linha, linhaUnidade);

			arq.close();

			System.out.println("\n_Configurações da Cache_");
			System.out.println("mem= "+(mem)+" B");
			System.out.println("palavra= "+(palavra)+" B");
			System.out.println("cache= "+(cacheTam)+" B");
			System.out.println("linha= "+(linha)+" pal");
			java.util.concurrent.TimeUnit.SECONDS.sleep(3);

			int cache[] = criarCache(mem, palavra, cacheTam, linha);
			return cache;

		}catch (Exception e) {System.out.println("Erro");}
		return null;
	}

	public int calcularTam(int variavel, String unidade) {
		switch(unidade) {
		case "B":
			variavel *= 1;
			break;
		case "KB":
			variavel *= 1024;
			break;
		case "MB":
			variavel *= 1024*1024;
			break;
		case "GB":
			variavel *= 1024*1024*1024;
			break;
		case "pal":
			break;
		}
		return variavel;
	}

	public int[] criarCache(int mem, int palavra, int cacheTam, int linha) {
		//double qtdPalavrasRam = mem/palavra;
		//double memGastaLinhaCache = palavra*linha;
		//double qtdLinhasCache = cacheTam / memGastaLinhaCache;
		//double qtdBitsEndereco = Math.ceil((Math.log(qtdPalavrasRam) / Math.log(2)));
		//double qtdBitsTag = Math.log(qtdLinhasCache) / Math.log(2);
		//double qtdBitsPalavra = Math.log(linha) / Math.log(2);
		//double qtdBitsLinha = qtdBitsEndereco - qtdBitsPalavra - qtdBitsTag;

		qtdPalavrasRam=mem/palavra;
		memGastaLinhaCache=palavra*linha;
		qtdLinhasCache=cacheTam / memGastaLinhaCache;
		qtdBitsEndereco=Math.ceil((Math.log(qtdPalavrasRam) / Math.log(2)));
		qtdBitsTag=Math.log(qtdLinhasCache) / Math.log(2);
		qtdBitsPalavra=Math.log(linha) / Math.log(2);
		qtdBitsLinha=qtdBitsEndereco - qtdBitsPalavra - qtdBitsTag;

		System.out.println("\n_Parâmetros da Cache_");
		System.out.println("\nqtdPalavrasRam: "+qtdPalavrasRam);
		System.out.println("memGastaLinhaCache: "+memGastaLinhaCache);
		System.out.println("qtdLinhasCache: "+qtdLinhasCache);
		System.out.println("qtdBitsEndereco: "+qtdBitsEndereco);
		System.out.println("qtdBitsTag: "+qtdBitsTag);
		System.out.println("qtdBitsPalavra: "+qtdBitsPalavra);
		System.out.println("qtdBitsLinha: "+qtdBitsLinha);
		try {
			java.util.concurrent.TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {e.printStackTrace();}

		int cache[] = new int[(int)qtdLinhasCache];

		switch(tipoMap) {
		case "DIRETO":
			mapeamentoDireto(cache, numerosBin, qtdBitsTag, qtdBitsLinha);
			break;
		case "ASSOCIATIVO":
			MapAssociativo ma = new MapAssociativo(qtdBitsTag, qtdBitsLinha);
			ma.mapeamentoAssociativo(cache, numerosBin);
			break;
		case "ASSCONJ":
			MapAssConj mac = new MapAssConj(qtdBitsTag, qtdBitsLinha);
			mac.mapeamentoAssConj(cache, numerosBin);
			break;
		default:
			break;
		}
		return cache;
	}
	
	
	
	public void mapeamentoDireto(int cache[], ArrayList<String> numerosBin, double qtdBitsTag, double qtdBitsLinha) {		
		long acertou=0, errou=0;
		for (int i=0; i<numerosBin.size(); i++) {
			//System.out.println(numerosBin.get(i));
			int tag = Integer.parseInt(numerosBin.get(i).substring(0, (int)qtdBitsTag));
			int linha = Integer.parseInt(numerosBin.get(i).substring((int)this.qtdBitsTag, (int)this.qtdBitsTag+(int)this.qtdBitsLinha));
			//String palavra = numerosBin.get(i).substring((int)(this.qtdBitsTag+this.qtdBitsLinha), (int)numerosBin.size());
			System.out.println("tag: "+tag);
			System.out.println("linha: "+linha);
			//System.out.println("palavra: " +palavra);*/
			/*for(int j=0; j<numerosBin.size(); i++) {
				if(cache[i]==numerosBin[j]) {
					
				}
			}*/

			if(cache[tag]!=linha) {
				cache[tag]=linha;
				errou++;
			}
			else if(cache[tag]==linha) {
				acertou++;
			}
		}
		System.out.println("\n\n_Executando MapDireto_\n");
		System.out.println("Acertou: "+acertou+"\nErrou: "+errou);
		System.out.println("Total execuções: "+(errou+acertou)+" Vezes");
		System.out.println("Taxa Acerto: "+acertou*100/(acertou+errou)+"%");
	}
}