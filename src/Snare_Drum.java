import java.util.Scanner;

public class Snare_Drum extends Percussion_Acoustic {
	
	public Snare_Drum() {
	}
	
	public Snare_Drum(float diameter, Percussion_Material material, String sound) {
		super(diameter, material, sound);
	}
	
	public String toString() {
		return "[Snare Drum (Diameter: " + this.getDiameter() + " | Material: " + this.getMaterial() + " | Sound: " + this.getSound() + ")]";
	}
	
	public void initialize() {
		System.out.print("<===== New Percussion : Snare Drum =====>\n");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("=> Diameter : ");
		super.setDiameter(scanner.nextInt());
		
		System.out.print("=> Material : ");
		System.out.print("=> 1: WOOD | 2: LEATHER | 3: IRON | 4: SILVER | 5: GOLD : ");
		
		int choise = scanner.nextInt();
		scanner.nextLine();
		switch (choise) {
		case 1:
			this.setMaterial(Percussion_Material.WOOD);
			break;
		case 2:
			this.setMaterial(Percussion_Material.LEATHER);
			break;
		case 3:
			this.setMaterial(Percussion_Material.IRON);
			break;
		case 4:
			this.setMaterial(Percussion_Material.SILVER);
			break;
		case 5:
			this.setMaterial(Percussion_Material.GOLD);
			break;
		}
		
		super.setSound("tinnnng...");
		
		System.out.println("\n	/!\\ Percussion created /!\\");
		System.out.println("	==" + this.toString());
	}
}
