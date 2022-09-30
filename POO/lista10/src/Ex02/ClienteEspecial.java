package Ex02;

public class ClienteEspecial extends ContaCorrente{

	public ClienteEspecial(double saldo) {
		super(saldo);
		this.taxa=0.1;
	}

}
