package aula02;

public class MinhaThreadRunnable implements Runnable{
	//atributes
	private String name;
	private int time;

	//constructor
	public MinhaThreadRunnable(String name, int time) {
		//ATRIBUTOS
		this.name=name;
		this.time=time;

		//INICIALIZAR A THREAD
		Thread t = new Thread(this);
		t.start();	
	}

	@Override
	public void run() {

		for(int i=0; i<4; i++) {
			System.out.println(name+" contador "+i);
			try {
				Thread.sleep(time);
			}
		catch(InterruptedException e){
			e.printStackTrace();
}}		System.out.println(name +" terminou a execução");}}