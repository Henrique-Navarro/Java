package Ex08;

class A{
	private int j;
	private float g;
	private B b;
	
	public void f2() {
		try {
			try {
				b.f1();
				->
				if() {
					throw j;
				}
				if() {
					throw g;
				}
			}catch(int) {
				
			}
		}catch(float) {
			
		}
	}
}


class B{
	private int k;
	private float f;
	
	public void f1() {
		try {
			if() {
				throw k;
			}
			if() {
				throw f;
			}
		}catch(float) {
			
		}
	}
}


void main() {
	A a;
	a.f2();
}

/*
 * possibilidades:
 * caso não entre em nenhum if da classe B, não sera executado catch da classe B, e por consequencia o resultado se torna semelhante para a classe A
 * 
 * caso entre no primeiro if da classe B, vai lançar a Exception k, não será tratada. Na classe A, lançará uma Exception j, não entrará no segundo if
 * o primeiro catch já irá tratar a Exception j
 * 
 * caso entre no segundo if da classe B, vai lançar a Exception f, e já será tratada no catch. Na classe A, o segundo if será executado, lançando a 
 * Exception g, e o segundo catch ficará responsável por tratar esta Exception
 * 
 * caso entre em ambos os if da classe B, vai lançar Exception k e f, a f será tratada, porém a k não. Na classe A irá lançar 2 Exception g e j e tratará
 * ambas logo em seguida
 * */
 */