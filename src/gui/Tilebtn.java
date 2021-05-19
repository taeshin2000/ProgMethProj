package gui;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import tile.LocationTile;
import tile.Tile;

public class Tilebtn extends Pane{
	private Tile tile;
	private Text buyPriceText;
	private Text nameText;
	private int owner;
	
	public Tilebtn(Tile tile) {
		// TODO Auto-generated constructor stub
		this.tile = tile;
		this.setPrefSize(100, 100);
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
		this.nameText = new Text();
		this.buyPriceText = new Text();
		//setBuyPriceText();
		//setNameText();
		String cssDefault = "-fx-border-color: lightgray;\n"
                + "-fx-border-insets: 0;\n"
                + "-fx-border-width: 4;\n"
                + "-fx-border-style: solid;\n";
		this.setStyle(cssDefault);
		
		this.nameText.setLayoutX(0);
		this.nameText.setLayoutY(50);
		this.getChildren().addAll(buyPriceText,nameText);
		
	}
	
	public void setBuyPriceText(){
		if (tile instanceof LocationTile) {
			buyPriceText.setText(Integer.toString(((LocationTile) tile).getBuyPrice()));
			
		}else {
			buyPriceText.setText("");
		}
	}
	
	public void setNameText() {
		nameText.setText(tile.getname());
	}
}
