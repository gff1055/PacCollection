import java.util.ArrayList;

import packageRanking.Ranking;
import packageTennisPlayer.TennisPlayer;

public class MainClass {
	public static void main(String[] args){
		
		//armazena dados do jogador
		TennisPlayer objTennisPlayer = new TennisPlayer();

		//armazena dados do ranking
		Ranking listRanking = new Ranking();
		
		//preenche dados
		objTennisPlayer.fillData();
		
		//adiciona o jogador na lista
		listRanking.registerTennisPlayer(objTennisPlayer);
		
		//mostra os dados do ranking
		listRanking.showAllTennisPlayer();
	}
}
