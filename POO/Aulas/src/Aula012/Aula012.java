package Aula012;

public class Aula012 {
	public static void main(String[] args) {
		//Animal a = new Animal();    ->    classe abstrata
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro ch = new Cachorro();
		Tartaruga t = new Tartaruga();
		
		m.alimentar();m.emitirSom();m.locomover();
		r.alimentar();r.emitirSom();r.locomover();
		p.alimentar();p.emitirSom();p.locomover();
		a.alimentar();a.emitirSom();a.locomover();
		c.alimentar();c.emitirSom();c.locomover();
		ch.alimentar();ch.emitirSom();ch.locomover();
		t.alimentar();t.emitirSom();t.locomover();
	}
}
