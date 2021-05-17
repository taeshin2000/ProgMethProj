package tiles;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import text.GameText;
import text.GameTextLight;

public class LocationTile extends Tile{
//
//	private int buyPrice;
//	protected int owner = 0;
//	private int fallPrice;
//	protected boolean hasOwner = false;
	
	protected TileUI tileUI;
	private GameText locationUI;
	private GameTextLight priceUI;
	
	private String location;
	private int price;
	
	public LocationTile(int position,String locationString, int priceInt, String colorString) {
		super(position);
	
		tileUI = new TileUI();
		updateColor(colorString);

		locationUI = new GameText("");
		updateTextLocation(locationString);
		
		priceUI = new GameTextLight("");
		updateTextPrice(priceInt);
		
		
		this.getChildren().addAll(tileUI,locationUI,priceUI);
		
		StackPane.setAlignment(locationUI, Pos.TOP_CENTER);
		StackPane.setMargin(locationUI, new Insets(10,0,0,0));
		StackPane.setAlignment(priceUI, Pos.BOTTOM_CENTER);
		StackPane.setMargin(priceUI, new Insets(0,0,5,0));
	}

	public LocationTile(int position,String locationString, int priceInt) {
		this(position,locationString,priceInt,"rgba(196,196,196,0.4)");
	}
		
	
	public void updateColor() {
		this.tileUI.setColorCode("default");
		this.tileUI.setStyleNoBorder();
	}
	
	public void updateColor(String color) {
		this.tileUI.setColorCode(color);
		this.tileUI.setStyleNoBorder();
	}
	
	public void updateTextLocation(String locationString) {
		this.location = locationString;
		this.locationUI.setText(locationString);
		locationUI.setWrappingWidth(73);
		locationUI.setTextAlignment(TextAlignment.CENTER);
	}
	
	public void updateTextPrice(int priceInt) {
		this.price = priceInt*1000;
		this.priceUI.setText(Integer.toString(priceInt)+"k");
	}
	
	public void testUpdatePrice(String newPrice) {
		this.priceUI.setText(newPrice);
	}
		
}
