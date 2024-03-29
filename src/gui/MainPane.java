package gui;

import application.GameController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import tile.Tile;

public class MainPane extends Pane{
	private ObservableList<TileBtn> TileBtnList = FXCollections.observableArrayList();
	
	
	public MainPane() {
		// TODO Auto-generated constructor stub
		this.setPrefSize(700, 700);
		this.setBackground(new Background(new BackgroundFill(Color.PINK, null	, null)));
		TileBtnList = FXCollections.observableArrayList();
		for( Tile e : GameController.board.getTileList()) {
			TileBtn tileBtn = new TileBtn(e);
			TileBtnList.add(tileBtn);
		}
		setPosition();
	}
	
	public void setPosition() {
		for (int i=0;i<24;i++) {
			if (i == 0) {
				TileBtnList.get(i).setLayoutX(600);
				TileBtnList.get(i).setLayoutY(600);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 1) {
				TileBtnList.get(i).setLayoutX(500);
				TileBtnList.get(i).setLayoutY(600);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 2) {
				TileBtnList.get(i).setLayoutX(400);
				TileBtnList.get(i).setLayoutY(600);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 3) {
				TileBtnList.get(i).setLayoutX(300);
				TileBtnList.get(i).setLayoutY(600);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 4) {
				TileBtnList.get(i).setLayoutX(200);
				TileBtnList.get(i).setLayoutY(600);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 5) {
				TileBtnList.get(i).setLayoutX(100);
				TileBtnList.get(i).setLayoutY(600);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 6) {
				TileBtnList.get(i).setLayoutX(0);
				TileBtnList.get(i).setLayoutY(600);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 7) {
				TileBtnList.get(i).setLayoutX(0);
				TileBtnList.get(i).setLayoutY(500);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 8) {
				TileBtnList.get(i).setLayoutX(0);
				TileBtnList.get(i).setLayoutY(400);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 9) {
				TileBtnList.get(i).setLayoutX(0);
				TileBtnList.get(i).setLayoutY(300);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 10) {
				TileBtnList.get(i).setLayoutX(0);
				TileBtnList.get(i).setLayoutY(200);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 11) {
				TileBtnList.get(i).setLayoutX(0);
				TileBtnList.get(i).setLayoutY(100);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			
			}
			if(i == 12) {
				TileBtnList.get(i).setLayoutX(0);
				TileBtnList.get(i).setLayoutY(0);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 13) {
				TileBtnList.get(i).setLayoutX(100);
				TileBtnList.get(i).setLayoutY(0);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
				
			}
			if(i == 14) {
				TileBtnList.get(i).setLayoutX(200);
				TileBtnList.get(i).setLayoutY(0);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 15) {
				TileBtnList.get(i).setLayoutX(300);
				TileBtnList.get(i).setLayoutY(0);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 16) {
				TileBtnList.get(i).setLayoutX(400);
				TileBtnList.get(i).setLayoutY(0);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 17) {
				TileBtnList.get(i).setLayoutX(500);
				TileBtnList.get(i).setLayoutY(0);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 18) {
				TileBtnList.get(i).setLayoutX(600);
				TileBtnList.get(i).setLayoutY(0);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 19) {
				TileBtnList.get(i).setLayoutX(600);
				TileBtnList.get(i).setLayoutY(100);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 20) {
				TileBtnList.get(i).setLayoutX(600);
				TileBtnList.get(i).setLayoutY(200);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 21) {
				TileBtnList.get(i).setLayoutX(600);
				TileBtnList.get(i).setLayoutY(300);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 22) {
				TileBtnList.get(i).setLayoutX(600);
				TileBtnList.get(i).setLayoutY(400);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			if(i == 23) {
				TileBtnList.get(i).setLayoutX(600);
				TileBtnList.get(i).setLayoutY(500);
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
		                new Image(ClassLoader.getSystemResourceAsStream("freeTile/"
		                		+ Integer.toString(i)
		                		+ ".png"), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
		                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			this.getChildren().add(TileBtnList.get(i));
		}
		
	}
	
	public void updateMainPaneScreen() {
		int pos1 = GameController.player1.getPosition();
		int pos2 = GameController.player2.getPosition();
		if (pos1 == pos2) {
			for (int i = 0;i<24;i++) {
				String url;
				if (i != pos1) {
					url = "freeTile/" + Integer.toString(i) + ".png";
				}else {
					url = "allTile/" + Integer.toString(pos1) + ".jpg"; 
		
				}
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream(url), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
						BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
		}else {
			for (int i = 0;i<24;i++) {
				String url;
				if (i != pos1 && i != pos2) {
					url = "freeTile/" + Integer.toString(i) + ".png";
				}else {
					if(i == pos1) {
						url = "p1Tile/" + Integer.toString(pos1) + ".jpg";
					}else {
						url = "p2Tile/" + Integer.toString(pos2) + ".jpg";
					}
				}
				TileBtnList.get(i).setBackground(new Background(new BackgroundImage(
						new Image(ClassLoader.getSystemResourceAsStream(url), 100, 100, false, true), BackgroundRepeat.NO_REPEAT,
						BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
			}
			
		}
	}
	
	public ObservableList<TileBtn> getTileBtnList(){
		return this.TileBtnList;
	}
}
