import entity.Dice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Test extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		/* 1. Create Elements
		 * 2. Create non-root container
		 * 3. Create root container 
		 * 4. Add non-root to root
		 * 5. Add root to Scene
		 * 6. Add Scene to Stage 
		 * */
		Dice dice1 = new Dice(1);
		ImageView iv1 = new ImageView(dice1.getImage());
	
		Pane root = new Pane();
		root.getChildren().add(iv1);
		
		Scene scene = new Scene(root,1200,800);
		stage.setScene(scene);
		stage.show();
		
	}
}
