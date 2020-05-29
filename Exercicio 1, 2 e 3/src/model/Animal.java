package model;

public abstract class Animal {
	private String xNome;
	private int xIdade;
	
	//Construtores
	protected Animal() {
		xNome = "sem nome";
		xIdade = 0;
	}
	protected Animal(String nome, int idade){
		xNome = nome;
		xIdade = idade;
	}
	
	// Métodos abstratos para uso em polimorfismo
	public String getNome() {
		return xNome;
	}
	
	public void setNome(String nome) {
		this.xNome = nome;
	}
	
	public int getIdade() {
		return xIdade;
	}
	
	public void setIdade(int idade) {
		this.xIdade = idade;
	}
	
	abstract public void emitirSom();
}
