package packageRanking;

import java.util.ArrayList;
import java.util.List;

import packageTennisPlayer.TennisPlayer;

public class Ranking {
	private List<TennisPlayer> listPlayers = new ArrayList<>();
	
	//metodo para cadastrar jogadores
	public void registerTennisPlayer(TennisPlayer paramTennisPlayer){
		listPlayers.add(paramTennisPlayer);
	}
	
	//metodo para mostrar todos os jogadores
	public void showAllTennisPlayer(){
		System.out.println("DADOS SOBRE O RANKING");
		for(int i=0; i<listPlayers.size(); i++){
			listPlayers.get(i).showInformation();
		}
	}
	
	

	
}
