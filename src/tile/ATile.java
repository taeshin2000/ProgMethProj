package tile;

import java.util.Scanner;

import application.GameController;
import application.InitialBoard;
import logic.Player;
import main.Main;

public class ATile extends SpacialTile {
	public ATile(String name,int position) {
		super(name,position);
	}

	@Override
	public void interact(Player player,InitialBoard board) {
		Main.aPane.setVisible(true);
		int money = GameController.turn.getCurrentPlayer().getMoney();
		(GameController.turn.getCurrentPlayer()).increaseMoney((int)(money*0.5));
		
	}



}
