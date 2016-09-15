package packageRanking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import packageTennisPlayer.TennisPlayer;

public class Ranking {
	private List<TennisPlayer> listPlayers = new ArrayList<>();
	
	//metodo para cadastrar jogadores
	public boolean registerTennisPlayer(TennisPlayer paramTennisPlayer){
		return listPlayers.add(paramTennisPlayer);
		
	}
	
	//metodo para mostrar todos os jogadores
	public void showAllTennisPlayer(){
		
		for(int i=0; i<listPlayers.size(); i++){
			System.out.println("Jogador "+i);
			listPlayers.get(i).showInformation();
		}
	}
	
	public void orderTennisPlayer(){
		System.out.println("RANKING EM ORDEM DE TITULOS");
		Collections.sort(listPlayers);
		this.showAllTennisPlayer();
	}
	
	public void maxNumberTitle(){
		System.out.println("MAIOR NUMERO DE TITULOS");
		Collections.max(listPlayers).showInformation();;
	}
	
	public void minNumberTitle(){
		System.out.println("MENOR NUMERO DE TITULOS");
		Collections.min(listPlayers).showInformation();;
	}
	
	

	
}
