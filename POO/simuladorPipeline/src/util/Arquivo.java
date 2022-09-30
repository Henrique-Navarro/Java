package util;

import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
	String instrucao="";
	String nomeArquivo;

	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		lerArquivo(nomeArquivo);
	}

	public void lerArquivo(String nomeArquivo) {
		try {
			FileReader arq = new FileReader(nomeArquivo);
			BufferedReader lerArq = new BufferedReader(arq);
			String line = lerArq.readLine();

			while(line != null) {
				identificarInstrucao(line);
				line = lerArq.readLine();
			}
		}
		catch(Exception e) {
			System.out.println("ERRO: "+e);
			e.printStackTrace();
		}
	}

	public void identificarInstrucao(String line) {
		if(line.contains("add")) {
			line=line.replaceAll("add ", "");
		}
		else if(line.contains("sub")) {

		}
		else if(line.contains("lw")) {
			line=line.replaceAll("lw ", "");
			
			textoSeparado = proxInstrucao.split(" ");
		}else if(proxInstrucao.contains("mult")) {
			proxInstrucao = proxInstrucao.replaceAll("mult ", "");
			textoSeparado = proxInstrucao.split(" ");
			
			System.out.println(line);
		}
		else if(line.contains("sw")) {

		}
		else if(line.contains("mult")) {

		}
		else if(line.contains("div")) {

		}
		else if(line.contains("bltz")) {

		}
		else if(line.contains("bgtz")) {

		}
		else if(line.contains("bne")) {

		}
		else if(line.contains("beq")) {

		}
		else if(line.contains("j")) {

		}
		else if(line.contains("jr")) {

		}
		else if(line.contains("noop")) {

		}
	}
}
