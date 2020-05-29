package main;

import model.Cachorro;
import model.Cavalo;
import model.Preguica;
import model.Veterinario;

public class Principal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Veterinario veterinario = new Veterinario();
		
		cachorro.setNome("Nina");
		cachorro.setIdade(3);
		cachorro.emitirSom();
		cachorro.correr();
		System.out.println("\n------------------------\n");
		cavalo.setNome("Spirit");
		cavalo.setIdade(10);
		cavalo.emitirSom();
		cavalo.correr();
		System.out.println("\n------------------------\n");
		preguica.setNome("Ligeiro");
		preguica.setIdade(7);
		preguica.emitirSom();
		preguica.subirArvore();
		System.out.println("\n------------------------");
		veterinario.examinar(cachorro);
		System.out.println("------------------------");
		veterinario.examinar(cavalo);
		System.out.println("------------------------");
		veterinario.examinar(preguica);

	}

}
