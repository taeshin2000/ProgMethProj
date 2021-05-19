package application;

import java.util.Currency;
import java.util.Scanner;


import logic.Player;
import logic.Turn;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.IslandLocationTile;

public class GameController {
	public static Player player1 = new Player(1,"name");
	public static Player player2= new Player(2, "name");
	public static Turn turn;
	public static int turnCount = 1;
	public static InitialBoard board = new InitialBoard();
	public static boolean gameOver = false;
	public static int winner = 0;
	

//	public static void main(String[] args) {
//		boolean skipTurn = false;
//		while (turnCount < 30) {
//			System.out.println("Current turn is Player" + turn.getCurrentPlayer().getPlayerNumber() + " turn.(Turn "
//					+ (turnCount + 1) + ")");
//			System.out.println(turn.getCurrentPlayer().getHaveDiceControllCard());
//			
//				System.out.println("Type roll to roll the dice.");
//				String input = scanner.nextLine();
//				if (input.equals("roll")) {
//					step = turn.rollDice();
//				}
//			if ((turn.getCurrentPlayer().getPosition() + step) % 24 < turn.getCurrentPlayer().getPosition()) {
//				turn.getCurrentPlayer().increaseMoney(10000);
//				System.out.println("Player " + turn.getCurrentPlayer().getPlayerNumber()
//						+ " has passed the START tile and gain 10000.");
//			}
//			(turn.getCurrentPlayer()).move(step);
//			System.out.println("Player" + turn.getCurrentPlayer().getPlayerNumber() + " move " + step + " step(s).");
//			System.out.println("Player" + turn.getCurrentPlayer().getPlayerNumber() + " current position is "
//					+ turn.getCurrentPlayer().getPosition());
//			System.out.println("Player" + turn.getCurrentPlayer().getPlayerNumber() + " current location is "
//					+ board.getLocationName(turn.getCurrentPlayer().getPosition()));
//			turn.action(board, player1, player2, gameOver, winner);
//			turn.checkSpacialWin(board, player1, player2, gameOver, winner);
//			if (gameOver && winner != 0) {
//				System.out.println("Player" + winner + " win!!!!");
//				break;
//			}
//			Player player = turn.getCurrentPlayer();
//			if (!skipTurn) {
//
//				turn.changeCurrentPlayer(player1, player2);
//
//			} else {
//				skipTurn = false;
//			}
//			if (turn.skipNextTurn(player)) {
//				skipTurn = true;
//			}
//			turnCount += 1;
//
//		}
//		if (turnCount == 29) {
//			if (player1.totalAsset() == player2.totalAsset()) {
//				System.out.println("Spacial ending Tieeee lucky!!!!!");
//			} else {
//				if (player1.totalAsset() > player2.totalAsset()) {
//					System.out.println("Player1 win!!!!");
//				} else {
//					System.out.println("Player2 win!!!!");
//				}
//				
//			}
//			
//		}
//
//	}

	public static void setGameOver(boolean status) {
		gameOver = status;
	}

	public static void setWinner(int player) {
		winner = player;
	}

	public static void initilizeGame() {
		// TODO Auto-generated method stub
		turn = new Turn(player1);
		
		
		
	}

	public static void increaseTurnCount() {
		// TODO Auto-generated method stub
		turnCount += 1;
		
	}
}
