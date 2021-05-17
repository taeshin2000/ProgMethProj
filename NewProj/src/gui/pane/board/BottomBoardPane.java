package gui.pane.board;
import javafx.scene.layout.HBox;
import tiles.IslandLocationTile;
import tiles.ItemTile;
import tiles.LocationTile;
import tiles.corner.JailTile;
import tiles.corner.StartTile;

public class BottomBoardPane extends HBox {

	private StartTile start;
	private LocationTile tile1;
	private LocationTile tile2;
	private ItemTile tile3;
	private IslandLocationTile tile4;
	private LocationTile tile5;
	private JailTile jail;
	
	public BottomBoardPane() {
		this.setLayoutX(70);
		this.setLayoutY(650);
		
		start = new StartTile();
		tile1 = new LocationTile(1, "มหามกุฏ", 12);
		tile2 = new LocationTile(2, "ตึกฟิสิกส์" , 15);
		tile3 = new ItemTile(3);
		tile4 = new IslandLocationTile(4,"คณะวิทยาศาสตร์",7);
		tile5 = new LocationTile(5,"True Coffee",20);
		jail = new JailTile();
		
		this.getChildren().addAll(jail,tile5,tile4,tile3,tile2,tile1,start);
	}


	
	
}
