package gui.pane.board;

import javafx.scene.layout.VBox;
import tiles.IslandLocationTile;
import tiles.ItemTile;
import tiles.LocationTile;

public class RightBoardPane extends VBox{
	
	IslandLocationTile tile19;
	LocationTile tile20;
	ItemTile tile21;
	LocationTile tile22;
	LocationTile tile23;
	
	public RightBoardPane() {
		this.setLayoutX(670);
		this.setLayoutY(150);
		
		tile19 = new IslandLocationTile(19, "����ѡ��", 9);
		tile20 = new LocationTile(20, "�Ҥ���", 50);
		tile21 = new ItemTile(21);
		tile22 = new LocationTile(22, "��ͧ��ش �����", 55);
		tile23 = new LocationTile(23, "Sky Cafe", 60);
		
		this.getChildren().addAll(tile19,tile20,tile21,tile22,tile23);
	}
}
