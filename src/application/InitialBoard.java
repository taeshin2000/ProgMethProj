package application;

import java.util.ArrayList;

import tile.DoublePriceTile;
import tile.GetItemTile;
import tile.JailTile;
import tile.NormalLocationTile;
import tile.SpacialLocationTile;
import tile.StartTile;
import tile.Tile;
import tile.WarpTile;

public class InitialBoard {
	private ArrayList<Tile> tileList;
	
	public InitialBoard() {
		this.tileList = new ArrayList<Tile>();
		this.tileList.add(new StartTile("Start"));
		this.tileList.add(new NormalLocationTile("Mahamakut Building",12000));
		this.tileList.add(new NormalLocationTile("Physics Laboratory",15000));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new SpacialLocationTile("Faculty Of Arts", 7000));
		this.tileList.add(new NormalLocationTile("True Coffee", 20000));
		this.tileList.add(new JailTile("Jail"));
		this.tileList.add(new NormalLocationTile("Civil Engineering", 35000));
		this.tileList.add(new NormalLocationTile("Computer Center", 25000));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new NormalLocationTile("Electrical Engineering", 23000));
		this.tileList.add(new SpacialLocationTile("Faculty of Commerce and Accountancy", 8000));
		this.tileList.add(new DoublePriceTile("DoublePrice"));
		this.tileList.add(new NormalLocationTile("Building Engineering 100 Years", 18000));
		this.tileList.add(new NormalLocationTile("4th building", 28000));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new NormalLocationTile("Office of Academic Resources", 36000));
		this.tileList.add(new NormalLocationTile("Icanteen", 50000));
		this.tileList.add(new WarpTile("Warp"));
		this.tileList.add(new SpacialLocationTile("Faculty of Science", 9000));
		this.tileList.add(new NormalLocationTile("Compute Engineering", 55000));
		this.tileList.add(new GetItemTile("Item"));
		this.tileList.add(new NormalLocationTile("Library", 35000));
		this.tileList.add(new NormalLocationTile("Sky caffee", 48000));
		
		
		
	}

}
