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
 * caso n�o entre em nenhum if da classe B, n�o sera executado catch da classe B, e por consequencia o resultado se torna semelhante para a classe A
 * 
 * caso entre no primeiro if da classe B, vai lan�ar a Exception k, n�o ser� tratada. Na classe A, lan�ar� uma Exception j, n�o entrar� no segundo if
 * o primeiro catch j� ir� tratar a Exception j
 * 
 * caso entre no segundo if da classe B, vai lan�ar a Exception f, e j� ser� tratada no catch. Na classe A, o segundo if ser� executado, lan�ando a 
 * Exception g, e o segundo catch ficar� respons�vel por tratar esta Exception
 * 
 * caso entre em ambos os if da classe B, vai lan�ar Exception k e f, a f ser� tratada, por�m a k n�o. Na classe A ir� lan�ar 2 Exception g e j e tratar�
 * ambas logo em seguida
 * */
 */