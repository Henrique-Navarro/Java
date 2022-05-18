package semaforo;

public class Main {
	public static void main(String[] args) {
		ThreadSemaforo t1 = new ThreadSemaforo("Semáforo01");
		
		//printar n vezes a cor e esperar mudar a cor
		for(int i=0; i<10; i++) {
			t1.escreverArquivo(t1.getCor());
			System.out.println(t1.getCor());
			
			t1.esperaCorMudar();
		}
		
		//desligar
		t1.desligarSemaforo();
	}
}
