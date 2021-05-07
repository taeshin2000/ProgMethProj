package tile;

import application.InitialBoard;
import logic.Player;

public class JailTile extends Tile implements Interactable {

	public JailTile(String name,int position) {
		super(name,position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact(Player player,InitialBoard board) {
		System.out.println("You are in jail.Can't move for 1 turn.");	
	}

}
