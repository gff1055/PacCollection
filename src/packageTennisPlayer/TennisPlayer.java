package packageTennisPlayer;

import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.TypeException;

public class TennisPlayer implements Comparable<TennisPlayer> {
	
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
	
	
	private String getName(){
		return this.name;
	}
	
	private int getNumberTitle(){
		return this.numberTitle;
	}
	
	private String getNacionality(){
		return this.nacionality;
	}
	
	private void setName(String paramString){
		this.name = paramString;
	}
	
	private void setNumberTitle(int paramInt){
		this.numberTitle = paramInt;
	}
	
	private void setNacionality(String paramString){
		this.nacionality = paramString;
	}
	
	//Cadastro do jogador
	public void fillData(){
		InputMismatchException isDontNumber = null;
		
		//Cadastro das informacoes do jogador
		System.out.println("NOME: ");
		name = scanDataString.next();
		System.out.println("TITULOS: ");
		
		try{
		numberTitle = scanDataInteger.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Voce tem que digiter um numero: ");
		}
		
		System.out.println("NACIONALIDADE: ");
		nacionality = scanDataString.next();
	}
	
	//Metodo para exibir infoemacoes do jogador
	public void showInformation(){
		System.out.println("NOME: " + this.name + " TITULOS: " + this.numberTitle + " NACIONALIDADE: " + this.nacionality);
	}
	
	//Metodo para comparar
	public int compareTo(TennisPlayer paramTennisPlayer){
		
		if(this.numberTitle<paramTennisPlayer.numberTitle){
			return -1;
		}
		
		if(this.numberTitle>paramTennisPlayer.numberTitle){
			return 1;
		}
		
		return 0;
	}
}
