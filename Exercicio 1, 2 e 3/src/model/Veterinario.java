package model;

public class Veterinario{
	
	public void examinar(Cachorro cachorro) {
		System.out.println("Veterin�rio examinou cachorro");
		cachorro.emitirSom();
	}
	public void examinar (Cavalo cavalo) {
		System.out.println("Veterin�rio examinou cavalo");
		cavalo.emitirSom();
	}
	public void examinar (Preguica preguica) {
		System.out.println("Veterin�rio examinou preguica");
		preguica.emitirSom();
	}
}
