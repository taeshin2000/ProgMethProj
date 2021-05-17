import gui.pane.BuyMenuPane;
import gui.pane.PauseMenuPane;
import gui.pane.UpgradeMenuPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestCreationOverlayOnly extends Application{
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		PauseMenuPane pause = new PauseMenuPane();
		pause.setVisible(true);
		
		
		BuyMenuPane buy = new BuyMenuPane();
		buy.setBuyStatus("คณะวิทยาศาสตร์", 10000, 12000, 280000);
		
		UpgradeMenuPane up = new UpgradeMenuPane();
		up.setUpgradeStatus("คณะวิทยาศาสตร์", 10000,  280000);
		
		Scene scene = new Scene(buy,1200,800);
		stage.setScene(scene);
		stage.show();
		
	}
}
