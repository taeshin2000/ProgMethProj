package tile;

import application.InitialBoard;
import logic.Player;
import main.Main;

public class StartTile extends SpecialTile {
	
	public StartTile(String name,int position) {
		super(name,position);
		
	}
	@Override
	public void interact(Player player,InitialBoard board) {
		// TODO Auto-generated method stub
		Main.startPane.setVisible(true);
	}

}
