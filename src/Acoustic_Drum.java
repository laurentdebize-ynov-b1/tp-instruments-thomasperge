import java.util.ArrayList;
import java.util.Scanner;

public class Acoustic_Drum extends Drums {
	
	public Acoustic_Drum() {
	}
	
	public Acoustic_Drum(float price, String brand, String model, State status, boolean assembly, String decoration,
			ArrayList<Percussion_Acoustic> acousticDrums) {
		super(price, brand, model, status, assembly, decoration, acousticDrums);
	}
	
	public String toString() {
		String newLine = System.getProperty("line.separator");
		
		return "=> Acoustic Drums | Price : " + this.getPrice() + " | Brand : " + this.getBrand()
			+ " | Model : " + this.getModel() + " | Status : " + this.getStatus() + " | Assembly : "
			+ this.isAssembly() + " | Decoration : " + this.getDecoration() + newLine + "==> Acoustic Drums > Percussion : " + this.getAcousticDrums();
	}
	
	public void initialize() {
		System.out.print("<===== New Instrument : Acoustic Drum =====>\n");
		super.initialize();
		System.out.print("<=== /!\\ Instrument created /!\\ ===>\n");
		System.out.print(this.toString());
	}
}
