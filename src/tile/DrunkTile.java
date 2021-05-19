package tile;

import java.util.ArrayList;
import java.util.Scanner;

import application.GameController;
import application.InitialBoard;
import logic.Player;
import main.Main;

public class DrunkTile extends SpacialTile {
	
	public DrunkTile(String name,int position) {
		super(name,position);
	}
	@Override
	public void interact(Player player,InitialBoard board) {
		Main.drunkPane.setVisible(true);
		int money = GameController.turn.getCurrentPlayer().getMoney();
		(GameController.turn.getCurrentPlayer()).decreaseMoney((int)(0.5*money));
		
		
		
		
	}
	
}
