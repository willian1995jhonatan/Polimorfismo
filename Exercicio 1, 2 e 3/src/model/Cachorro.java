package model;

public class Cachorro extends Animal{
	
	public void emitirSom() {
		System.out.println("O cachorro "+getNome()+" latiu!");
	}
	public void correr() {
		System.out.println("O cachorro "+getNome()+" correu!");
	}
	
}
