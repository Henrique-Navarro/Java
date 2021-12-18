public class ContaBanco {
    // !atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // !metodos get-set
    // numConta
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    // tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    // dono
    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    // saldo
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    // status
    public boolean getStatus() {
        return status;
    }

    public boolean setStatus(boolean st) {
        this.status = st;
    }

    // !metodos
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            // saldo += 50;
            setSaldo(saldo + 50);
        } else if (tipo == "CP") {
            // saldo += 150;
            setSaldo(saldo + 150);
        }
    }

    public void fecharConta() {
        if ((getSaldo() == 0) && (getStatus() == true)) {
            setStatus(false);
        } else {
            System.out.println("Não foi possível fechar a conta");
        }
    }

    public void depositar(float v) {
        if (getStatus() == true) {
            // saldo += valorDeposito;
            setSaldo(getSaldo() + v);
        } else {
            System.out.println("Nao foi possivel depositar");
        }
    }

    public void sacar(float v) {
        if (getSaldo() > 0 && getStatus() == true) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Saldo insuficiente ou conta desativada");
        }
    }

    public void pagarMensal() {
        if (getStatus() == true) {
            if (getTipo() == "CC") {
                // saldo -= 12;
                if (getSaldo() > 12) {
                    setSaldo(getSaldo() - 12);
                }
            } else if (tipo == "CP") {
                // saldo -= 20;
                if (getSaldo() > 20) {
                    setSaldo(getSaldo() - 20);
                }
            }
        }
    }

    // !metodo construtor
    public ContaBanco() {
        status = false;
        saldo = 0;
    }
}
