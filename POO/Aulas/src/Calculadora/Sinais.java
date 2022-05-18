package Calculadora;

public enum Sinais {
	//SOMAR("+"), SUBTRAIR("-"), MULTIPLICAR("*"), DIVIDIR("+");

	//definir cada constante, o sinal que ela representa, e a função que ela faz (@Override)-> polimorfismo
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x+y;
		}
	}, 
	SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
		}
	}, 
	MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x*y;
		}
	}, 
	DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x/y;
		}
	},
	POTENCIALIZAR("^"){
		@Override
		public double executarOperacao(double x, double y) {
			double res=1;
			if(x==1 || y==0) {return 1;}
			if(y==1) {return x;}
			
			for(int n=0; n<y; n++) {
				 res= x*res;
			}
			return res;
		}
	};

	//define o método abstrato
	public abstract double executarOperacao(double x, double y);

	//atributes
	private String sinal;

	//constructor
	Sinais(String sinal){
		this.sinal=sinal;
	}

	//getter
	public String getSinal() {
		return sinal;
	}
}
