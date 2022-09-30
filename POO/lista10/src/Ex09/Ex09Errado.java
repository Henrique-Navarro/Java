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
/* O problema deste c�digo � que n�o � poss�vel identificar onde exatamente est� acontecendo a Exception
 * Uma vez que, manipula��es de arquivos costumam dar diversas Exceptions e Erros diferentes, podendo acontecer na abertura do arquivo,
 * em passar o nome do arquivo como par�metro, em escrever dados no arquivo, e em fechar o arquivo
 * Para se melhorar o c�digo, seria necess�rio saber exatamente quais Exceptions est�o acontecendo e onde elas est�o acontecendo*/