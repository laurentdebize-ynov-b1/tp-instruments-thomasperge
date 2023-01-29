
public class Cymbale_Pad extends Percussion_Electronic {
	public Cymbale_Pad(float diameter, Percussion_Material material, String sound) {
		super(diameter, material, sound);
	}
	
	public String toString() {
		return "[Cymbale Pad | Diameter : " + this.getDiameter() + " | Material : " + this.getMaterial() + " | Sound : " + this.getSound() + "]";
	}
}
