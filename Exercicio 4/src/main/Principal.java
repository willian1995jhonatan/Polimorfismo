package main;

import java.util.Scanner;

import model.Caminhao;
import model.CarroPasseio;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CarroPasseio carro = new CarroPasseio();
		Caminhao caminhao = new Caminhao();
		
		carro.entrPass();
		System.out.println();
		carro.mostrPass();
		System.out.println("\n---------------------\n");
		caminhao.entrCam();
		System.out.println();
		caminhao.mostrCam();

	}

}
