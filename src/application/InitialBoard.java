package application;

import java.util.ArrayList;

import tile.DoublePriceTile;
import tile.GetItemTile;
import tile.JailTile;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.IslandLocationTile;
import tile.StartTile;
import tile.Tile;
import tile.WarpTile;

public class InitialBoard {
	private ArrayList<Tile> tileList;
	
	public InitialBoard() {
		this.tileList = new ArrayList<Tile>();
		// x1
		this.tileList.add(new StartTile("Start"));
		this.tileList.add(new NormalLocationTile("Mahamakut Building",12000,1));
		this.tileList.add(new NormalLocationTile("Physics Laboratory",15000,1));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new IslandLocationTile("Faculty of Science", 7000,1));
		this.tileList.add(new NormalLocationTile("True Coffee", 20000,1));
		this.tileList.add(new JailTile("Jail"));
		
		// x2
		this.tileList.add(new NormalLocationTile("CE Building", 35000,2));
		this.tileList.add(new NormalLocationTile("Computer Center", 25000,2));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new NormalLocationTile("EE Building", 23000,2));
		this.tileList.add(new IslandLocationTile("Faculty of Commerce and Accountancy", 8000,2));
		this.tileList.add(new DoublePriceTile("DoublePrice"));
		
		// x3
		this.tileList.add(new NormalLocationTile("ENG100 Building", 18000,3));
		this.tileList.add(new NormalLocationTile("ENG4 Building", 28000,3));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new NormalLocationTile("Central Library", 36000,3));
		this.tileList.add(new NormalLocationTile("iCanteen", 45000,3));
		this.tileList.add(new WarpTile("Warp"));
		
		// x4
		this.tileList.add(new IslandLocationTile("Faculty Of Arts", 9000,4));
		this.tileList.add(new NormalLocationTile("Computer Engineering", 50000,4));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new NormalLocationTile("Engineering Library", 55000,4));
		this.tileList.add(new NormalLocationTile("Sky cafe", 60000,4));
		
		
		
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

}
