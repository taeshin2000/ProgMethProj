package logic;

import java.util.ArrayList;

import itemcard.ItemCard;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.SpacialLocationTile;
import tile.Tile;

public class Player {
	private int playerNumber;
	private String name;
	private int money;
	private ItemCard itemCard;
	private int position;
	private ArrayList<NormalLocationTile>normalLocationList;
	private ArrayList<SpacialLocationTile>spcialLocationList;
	
	public Player(int playernumber,String name) {
		this.playerNumber = playernumber;
		this.name = name;
		this.money = 100000;
		this.itemCard = null;
		this.position = 0;
		this.normalLocationList = new ArrayList<NormalLocationTile>();
		this.spcialLocationList = new ArrayList<SpacialLocationTile>();
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
			if (location instanceof NormalLocationTile) {
				this.normalLocationList.add((NormalLocationTile) location);
			}else {
				this.spcialLocationList.add((SpacialLocationTile) location);
			}
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
	
	public boolean fallOnOtherPlayer(LocationTile location) {
		if (this.money >= location.getFallPrice()) {
			this.money -= location.getFallPrice();
			return true;
		}
		return false;
	}

	public boolean transferLocation(NormalLocationTile normalLocationTile) {
		if(this.money >= normalLocationTile.getTransferPrice()) {
			this.money -= normalLocationTile.getTransferPrice();
			this.normalLocationList.add(normalLocationTile);
			return true;
		}
		return false;
	}

	public void increaseMoney(int amount) {
		this.money += amount;
		
	}

	public ArrayList<SpacialLocationTile> getSpacialLocationList() {
		return this.spcialLocationList;
	}

	public void removeLocation(NormalLocationTile normalLocationTile) {
		this.spcialLocationList.remove(normalLocationTile);
		
	}
	
	public int totalAsset() {
		int money = this.money;
		for (NormalLocationTile e : normalLocationList) {
			money += e.getFallPrice();
		}
		
		for (SpacialLocationTile e : spcialLocationList) {
			money += e.getFallPrice();
		}
		return money;
	}

	public void setPosition(int position) {
		this.position = position;
		
	}

	
	
	
	
}
