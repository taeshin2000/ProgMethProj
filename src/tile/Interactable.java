package tile;

import application.InitialBoard;
import logic.Player;

public interface Interactable {
	public void interact(Player player,InitialBoard boards);
}
