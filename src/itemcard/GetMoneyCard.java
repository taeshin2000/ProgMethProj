package itemcard;

import logic.Player;

public class GetMoneyCard extends InstantUseCard {

	public GetMoneyCard(String name) {
		super(name);
	}

	@Override
	public void active(Player player) {
		player.increaseMoney(20000);
		System.out.println("You get money card and gain 20000");
		
	}
	

}
