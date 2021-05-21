package logic;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import application.InitialBoard;
import gui.twobuttonpane.BuyBtn;
import main.Main;
import application.GameController;
import tile.JailTile;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.SpacialTile;
import tile.DrunkTile;
import tile.GetItemTile;
import tile.IslandLocationTile;
import tile.ATile;

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
		if (board.getTile(currentPlayer.getPosition()) instanceof LocationTile) {
			if (((LocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == 0) {
				buyLocation(board);
			} else {
				if (board.getTile(currentPlayer.getPosition()) instanceof NormalLocationTile) {
					if (((NormalLocationTile) (board.getTile(currentPlayer.getPosition()))).getOwner() == currentPlayer
							.getPlayerNumber()) {
						upgradeLocation(board);
					} else {
						if (((NormalLocationTile) (board.getTile(currentPlayer.getPosition())))
								.getOwner() != currentPlayer.getPlayerNumber()) {
							if (currentPlayer.fallOnOtherPlayer(
									(NormalLocationTile) (board.getTile(currentPlayer.getPosition())))) {
								fallOnLocation(board, player1, player2);
								transferLocation(board, player1, player2);
							} else {
								if (currentPlayer.getHaveProtectionCard()) {
									currentPlayer.setProtectionCard(false);
									Main.player1Pane.updatePlayerPane(1);
									Main.player2Pane.updatePlayerPane(2);
									GameController.increaseTurnCount();
									Main.dicePane.updateDicePaneScreen();
									if (!Main.skipTurn) {
										GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
										Main.player1Pane.updatePlayerPaneScreen();
										Main.player2Pane.updatePlayerPaneScreen();
										
									}else {
										Main.skipTurn = false;
									}
									Main.dicePane.getRollButton().setDisable(false);
									

								}else {
									GameController.setGameOver(true);
									if (currentPlayer.getPlayerNumber() == 1) {
										GameController.setWinner(2); 
									} else {
										GameController.setWinner(1);
									}
									
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
							if (currentPlayer.getHaveProtectionCard()) {
								currentPlayer.setProtectionCard(false);
								Main.player1Pane.updatePlayerPane(1);
								Main.player2Pane.updatePlayerPane(2);
								GameController.increaseTurnCount();
								Main.dicePane.updateDicePaneScreen();
								if (!Main.skipTurn) {
									GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
									Main.player1Pane.updatePlayerPaneScreen();
									Main.player2Pane.updatePlayerPaneScreen();
									
								}else {
									Main.skipTurn = false;
								}
								Main.dicePane.getRollButton().setDisable(false);
								
							}else {
								GameController.setGameOver(true);
								if (currentPlayer.getPlayerNumber() == 1) {
									GameController.setWinner(2); 
								} else {
									GameController.setWinner(1);
								}
								
							}

						}
					}
					else {
						GameController.increaseTurnCount();
						Main.dicePane.updateDicePaneScreen();
						if (!Main.skipTurn) {
							GameController.turn.changeCurrentPlayer(GameController.player1, GameController.player2);
							Main.player1Pane.updatePlayerPaneScreen();
							Main.player2Pane.updatePlayerPaneScreen();
							
						}else {
							Main.skipTurn = false;
						}
						Main.dicePane.getRollButton().setDisable(false);
					}
				}
			}
		}
		else {
			((SpacialTile) board.getTile(currentPlayer.getPosition())).interact(currentPlayer,board);
		}
	}

	public void buyLocation(InitialBoard board) {
		Main.buyButton.updateBuyButtonScreen();
		Main.buyButton.setVisible(true);
		
			
		
	}

	public void upgradeLocation(InitialBoard board) {
		Main.upgradeButton.updateUpgradeButtonScreen();
		Main.upgradeButton.setVisible(true);
		
	}

	public void fallOnLocation(InitialBoard board, Player player1, Player player2) {
		Main.loseMoneyButton.updateLoseMoneyBtnScreen();
		Main.loseMoneyButton.setVisible(true);
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
		Main.transferButton.updateTransferBtnScreen();
		Main.transferButton.setVisible(true);
	
	}
		
		

	public boolean skipNextTurn(Player player) {
		if ( player.getPosition() == 6) {
			return true;
		}
		return false;
	}

}
