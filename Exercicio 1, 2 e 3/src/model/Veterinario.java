package model;

public class Veterinario{
	
	public void examinar(Cachorro cachorro) {
		System.out.println("Veterinário examinou cachorro");
		cachorro.emitirSom();
	}
	public void examinar (Cavalo cavalo) {
		System.out.println("Veterinário examinou cavalo");
		cavalo.emitirSom();
	}
	public void examinar (Preguica preguica) {
		System.out.println("Veterinário examinou preguica");
		preguica.emitirSom();
	}
}
