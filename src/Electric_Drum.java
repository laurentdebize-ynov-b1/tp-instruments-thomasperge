import java.util.ArrayList;

public class Electric_Drum extends Drums {
	public Electric_Drum(float price, String brand, String model, State status, boolean assembly, boolean connected,
			ArrayList<Percussion_Electronic> electricDrums) {
		super(price, brand, model, status, assembly, connected, electricDrums);
	}	
	
	public String toString() {
		String newLine = System.getProperty("line.separator");
		
		return "=> Electric Drums | Price : " + this.getPrice() + " | Brand : " + this.getBrand()
			+ " | Model : " + this.getModel() + " | Status : " + this.getStatus() + " | Assembly : "
			+ this.isAssembly() + " | Connected : " + this.isConneceted() + newLine + "==> Electric Drums > Percussion : " + this.getElectricDrums();
	}
}
