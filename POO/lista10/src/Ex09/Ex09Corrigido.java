package Ex09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex09Corrigido {
	public static void main(String[] args) {
		salvar("text.txt", "12345");
	}

	public static void salvar(String arquivo, String dados) {
		try {
			OutputStream out = new FileOutputStream(arquivo);
			out.write(dados.getBytes());
			out.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro: "+e);
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Erro: "+e);
			e.printStackTrace();
		}
	}
}