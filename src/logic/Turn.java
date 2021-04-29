package logic;
import java.util.Random;

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
}
