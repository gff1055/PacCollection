import java.util.ArrayList;
import java.util.Scanner;

import exceptions.TypeException;
import packageRanking.Ranking;
import packageRanking.SetRanking;
import packageTennisPlayer.TennisPlayer;

public class MainClass {
	public static void main(String[] args){
		
		

		//Variavel que indica se programa terminou
		Scanner scaEndProgram = new Scanner(System.in);
		String strEndProgram = "n";
		
		//armazena dados do ranking
		Ranking listRanking = new Ranking();
		
		SetRanking listSetRanking = new SetRanking();
		
		System.out.println("DESEJA INSERIR DADOS DO JOGADOR (s/n)?");
		strEndProgram = scaEndProgram.next();
		
		while(!strEndProgram.equals("n")){
			if(strEndProgram.equals("s")){
				
				//armazena dados do jogador
				TennisPlayer objTennisPlayer = new TennisPlayer();
				
				//preenche dados
				objTennisPlayer.fillData();
				
			
				//adiciona o jogador na lista
				if(listRanking.registerTennisPlayer(objTennisPlayer) &&
						listSetRanking.registerTennisPlayer(objTennisPlayer))
					System.out.println("JOGADOR CADASTRADO");
				
				else
					System.out.println("JOGADOR NAO FOI CADASTRADO");
				
			}
			
			else System.out.println("OPCAO ERRADA!");
			
			System.out.println("DESEJA INSERIR DADOS DO JOGADOR (s/n)?");
			strEndProgram = scaEndProgram.next();
		}
		
		//mostra os dados do ranking
		System.out.println("DADOS SOBRE O RANKING");
		listRanking.showAllTennisPlayer();
		listSetRanking.showAllTennisPlayer();
		
		listRanking.orderTennisPlayer();

		listRanking.maxNumberTitle();
		
		listRanking.minNumberTitle();
		
		
	}
}
