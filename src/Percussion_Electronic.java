
public abstract class Percussion_Electronic extends Percussion {
	private String sound;

	public Percussion_Electronic(float diameter, Percussion_Material material, String sound) {
		super(diameter, material);
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
}
