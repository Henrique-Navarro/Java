package aula01;

public class MinhaThread extends Thread{
	//atributes
	private String name;
	private int time;
	
	//constructor
	public MinhaThread(String name, int time) {
		this.name=name;
		this.time=time;
		start();
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<3; i++) {
				System.out.println(name + " contador "+i);
				Thread.sleep(time);
			} 
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
