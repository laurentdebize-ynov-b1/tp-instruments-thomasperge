import java.util.Scanner;

public class Bass_Drum_Pad extends Percussion_Electronic {
	
	public Bass_Drum_Pad() {
	}
	
	public Bass_Drum_Pad(float diameter, Percussion_Material material, String sound) {
		super(diameter, material, sound);
	}
	
	public String toString() {
		return "[Bass Drum Pad (Diameter: " + this.getDiameter() + " | Material: " + this.getMaterial() + " | Sound: " + this.getSound() + ")]";
	}
	
	public void initialize() {
		System.out.print("<===== New Percussion : Bass Drum Pad =====>\n");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("=> Diameter : ");
		super.setDiameter(scanner.nextInt());
		
		System.out.print("=> Material : ");
		System.out.print("=> 1: WOOD | 2: IRON | 3: SILVER | 4: GOLD : ");
		
		int choise = scanner.nextInt();
		scanner.nextLine();
		switch (choise) {
		case 1:
			this.setMaterial(Percussion_Material.WOOD);
			break;
		case 2:
			this.setMaterial(Percussion_Material.IRON);
			break;
		case 3:
			this.setMaterial(Percussion_Material.SILVER);
			break;
		case 4:
			this.setMaterial(Percussion_Material.GOLD);
			break;
		}
		
		super.setSound("bimmg...");
		
		System.out.println("\n	/!\\ Percussion created /!\\");
		System.out.println("	==" + this.toString());
	}
}
