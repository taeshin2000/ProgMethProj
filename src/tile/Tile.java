package tile;

public class Tile{
	private String name;
	private int position;
	
	public Tile(String name,int position) {
		this.name = name;
		this.position = position;
	}

	public String getname() {
		return this.name;
	}
	
	public int getPosition() {
		return this.position;
	}

	
}
