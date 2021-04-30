package logic;

import java.util.Random;
import java.util.Scanner;

import application.InitialBoard;
import tile.LocationTile;
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

	public void changeCurrentPlayer(Player player1, Player player2) {
		if (currentPlayer.getPlayerNumber() == 1) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}

	}

	public void action(InitialBoard board) {
		Scanner scanner = new Scanner(System.in);
		if (board.getTile(currentPlayer.getPosition()) instanceof LocationTile) {
			if(((LocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == 0) {
				System.out.println("Do you want to buy this location? (y/n)");
				String buyInput = scanner.nextLine();
				if(buyInput.equals("y")) {
					if (currentPlayer.buyLocation(((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))))) {
						System.out.println("Player" + currentPlayer.getPlayerNumber() + " now own " + board.getLocationName(currentPlayer.getPosition()));
						System.out.println("Current money is : " + currentPlayer.getMoney());
						board.setLocationTileOwner(currentPlayer.getPosition(), currentPlayer.getPlayerNumber());
					}
				}	
			}else {
				if(board.getTile(currentPlayer.getPosition()) instanceof NormalLocationTile) {
					if(((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == currentPlayer.getPlayerNumber() && ((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))).upgradeable() ) {
						System.out.println("Do you want to upgrade this location? (y/n)");
						String upgradeInput = scanner.nextLine();
						if(upgradeInput.equals("y")) {
						
							if (currentPlayer.upgradeLocation(((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))))){
								System.out.println(board.getLocationName(currentPlayer.getPosition()) + "upgraded");
								System.out.println("Current money is : " + currentPlayer.getMoney());
								board.increaseLocationPrice(currentPlayer.getPosition());
							
							}

						}
					}
				}
			}
		}
	}
		
		
		
		
	
}
