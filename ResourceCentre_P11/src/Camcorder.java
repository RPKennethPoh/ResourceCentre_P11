
public class Camcorder extends Item{
	private int Zoom;

	public Camcorder(String assetTag, String description, int Zoom) {
		super(assetTag, description);
		this.Zoom = Zoom;
	}

	public int getZoom() {
		return Zoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}

