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


public class BoardUI extends StackPane {
	
	BottomBoardPane bottomBoard;
	LeftBoardPane leftBoard;
	TopBoardPane topBoard;
	RightBoardPane rightBoard;
	PlayerPane playerPane;
	
	public BoardUI() {
		/* Setting up 4 sides of the board.*/
		bottomBoard = new BottomBoardPane();
		leftBoard = new LeftBoardPane();
		topBoard = new TopBoardPane();
		rightBoard = new RightBoardPane();

		/* Player Display*/
		playerPane = new PlayerPane();

		// Root pane
		Pane root = new Pane();
		root.getChildren().addAll(topBoard,leftBoard,bottomBoard,rightBoard,playerPane);		

		// Set background
		Image backgroundImage = new Image(ClassLoader.getSystemResourceAsStream("background/BG.png"));
		root.setBackground(new Background(new BackgroundImage(backgroundImage,BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT)) );
		
		// PauseMenu Overlay
		PauseMenuPane pauseMenuPane = new PauseMenuPane();

		PauseButton btnPause = new PauseButton();
		btnPause.setLayoutX(1110);btnPause.setLayoutY(10);
		btnPause.setOnMouseClicked(event->{
			pauseMenuPane.setVisible(true);
			btnPause.playSound();
		});
		
		root.getChildren().add(btnPause);
		this.getChildren().addAll(root,pauseMenuPane);
	}

}
