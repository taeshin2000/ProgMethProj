package gui.onebuttonpane.updateuipane;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import main.Main;

public class APane extends Base_UpdateUIButtonPane {


	public APane() {
		super("You get grade A in Progmeth so Aj.Toe"+"\n" +"give you 50% of your current money!!!",Color.LIGHTYELLOW);
		
		super.getOKButton().setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Main.aPane.setVisible(false);
				updateUI();			
			}
		});


	}
}
