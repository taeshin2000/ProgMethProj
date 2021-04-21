package logic;

import itemcard.ItemCard;

public class Player {
	private int playerNumber;
	private String name;
	private int money;
	private ItemCard itemCard;
	private int position;
	private int houseOwnValue;
	
	public Player(int playernumber,String name) {
		this.playerNumber = playernumber;
		this.name = name;
		this.money = 5000; //มั่วไปก่อน
		this.itemCard = null;
		this.position = 0;
		this.houseOwnValue = 0;
	}
	
	
}
