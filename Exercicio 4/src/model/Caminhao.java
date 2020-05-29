package model;
import java.util.*;

public class Caminhao extends Veiculo{
	private double xCargaMax;
	private int xAlturaMax;
	private int xComprimento;
	
	//Construtores
	public Caminhao() {
		xCargaMax = 0;
		xAlturaMax = 0;
		xComprimento = 0;
	}
	public Caminhao(double cargaMax, int alturaMax, int comprimento){
		xCargaMax = cargaMax;
		xAlturaMax = alturaMax;
		xComprimento = comprimento;
	}
	
	public void entrCam(){
		System.out.println("Informe a catga máxima em kg: ");
		this.xCargaMax = in.nextDouble();
		System.out.println("Informe a altura máxima em metros: ");
		this.xAlturaMax = in.nextInt();
		System.out.println("Informe o comprimento em metros: ");
		this.xComprimento = in.nextInt();
		this.entrVeic();
	}
	public void mostrCam() {
		System.out.printf("Carga máxima: %.2fkg", xCargaMax);
		System.out.println("\nAltura máxima: "+xAlturaMax+"m");
		System.out.print("Comprimento: "+xComprimento+"m\n");
		this.mostrVeic();
	}
}
