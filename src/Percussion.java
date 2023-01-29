
public abstract class Percussion {
	private float diameter;
	private Percussion_Material material;
	
	public Percussion() {
	}
	
	public Percussion(float diameter, Percussion_Material material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public Percussion_Material getMaterial() {
		return material;
	}

	public void setMaterial(Percussion_Material material) {
		this.material = material;
	}
}
