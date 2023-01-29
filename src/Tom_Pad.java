
public class Tom_Pad extends Percussion_Electronic {
	public Tom_Pad(float diameter, Percussion_Material material, String sound) {
		super(diameter, material, sound);
	}
	
	public String toString() {
		return "[Tom Pad | Diameter : " + this.getDiameter() + " | Material : " + this.getMaterial() + " | Sound : " + this.getSound() + "]";
	}
}
