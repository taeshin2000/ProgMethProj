package application;

import java.util.Currency;
import java.util.Scanner;

import itemcard.DiceControllCard;
import logic.Player;
import logic.Turn;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.IslandLocationTile;

public class Main {
	private static Player player1;
	private static Player player2;
	private static Turn turn;
	private static int turnCount = 0;
	private static InitialBoard board = new InitialBoard();
	private static boolean gameOver = false;
	private static int winner = 0;
	private static int step;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please insert Player one name.");
		String player1name = scanner.nextLine();
		player1 = new Player(1, player1name);
		System.out.println("Please insert Player two name.");
		String player2name = scanner.nextLine();
		player2 = new Player(2, player2name);
		turn = new Turn(player1);
		boolean skipTurn = false;
		while (turnCount < 30) {
			System.out.println("Current turn is Player" + turn.getCurrentPlayer().getPlayerNumber() + " turn.(Turn "
					+ (turnCount + 1) + ")");
			if (turn.getCurrentPlayer().getItemCard() instanceof DiceControllCard) {
				System.out.println("Do you want to roll the dice or use your item card? (roll/use)");
				String input2 = scanner.nextLine();
				if (input2.equals("use")) {
					step = scanner.nextInt();
					turn.getCurrentPlayer().addItemCard(null);
				} else {
					step = turn.rollDice();
				}

			} else {
				System.out.println("Type roll to roll the dice.");
				String input = scanner.nextLine();
				if (input.equals("roll")) {
					step = turn.rollDice();
				}
			}
			if ((turn.getCurrentPlayer().getPosition() + step) % 24 < turn.getCurrentPlayer().getPosition()) {
				turn.getCurrentPlayer().increaseMoney(10000);
				System.out.println("Player " + turn.getCurrentPlayer().getPlayerNumber()
						+ " has passed the START tile and gain 10000.");
			}
			(turn.getCurrentPlayer()).move(step);
			System.out.println("Player" + turn.getCurrentPlayer().getPlayerNumber() + " move " + step + " step(s).");
			System.out.println("Player" + turn.getCurrentPlayer().getPlayerNumber() + " current position is "
					+ turn.getCurrentPlayer().getPosition());
			System.out.println("Player" + turn.getCurrentPlayer().getPlayerNumber() + " current location is "
					+ board.getLocationName(turn.getCurrentPlayer().getPosition()));
			turn.action(board, player1, player2, gameOver, winner);
			turn.checkSpacialWin(board, player1, player2, gameOver, winner);
			if (gameOver && winner != 0) {
				System.out.println("Player" + winner + " win!!!!");
				break;
			}
			Player player = turn.getCurrentPlayer();
			if (!skipTurn) {

				turn.changeCurrentPlayer(player1, player2);

			} else {
				skipTurn = false;
			}
			if (turn.skipNextTurn(player)) {
				skipTurn = true;
			}
			turnCount += 1;

		}
		if (turnCount == 29) {
			if (player1.totalAsset() == player2.totalAsset()) {
				System.out.println("Spacial ending Tieeee lucky!!!!!");
			} else {
				if (player1.totalAsset() > player2.totalAsset()) {
					System.out.println("Player1 win!!!!");
				} else {
					System.out.println("Player2 win!!!!");
				}
				
			}
			
		}

	}

	public static void setGameOver(boolean status) {
		gameOver = status;
	}

	public static void setWinner(int player) {
		winner = player;
	}
}
