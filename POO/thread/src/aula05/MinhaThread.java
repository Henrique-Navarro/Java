package aula05;

public class MinhaThread implements Runnable{
	private String nome;
	private int[] numeros;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThread(String nome, int[] numeros) {
		this.nome=nome;
		this.numeros=numeros;
		
		new Thread(this, nome).start();
		
		/*Thread t = new Thread(this, nome);
		t.start();*/
	}

	@Override
	public void run() {
		System.out.println(nome +" iniciada");
		int soma = calc.somaArray(numeros);
		System.out.println(soma +" -> soma");
		System.out.println(nome +" terminada");
	}
}
