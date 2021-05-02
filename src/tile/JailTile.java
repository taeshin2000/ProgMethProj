package tile;

import logic.Player;

public class JailTile extends Tile implements Interactable {

	public JailTile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact(Player player) {
		System.out.println("You are in jail.Can't move for 1 turn.");	
	}

}
