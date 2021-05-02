package tile;

import java.util.Scanner;

import logic.Player;

public class WarpTile extends Tile implements Interactable {
	public WarpTile(String name) {
		super(name);
	}

	@Override
	public void interact(Player player) {
		int intinput = 18;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Where do you want to go?");
		while (true) {
			int input = scanner.nextInt();
			if (input == 18) {
				System.out.println("You can not go to warp tile again!!! insert new value.");
			}else if (input == 6) {
				System.out.println("You can not warp to Jail!!! insert new value.");
			}else {
				intinput = input;
				break;
			}
			
		}
		player.setPosition(intinput);
		System.out.println("Current position is " + player.getPosition());
		
		
	}



}
