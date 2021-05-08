package tile;

import java.util.ArrayList;
import java.util.Scanner;

import application.InitialBoard;
import logic.Player;

public class DoublePriceTile extends SpacialTile {
	
	public DoublePriceTile(String name,int position) {
		super(name,position);
	}
	@Override
	public void interact(Player player,InitialBoard board) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<NormalLocationTile> ownList = player.getNormalLocationList();
		if (ownList.size() != 0) {
			System.out.println("Select your location to double fall price. ");
			for (NormalLocationTile e : ownList) {
				System.out.println(e.getname() + "(" + e.getPosition()+ ")");
			}
			int input = scanner.nextInt();
			board.doubleFallPrice(input);
			System.out.println("Your location fall price is now double!!!");
		}
		
		
		
		
	}
	
}
