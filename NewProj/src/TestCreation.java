import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
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

public class TestCreation extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

//		Color normalTileColor = Color.web("#C4C4C4", 0.4);
//		
//		Rectangle rect1 = new Rectangle(100,100);
//		
//		rect1.setFill(normalTileColor);
//		rect1.setArcHeight(30);
//		rect1.setArcWidth(30);
//		
//		NormalLocationTile cont1 = new NormalLocationTile(new TileUI("Red"),"Prayuth","44",1);
//		NormalLocationTile cont2 = new NormalLocationTile(new TileUI("Green"),"คณะวิทยาศาสตร์","112",2);
//		
//		cont2.setLayoutX(100);
		
		LocationTile tile1 = new LocationTile(0, "Prayuth", 20);
		IslandLocationTile island1 = new IslandLocationTile(0, "IsLand", 50);
		IslandLocationTile island2 = new IslandLocationTile(1, "ชื่อคณะนี้ย๊าววยาว", 0);
		
		StartTile start = new StartTile();
		JailTile jail = new JailTile();
		DoubleTile doubleTile = new DoubleTile();
		WarpTile warp = new WarpTile();
		
		ItemTile item1 = new ItemTile(1);
		
		FlowPane box = new FlowPane();
		box.getChildren().addAll(tile1,island1,island2,start,jail,doubleTile,warp,item1);
		
		VBox root = new VBox();
		root.getChildren().addAll(box);
		
		
		Button btn = new Button("Change");
		btn.setLayoutX(200);
		root.getChildren().add(btn);
		
		btn.setOnAction(event -> {
			tile1.updateColor("Green");
			tile1.updateTextLocation("Prawit");
			tile1.updateTextPrice(200);
			
			island1.updateColor("Red");
			island1.updateTextLocation("IsNotLand");
			
			island2.updateTextPrice(555);
		} );
		
		
		
		Scene scene = new Scene(root,500,500);
		stage.setScene(scene);
		stage.show();
		
	}
}
