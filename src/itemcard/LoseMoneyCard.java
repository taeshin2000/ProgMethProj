package itemcard;

import logic.Player;

public class LoseMoneyCard extends InstantUseCard {

	public LoseMoneyCard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void active(Player player) {
		player.decreaseMoney(20000);
		System.out.println("You lose 20000");
		System.out.println("Your current money is " + player.getMoney());
		
		
	}

}
