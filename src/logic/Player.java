package logic;

import itemcard.ItemCard;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.Tile;

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
		this.money = 100000;
		this.itemCard = null;
		this.position = 0;
		this.houseOwnValue = 0;
	}

	public void move(int step) {
		int newPosition = (this.position + step)%24;
		this.position = newPosition;
		
	}

	public int getPlayerNumber() {
		return this.playerNumber;
	}

	public int getPosition() {
		return this.position;
	}
	
	public boolean buyLocation(LocationTile location) {
		if(this.money >= location.getBuyPrice()) {
			this.money -= location.getBuyPrice();
			return true;
		}
		return false;
		
	}
	
	public int getMoney(){
		return this.money;
	}

	public boolean upgradeLocation(NormalLocationTile normalLocationTile) {
		if (this.money >= normalLocationTile.getUpgradePrice()) {
			this.money -= normalLocationTile.getUpgradePrice();
			return true;
		}
		return false;
		
	}
	
	
}
