package application;

import java.util.ArrayList;

import tile.DrunkTile;
import tile.GetItemTile;
import tile.JailTile;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.IslandLocationTile;
import tile.StartTile;
import tile.Tile;
import tile.ATile;

public class InitialBoard {
	private ArrayList<Tile> tileList;
	
	public InitialBoard() {
		this.tileList = new ArrayList<Tile>();
		// x1
		this.tileList.add(new StartTile("Start",0));
		this.tileList.add(new NormalLocationTile("Mahamakut Building",12000,1));
		this.tileList.add(new NormalLocationTile("Physics Laboratory",15000,2));
		this.tileList.add(new GetItemTile("Item",3));
		this.tileList.add(new IslandLocationTile("Faculty of Science", 7000,4));
		this.tileList.add(new NormalLocationTile("True Coffee", 20000,5));
		this.tileList.add(new JailTile("Jail",6));
		
		// x2
		this.tileList.add(new NormalLocationTile("CE Building", 23000,7));
		this.tileList.add(new NormalLocationTile("Computer Center", 25000,8));
		this.tileList.add(new GetItemTile("Item",9));
		this.tileList.add(new NormalLocationTile("EE Building", 30000,10));
		this.tileList.add(new IslandLocationTile("Faculty of Commerce and Accountancy", 8000,11));
		this.tileList.add(new DrunkTile("DoublePrice",12));
		
		// x3
		this.tileList.add(new NormalLocationTile("ENG100 Building", 35000,13));
		this.tileList.add(new NormalLocationTile("ENG4 Building", 38000,14));
		this.tileList.add(new GetItemTile("Item",15));
		this.tileList.add(new NormalLocationTile("Central Library", 40000,16));
		this.tileList.add(new NormalLocationTile("iCanteen", 45000,17));
		this.tileList.add(new ATile("Warp",18));
		
		// x4
		this.tileList.add(new IslandLocationTile("Faculty Of Arts", 9000,19));
		this.tileList.add(new NormalLocationTile("Computer Engineering", 50000,20));
		this.tileList.add(new GetItemTile("Item",21));
		this.tileList.add(new NormalLocationTile("Engineering Library", 55000,22));
		this.tileList.add(new NormalLocationTile("Sky cafe", 60000,23));
		
		
		
	}
	
	public String getLocationName(int index) {
		return tileList.get(index).getname();
	}
	
	public Tile getTile(int index) {
		return tileList.get(index);
	}
	
	public void setLocationTileOwner(int index,int playerNumber) {
		((LocationTile)(this.tileList.get(index))).setOwner(playerNumber);
	}
	

	public void increaseLocationPrice(int index) {
		((NormalLocationTile)(this.tileList.get(index))).increasePrice();
	}

	public void doubleFallPrice(int index) {
		((NormalLocationTile)(this.tileList.get(index))).increaseFallPrice();
		
	}
	
	public ArrayList<Tile> getTileList(){
		return this.tileList;
	}
}
