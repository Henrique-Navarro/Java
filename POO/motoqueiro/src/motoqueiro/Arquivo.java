package motoqueiro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Arquivo {
	String nomeArquivo;
	ArrayList<Integer> entregas = new ArrayList<Integer>();

	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		lerArquivo(nomeArquivo);
		//printar();
	}

	public void lerArquivo(String nomeArquivo) {
		try { 
			String line = "";
			FileReader arq = new FileReader(nomeArquivo);
			@SuppressWarnings("resource")
			BufferedReader lerArq = new BufferedReader(arq);

			line = lerArq.readLine();
			while(line!=null) {
				int res = Integer.valueOf(line).intValue();
				entregas.add(res);
				line = lerArq.readLine();
			}
		}
		catch(Exception e) {
			System.out.println("Erro ao ler arquivo!: "+e);
			e.printStackTrace();
		}
	}

	public void printar() {
		for(int i=0; i<entregas.size(); i++) {
			System.out.println(i +": "+entregas.get(i));
		}
	}
}