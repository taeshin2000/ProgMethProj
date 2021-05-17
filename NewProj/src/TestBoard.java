import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TestBoard extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
	
//		Dice dice1 = new Dice(1);
//		ImageView iv1 = new ImageView(dice1.getImage());
//		iv1.setFitHeight(50);
//		iv1.setFitWidth(50);
		
		
		
		HBox topBox = new HBox();
		HBox bottomBox = new HBox();
		VBox leftBox = new VBox();
		VBox rightBox = new VBox();
		Pane center = new Pane();
		
		center.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, null, null)));
		
		/*This will error... Why??*/
//		Rectangle iv1 = new Rectangle(50,50);
//		iv1.setFill(Color.GOLD);
		for (int i = 0; i < 7; i++) {
			System.out.println(i);
			Rectangle iv1 = new Rectangle(50,50);
			iv1.setFill(Color.GOLD);
//			topBox.getChildren().add(iv1);
//			bottomBox.getChildren().add(iv1);
//			leftBox.getChildren().add(iv1);
//			rightBox.getChildren().add(iv1);
			topBox.getChildren().add(new Rectangle(50,50));
			leftBox.getChildren().add(new Rectangle(50,50));
		}
		
		BorderPane board = new BorderPane(null,topBox,rightBox,bottomBox,leftBox);
//		board.setPrefSize(700, 700);
		
		Pane root = new Pane();
		
		Scene scene = new Scene(root, 1200, 800);
		stage.setScene(scene);
		stage.show();

	}
}
