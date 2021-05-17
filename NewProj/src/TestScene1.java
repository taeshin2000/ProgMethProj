import application.MainMenuUI;
import entity.Dice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestScene1 extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Scene scene = new Scene(new MainMenuUI(),1200,800);
		stage.setScene(scene);
		stage.show();
		
	}
}
