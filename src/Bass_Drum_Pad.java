
public class Bass_Drum_Pad extends Percussion_Electronic {
	public Bass_Drum_Pad(float diameter, Percussion_Material material, String sound) {
		super(diameter, material, sound);
	}
	
	public String toString() {
		return "[Bass Drum Pad | Diameter : " + this.getDiameter() + " | Material : " + this.getMaterial() + " | Sound : " + this.getSound() + "]";
	}
}
