package gui;

public class MenuButton extends GameButton {
	
	private static final String pinkColorCode = "rgba(248,196,191,1)";
	public MenuButton() {
		super(pinkColorCode,200,80);
	}
	
	public MenuButton(String text) {
		this();
		this.setButtonText(text);
	}
}
