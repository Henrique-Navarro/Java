package aula03;
public class MinhaThreadRunnable implements Runnable{
	//atributes
	private String name;
	private int time;

	//constructor
	public MinhaThreadRunnable(String name, int time) {
		//ATRIBUTOS
		this.name=name;
		this.time=time;
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<4; i++) {
				System.out.println(name+" contador "+i);

				Thread.sleep(time);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("\nThread Finalizou sua Execução");
	}	
}