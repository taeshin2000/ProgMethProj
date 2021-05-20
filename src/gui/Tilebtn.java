package gui;

import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import tile.ATile;
import tile.DrunkTile;
import tile.GetItemTile;
import tile.IslandLocationTile;
import tile.JailTile;
import tile.LocationTile;
import tile.NormalLocationTile;
import tile.StartTile;
import tile.Tile;

public class Tilebtn extends Pane {
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
		// setBuyPriceText();
		// setNameText();
		String cssDefault = "-fx-border-color: lightgray;\n" + "-fx-border-insets: 0;\n" + "-fx-border-width: 4;\n"
				+ "-fx-border-style: solid;\n";
		this.setStyle(cssDefault);

		this.nameText.setLayoutX(0);
		this.nameText.setLayoutY(50);
		setToolTip();
		this.getChildren().addAll(buyPriceText, nameText);
		

	}

	public void setBuyPriceText() {
		if (tile instanceof LocationTile) {
			buyPriceText.setText(Integer.toString(((LocationTile) tile).getBuyPrice()));

		} else {
			buyPriceText.setText("");
		}
	}

	public void setNameText() {
		nameText.setText(tile.getname());
	}

	public void setToolTip() {
		Tooltip toolTip = new Tooltip();
		toolTip.setFont(new Font(20));
		String toolTipText = tile.getname() + "\n";
		if (tile instanceof NormalLocationTile) {
			toolTipText += "Buy price : " + ((NormalLocationTile) tile).getBuyPrice() + "\n" + "Fall price : "
					+ ((NormalLocationTile) tile).getFallPrice() + "\n" + "Transfer price : "
					+ ((NormalLocationTile) tile).getTransferPrice();
		} else if (tile instanceof IslandLocationTile) {
			toolTipText += "Buy price : " + ((IslandLocationTile) tile).getBuyPrice() + "\n" + "Fall price : "
					+ ((IslandLocationTile) tile).getFallPrice();
		} else if (tile instanceof StartTile) {
			toolTipText += "You get 20000 by walk pass this tile";
		} else if (tile instanceof JailTile) {
			toolTipText += "You can't move for 1 turn";
		} else if (tile instanceof GetItemTile) {
			toolTipText += "You randomly get 1 of the following card " + "\n"
					+ ": getmoneycard,losemoneycard,protectioncard";
		} else if (tile instanceof DrunkTile) {
			toolTipText += "You lose 50% of your money";
		} else if (tile instanceof ATile) {
			toolTipText += "You get 50% of your money";
		}
		toolTip.setText(toolTipText);
		this.setOnMouseMoved((MouseEvent e) -> {

			toolTip.show(this, e.getScreenX() + 10, e.getScreenY() + 10);

		});
		this.setOnMouseExited((MouseEvent e) -> {
			toolTip.hide();
		});
	}
}
