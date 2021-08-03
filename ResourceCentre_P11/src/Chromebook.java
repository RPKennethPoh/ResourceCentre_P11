
public class Chromebook extends Item{
	private String operatingSystem;

	public Chromebook(String assetTag, String description, String operatingSystem) {
		super(assetTag, description);
		this.operatingSystem = operatingSystem;
	}

	public String getOs() {
		return operatingSystem;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}


