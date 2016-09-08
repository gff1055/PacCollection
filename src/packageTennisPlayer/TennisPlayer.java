package packageTennisPlayer;

import java.util.Scanner;

public class TennisPlayer {
	
	//nome do jogador
	private String name;
	
	//numero de titulos do jogador
	private int numberTitle;
	
	//nacionalidade do jogador
	private String nacionality;
	
	//Variavel para entrada de dados inteiros
	private Scanner scanDataInteger = new Scanner(System.in);

	//Variavel para entrada de dados String
	private Scanner scanDataString = new Scanner(System.in);
	
	//Cadastro do jogador
	public void fillData(){
		
		//Cadastro das informacoes do jogador
		System.out.println("NOME: ");
		name = scanDataString.next();
		System.out.println("TITULOS: ");
		numberTitle = scanDataInteger.nextInt();
		System.out.println("NACIONALIDADE: ");
		nacionality = scanDataString.next();
	}
	
	//Metodo para exibir infoemacoes do jogador
	public void showInformation(){
		System.out.println("NOME: " + this.name + " TITULOS: " + this.numberTitle + " NACIONALIDADE: " + this.nacionality);
	}
}
