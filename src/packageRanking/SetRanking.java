package packageRanking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import packageTennisPlayer.TennisPlayer;

public class SetRanking {
private Set<TennisPlayer> listPlayers = new HashSet<>();
	
	//metodo para cadastrar jogadores
	public boolean registerTennisPlayer(TennisPlayer paramTennisPlayer){
		return listPlayers.add(paramTennisPlayer);
		
	}
	
	//metodo para mostrar todos os jogadores
	public void showAllTennisPlayer(){
		for(TennisPlayer ind: listPlayers){
			ind.showInformation();
		}
	}
}
