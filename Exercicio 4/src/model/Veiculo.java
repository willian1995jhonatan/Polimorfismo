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
		System.out.println("Informe a velocidade m�xima em km/h: ");
		this.xVelMax = in.nextInt();
		System.out.println("Informe o pre�o em R$: ");
		this.xPreco = in.nextInt();
		
	}
	public void mostrVeic() {
		System.out.println("Peso: "+xPeso+"kg");
		System.out.printf("Velocidade m�xima: %.2f km/h", xVelMax);
		System.out.printf("\nPre�o: R$%.2f", xPreco);
	}
}
