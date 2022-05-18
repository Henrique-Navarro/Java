package aula06;

public class ThreadTiqueTaque implements Runnable{
	TiqueTaque tt;
	Thread t;
	
	public ThreadTiqueTaque(String nome,TiqueTaque tt) {
		this.tt=tt;
		t= new Thread(this, nome);
		t.start();
	}
	
	@Override
	public void run() {
		if(t.getName().equalsIgnoreCase("Tique")) {
			for(int i=0; i<5; i++) {
				tt.tique(true);
			}
			tt.tique(false);
		}
		else {
			for(int i=0; i<5; i++) {
				tt.taque(true);
			}
			tt.taque(false);
		}
	}
}
