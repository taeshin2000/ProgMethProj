package logic;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import application.InitialBoard;
import application.Main;
import tile.JailTile;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.SpacialTile;
import tile.DoublePriceTile;
import tile.GetItemTile;
import tile.IslandLocationTile;
import tile.WarpTile;

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

	public void action(InitialBoard board, Player player1, Player player2, boolean gameOver, int winner) {
		Scanner scanner = new Scanner(System.in);
		if (board.getTile(currentPlayer.getPosition()) instanceof LocationTile) {
			if (((LocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == 0) {
				buyLocation(board);
			} else {
				if (board.getTile(currentPlayer.getPosition()) instanceof NormalLocationTile) {
					if (((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == currentPlayer
							.getPlayerNumber()
							&& ((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))).upgradeable()) {
						upgradeLocation(board);
					} else {
						if (((NormalLocationTile) (board.getTile(currentPlayer.getPosition())))
								.getOwner() != currentPlayer.getPlayerNumber()) {
							if (currentPlayer.fallOnOtherPlayer(
									(NormalLocationTile) (board.getTile(currentPlayer.getPosition())))) {
								fallOnLocation(board, player1, player2);
								transferLocation(board, player1, player2);
							} else {
								Main.setGameOver(true);
								if (currentPlayer.getPlayerNumber() == 1) {
									Main.setWinner(2); 
								} else {
									Main.setWinner(1);
								}

							}
						}
					}
				} else {
					if (((IslandLocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() != currentPlayer
							.getPlayerNumber()) {
						if (currentPlayer
								.fallOnOtherPlayer((IslandLocationTile) (board.getTile(currentPlayer.getPosition())))) {
							fallOnLocation(board, player1, player2);
						} else {
							Main.setGameOver(true);
							if (currentPlayer.getPlayerNumber() == 1) {
								Main.setWinner(2); 
							} else {
								Main.setWinner(1);
							}

						}
					}
				}
			}
		}
		else {
			((SpacialTile) board.getTile(currentPlayer.getPosition())).interact(currentPlayer,board);
		}
	}

	public void buyLocation(InitialBoard board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to buy this location? (y/n)");
		String buyInput = scanner.nextLine();
		if (buyInput.equals("y")) {
			if (currentPlayer.buyLocation(((LocationTile) (board.getTile(currentPlayer.getPosition()))))) {
				System.out.println("Player" + currentPlayer.getPlayerNumber() + " now own "
						+ board.getLocationName(currentPlayer.getPosition()));
				System.out.println("Current money is : " + currentPlayer.getMoney());
				board.setLocationTileOwner(currentPlayer.getPosition(), currentPlayer.getPlayerNumber());
			} else {

				System.out.println("You don't have enough money!!!");
			}
		}
	}

	public void upgradeLocation(InitialBoard board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to upgrade this location? (y/n)");
		String upgradeInput = scanner.nextLine();
		if (upgradeInput.equals("y")) {

			if (currentPlayer.upgradeLocation(((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))))) {
				System.out.println(board.getLocationName(currentPlayer.getPosition()) + "upgraded");
				System.out.println("Current money is : " + currentPlayer.getMoney());
				board.increaseLocationPrice(currentPlayer.getPosition());

			} else {
				System.out.println("You don't have enough money!!!");
			}

		}
	}

	public void fallOnLocation(InitialBoard board, Player player1, Player player2) {
		System.out.println("You fall on another player location and lose "
				+ ((LocationTile) (board.getTile(currentPlayer.getPosition()))).getFallPrice());
		increaseOtherPlayerMoney(((LocationTile) (board.getTile(currentPlayer.getPosition()))).getFallPrice(), player1,
				player2);
	}

	public void increaseOtherPlayerMoney(int amount, Player player1, Player player2) {
		if (currentPlayer.getPlayerNumber() == 1) {
			player2.increaseMoney(amount);
		} else {
			player1.increaseMoney(amount);

		}
	}

	public void transferLocation(InitialBoard board, Player player1, Player player2) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to transfer this loaction to you? (y/n)");
		String transferInput = scanner.nextLine();
		if (transferInput.equals("y")) {
			if (currentPlayer.transferLocation(((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))))) {
				if (currentPlayer.getPlayerNumber() == 1) {
					player2.removeLocation((NormalLocationTile) (board.getTile(currentPlayer.getPosition())));
				}else {
					player1.removeLocation((NormalLocationTile) (board.getTile(currentPlayer.getPosition())));
				}
				increaseOtherPlayerMoney(
						((LocationTile) (board.getTile(currentPlayer.getPosition()))).getTransferPrice(), player1,
						player2);
				System.out.println("Player" + currentPlayer.getPlayerNumber() + " now own "
						+ board.getLocationName(currentPlayer.getPosition()));
				System.out.println("Current money is : " + currentPlayer.getMoney());
				board.setLocationTileOwner(currentPlayer.getPosition(), currentPlayer.getPlayerNumber());
			} else {
				System.out.println("You don't have enough money!!!");
			}
		}
	}

	public void checkSpacialWin(InitialBoard board, Player player1, Player player2, boolean gameOver, int winner) {
		if ((currentPlayer.getSpacialLocationList()).size() == 3) {
			Main.setGameOver(true);
			if (currentPlayer.getPlayerNumber() == 1) {
				Main.setWinner(1);
			}else {
				Main.setWinner(2);
			}
		}
		
		
		
	}

	public boolean skipNextTurn(Player player) {
		if ( player.getPosition() == 6) {
			return true;
		}
		return false;
	}

}
