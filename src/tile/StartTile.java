package tile;

import application.InitialBoard;
import logic.Player;

public class StartTile extends Tile implements Interactable {
	final int MONEYGAIN = 500;
	//��������仡�͹
	
	public StartTile(String name,int position) {
		super(name,position);
		
	}
	@Override
	public void interact(Player player,InitialBoard board) {
		// TODO Auto-generated method stub
		
	}

}
