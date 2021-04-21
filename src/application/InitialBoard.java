package application;

import java.util.ArrayList;

import tile.NormalLocationTile;
import tile.StartTile;
import tile.Tile;

public class InitialBoard {
	private ArrayList<Tile> tileList;
	
	public InitialBoard() {
		this.tileList = new ArrayList<Tile>();
		this.tileList.add(new StartTile("Start"));
		this.tileList.add(new NormalLocationTile(name, buyprice, fallprice, upgradeprice, transferprice) );
		
	}

}
