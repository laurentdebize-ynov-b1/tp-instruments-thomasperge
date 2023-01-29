import java.util.ArrayList;

public class Electric_Drum extends Drums {
	
	public Electric_Drum() {
	}
	
	public Electric_Drum(float price, String brand, String model, State status, boolean assembly, boolean connected,
			ArrayList<Percussion_Electronic> electricDrums) {
		super(price, brand, model, status, assembly, connected, electricDrums);
	}	
	
	public String toString() {
		return "=> Electric Drums | Id : " + this.getId() + " | Price : " + this.getPrice() + " | Brand : " + this.getBrand()
			+ " | Model : " + this.getModel() + " | Status : " + this.getStatus() + " | Assembly : "
			+ this.isAssembly() + " | Connected : " + this.isConneceted() + " | Percussion : [" + this.getElectricDrums() + "]\n";
	}
	
	public void initialize() {
		System.out.print("<===== New Instrument : Electric Drum =====>\n");
		super.initialize();
		System.out.println("\n/!\\ Instrument created /!\\");
		System.out.println("====" + this.toString());
	}
}
