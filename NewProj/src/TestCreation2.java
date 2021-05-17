import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tiles.IslandLocationTile;
import tiles.ItemTile;
import tiles.LocationTile;
import tiles.TileUI;
import tiles.corner.DoubleTile;
import tiles.corner.JailTile;
import tiles.corner.StartTile;
import tiles.corner.WarpTile;

public class TestCreation2 extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		FlowPane fp = new FlowPane();
		
				
		Button btn = new Button("Change");
		btn.setLayoutX(200);
		
		// Rolling a new dice.
		
		
		ImageView iv = new ImageView();	
		btn.setOnAction(event -> {
			int diceNo = rollDice();
			Image diceIMG = new Image(ClassLoader.getSystemResourceAsStream("dice/Dice_"
					+ Integer.toString(diceNo)
					+ ".png"));
			
			iv.setImage(diceIMG);
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(fp,iv);

		root.getChildren().add(btn);
		Scene scene = new Scene(root,500,500);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public int rollDice() {
		return new Random().nextInt(6) + 1;
	}
}
