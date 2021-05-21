package application;

import logic.Player;
import logic.Turn;


public class GameController {
	public static Player player1 = new Player(1,"name");
	public static Player player2= new Player(2, "name");
	public static Turn turn;
	public static int turnCount = 1;
	public static InitialBoard board = new InitialBoard();
	public static boolean gameOver = false;
	public static int winner = 0;
	
	private static int maxGameTurn = 30;
	
	public static int getMaxGameTurn() {
		return maxGameTurn;
	}

	public static void setMaxGameTurn(int maxGameTurn) {
		GameController.maxGameTurn = maxGameTurn;
	}

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
