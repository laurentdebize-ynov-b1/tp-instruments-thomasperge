
public class Bass_Drum extends Percussion_Acoustic {
	public Bass_Drum(float diameter, Percussion_Material material, String sound) {
		super(diameter, material, sound);
	}
	
	public String toString() {
		return "[Bass Drum | Diameter : " + this.getDiameter() + " | Material : " + this.getMaterial() + " | Sound : " + this.getSound() + "]";
	}
}
