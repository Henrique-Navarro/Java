package Ex09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex09Errado {
	public static void main(String[] args) {
		salvar("text.txt", "12345");
	}

	public static void salvar(String arquivo, String dados) {
		try {
			OutputStream out = new FileOutputStream(arquivo);
			out.write(dados.getBytes());
			out.close();
		}
		catch(Exception e) {
			System.out.println("Erro");
			e.printStackTrace();
		}
	}
}
/* O problema deste código é que não é possível identificar onde exatamente está acontecendo a Exception
 * Uma vez que, manipulações de arquivos costumam dar diversas Exceptions e Erros diferentes, podendo acontecer na abertura do arquivo,
 * em passar o nome do arquivo como parâmetro, em escrever dados no arquivo, e em fechar o arquivo
 * Para se melhorar o código, seria necessário saber exatamente quais Exceptions estão acontecendo e onde elas estão acontecendo*/