public class ControleRemoto implements Controlador {
    // !atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // !metodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return this.volume;
    }
    private void setVolume(int v) { 
        this.volume = v;
    }

    private boolean getLigado() {
        return this.ligado;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return this.tocando;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }

    // !metodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Qual volume? " + this.getVolume());

        for (int i = 0; i <= getVolume(); i += 10) {
            System.out.print("| ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu.....");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getVolume() > 0 && this.getLigado() == true) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && this.getTocando() == false) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
        }
    }
}