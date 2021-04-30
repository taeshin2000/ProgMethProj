package logic;
import java.util.Random;
import java.util.Scanner;

import application.InitialBoard;
import tile.NormalLocationTile;
import tile.SpacialLocationTile;

public class Turn {
	private Player currentPlayer;
	private Random ran = new Random();
	private int maxDice = 6;
	
	public Turn(Player player) {
		this.currentPlayer = player;
	}
	
	public int rollDice() {
		return ran.nextInt(maxDice) + 1;
	}
	
	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	public void changeCurrentPlayer(Player player1,Player player2) {
		if (currentPlayer.getPlayerNumber() == 1) {
			currentPlayer = player2; 
		}
		else {
			currentPlayer = player1;
		}
		
	}

	public void action(InitialBoard board) {
		Scanner scanner = new Scanner(System.in);
		if(board.getTile(currentPlayer.getPosition()) instanceof NormalLocationTile) {
			if(((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == 0) {
				System.out.println("Do you want to buy this location? (y/n)");
				String buyInput = scanner.nextLine();
				if(buyInput.equals("y")) {
					if (currentPlayer.buyLocation(((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))))) {
						System.out.println("Player" + currentPlayer.getPlayerNumber() + " now own " + board.getLocationName(currentPlayer.getPosition()));
						System.out.println("Current money is : " + currentPlayer.getMoney());
						board.setLocationTileOwner(currentPlayer.getPosition(), currentPlayer.getPlayerNumber());
					}
				}	
			}
			
		}
		
		if (board.getTile(currentPlayer.getPosition()) instanceof SpacialLocationTile) {
			if(((SpacialLocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == 0) {
				System.out.println("Do you want to buy this location? (y/n)");
				String buyInput = scanner.nextLine();
				if(buyInput.equals("y")) {
					if (currentPlayer.buyLocation(((SpacialLocationTile) (board.getTile(currentPlayer.getPosition()))))) {
						System.out.println("Player" + currentPlayer.getPlayerNumber() + " now own " + board.getLocationName(currentPlayer.getPosition()));
						System.out.println("Current money is : " + currentPlayer.getMoney());
						board.setLocationTileOwner(currentPlayer.getPosition(), currentPlayer.getPlayerNumber());
					}
				}
	
			}
		}
		
	}
}
