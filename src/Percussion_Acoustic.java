
public abstract class Percussion_Acoustic extends Percussion {
	private String sound;

	public Percussion_Acoustic() {
	}
	
	public Percussion_Acoustic(float diameter, Percussion_Material material, String sound) {
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
