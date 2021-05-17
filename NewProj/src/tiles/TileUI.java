package tiles;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TileUI extends Region {

	private final int size = 100;
	private final int borderRadiusNum = 16;
	private final String borderRadius = borderRadiusNum + "px";
	private String colorCode = "rgba(196,196,196,0.4)";

	public TileUI() {
		this.setPrefSize(size, size);
		this.setMaxSize(size, size);
		setStyleNoBorder();
	}

	
	public void setColorCode(String color) {
		switch (color) {
		case "Red":
			this.colorCode = "rgba(207,54,100,0.8)";
			break;
		case "Green":
			this.colorCode = "rgba(10,205,193,0.7)";
			break;
		case "Blue":
			this.colorCode = "rgba(90,120,198,0.8)";
			break;
		case "Pink":
			this.colorCode = "rgba(245,224,243,0.8)";
			break;
		default:
			this.colorCode = "rgba(196,196,196,0.4)";
		}
	}

//	public void setStyleNoBorder() {
//		this.setStyle("-fx-background-color: " + "rgba(196,196,196,0.4)" + "; -fx-background-radius: " + borderRadius);
//	}

	public void setStyleNoBorder() {
		this.setStyle("-fx-background-color: " + this.colorCode + "; -fx-background-radius: " + borderRadius);
	}

//	public void setStyleWithBorder() {
//		this.setStyle("-fx-background-color: " + "rgba(245,224,243,1)" + "; -fx-background-radius: " + borderRadius
//				+ "; -fx-border-color: " + "rgba(245,224,243,1)" + "; -fx-border-width: 5;"
//				+ "; -fx-border-style: solid" + "; -fx-border-radius: 16;");
//	}

	public void setStyleWithBorder() {
		this.setStyle("-fx-background-color: " + this.colorCode + "; -fx-background-radius: " + borderRadius
				+ "; -fx-border-color: " + "rgba(238,146,126,1)" + "; -fx-border-width: 5;"
				+ "; -fx-border-style: solid" + "; -fx-border-radius: 14;");
	}

}
