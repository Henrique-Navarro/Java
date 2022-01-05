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

    // TODOtipo void
    public void setStatus(boolean sta) {
        this.status = sta;
    }

    // !metodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            // saldo += 50;
            this.setSaldo(50);
        } else if (t == "CP") {
            // saldo += 150;
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if ((this.getSaldo() == 0) && (this.getStatus() == true)) {
            this.setStatus(false);
        } else {
            System.out.println("Não foi possível fechar a conta");
        }
    }

    public void depositar(float v) {
        if (this.getStatus() == true) {
            // saldo += valorDeposito;
            this.setSaldo(getSaldo() + v);
        } else {
            System.out.println("Nao foi possivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.getSaldo() > 0 && this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Saldo insuficiente ou conta desativada");
        }
    }

    public void pagarMensal() {
        if (this.getStatus() == true) {
            if (this.getTipo() == "CC") {
                // saldo -= 12;
                if (this.getSaldo() > 12) {
                    this.setSaldo(getSaldo() - 12);
                }
            } else if (tipo == "CP") {
                // saldo -= 20;
                if (this.getSaldo() > 20) {
                    this.setSaldo(getSaldo() - 20);
                }
            }
        }
    }

    // !metodo construtor
    public ContaBanco() {
        setStatus(false);
        setSaldo(0);
    }

    // !Estado atual
    public void estado() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
        System.out.println(" ");
    }
}
