import gui.BuyButton;
import gui.PlayerDisplay;
import gui.UpgradeButton;
import gui.imagebtn.CloseButton;
import gui.imagebtn.PauseButton;
import gui.pane.BuyMenuPane;
import gui.pane.PlayerPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestCreation3 extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		BuyButton btn = new BuyButton(22);
		UpgradeButton up = new UpgradeButton(15000);
		CloseButton close = new CloseButton();
		PauseButton pause = new PauseButton();
		
		
		HBox root = new HBox();
		
		
		Scene scene = new Scene(root,500,500);
		stage.setScene(scene);
		stage.show();
		
	}
}
