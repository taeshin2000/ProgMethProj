package application;
import gui.GameButton;
import gui.imagebtn.CloseButton;
import gui.imagebtn.PauseButton;
import gui.pane.PauseMenuPane;
import gui.pane.PlayerPane;
import gui.pane.board.BottomBoardPane;
import gui.pane.board.LeftBoardPane;
import gui.pane.board.RightBoardPane;
import gui.pane.board.TopBoardPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	
	BottomBoardPane bottomBoard;
	LeftBoardPane leftBoard;
	TopBoardPane topBoard;
	RightBoardPane rightBoard;
	
	PlayerPane playerPane;
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Scene scene = new Scene(new BoardUI(), 1200, 800);
		Scene mainMenu = new Scene(new MainMenuUI(),1200,800);
		stage.setScene(scene);
		stage.setTitle("Let's Get Rich in Chula!");
		stage.getIcons().add(new Image(ClassLoader.getSystemResourceAsStream("ico.png")));
		
		stage.show();

	}
}
