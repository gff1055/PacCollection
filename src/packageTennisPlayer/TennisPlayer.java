package packageTennisPlayer;

import java.util.Scanner;

public class TennisPlayer {
	
	//nome do jogador
	private String nameTennisPlayer;
	
	//numero de tirulos do jogador
	private int titleTennisPlayer;
	
	//nacionalidade do jogador
	private String nacionalityTennisPlayer;
	
	//Caracteres para entrada
	private Scanner scanDataInteger = new Scanner(System.in);
	private Scanner scanDataString = new Scanner(System.in);
	
	//flag para terminar o programa
	private String endProgram;
	
	//construtor da classe
	public TennisPlayer(){
		endProgram = "n";
	}
	
	//Cadastro do jogador
	public void fillDataTennisPlayer(){
		
		//iniciando processo de cadastro
		System.out.println("DESEJA CADASTRAR JOGADOR AGORA?");
		endProgram = scanDataInteger.next();
		
		//Cadastro das informacoes do jogador
		System.out.println("NOME: ");
		nameTennisPlayer = scanDataString.next();
		System.out.println("TITULOS: ");
		System.out.println("NACIONALIDADE: ");
	}
}
