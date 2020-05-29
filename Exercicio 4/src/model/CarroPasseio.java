package model;
import java.util.*;

public class CarroPasseio extends Veiculo{
	private String xCor;
	private String xModelo;
	
	//Construtores
	public CarroPasseio() {
		xCor = "sem cor";
		xModelo = "nenhum modelo";
	}
	public CarroPasseio(String cor, String modelo){
		xCor = cor;
		xModelo = modelo;
	}
	
	public void entrPass() {
		System.out.println("Informe a cor: ");
		this.xCor = in.nextLine();
		System.out.println("Informe o modelo: ");
		this.xModelo = in.nextLine();
		this.entrVeic();
	}
	public void mostrPass() {
		System.out.println("Cor: "+xCor);
		System.out.println("Modelo: "+xModelo);
		this.mostrVeic();
	}
}
