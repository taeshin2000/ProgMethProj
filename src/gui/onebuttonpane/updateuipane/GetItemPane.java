package gui.onebuttonpane.updateuipane;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import main.Main;

public class GetItemPane extends Base_UpdateUIButtonPane {
	
	public GetItemPane() {
		super("", Color.LIGHTBLUE);
	
		super.getOKButton().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.getItemPane.setVisible(false);
				updateUI();
			}
		});
		
		
	}
	
	public void updateGetItemPaneScreen(String text1) {
		Platform.runLater(()->{
			this.setDisplayText(text1);
		});
		
	}
}
