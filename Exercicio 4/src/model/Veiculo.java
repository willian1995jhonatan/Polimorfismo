package model;
import java.util.*;

public abstract class Veiculo {
	private int xPeso;
	private double xVelMax;
	private double xPreco;
	Scanner in = new Scanner(System.in);
	
	//Construtores
	protected Veiculo() {
		xPeso = 0;
		xVelMax = 0;
		xPreco = 0;
	}
	protected Veiculo(int peso, double velMax, double preco){
		xPeso = peso;
		xVelMax = velMax;
		xPreco = preco;
	}
	
	public void entrVeic() {
		System.out.println("Informe o peso em kg: ");
		this.xPeso = in.nextInt();
		System.out.println("Informe a velocidade máxima em km/h: ");
		this.xVelMax = in.nextInt();
		System.out.println("Informe o preço em R$: ");
		this.xPreco = in.nextInt();
		
	}
	public void mostrVeic() {
		System.out.println("Peso: "+xPeso+"kg");
		System.out.printf("Velocidade máxima: %.2f km/h", xVelMax);
		System.out.printf("\nPreço: R$%.2f", xPreco);
	}
}
