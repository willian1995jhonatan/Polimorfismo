package model;

public class Cavalo extends Animal{
	
	public void emitirSom() {
		System.out.println("O cavalo "+getNome()+" relinchou!");
	}
	public void correr() {
		System.out.println("O cavalo "+getNome()+" correu!");
	}
}
