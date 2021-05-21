package gui.onebuttonpane.exitgamepane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TiePane extends Base_ExitButtonPane{

	public	TiePane() {
		super("Both player have equal total asset --> Tie!!",Color.LIGHTBLUE);

	}
}
