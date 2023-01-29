import java.util.ArrayList;
import java.util.Scanner;

public abstract class Drums extends Instrument {
	private boolean assembly;
	private String decoration;
	private boolean connected;
	private ArrayList<Percussion_Acoustic> acousticDrums;
	private ArrayList<Percussion_Electronic> electricDrums;
	
	public Drums() {
	}
	
	public Drums(float price, String brand, String model, State status, boolean assembly, String decoration,
			ArrayList<Percussion_Acoustic> acousticDrums) {
		super(price, brand, model, status);
		this.assembly = assembly;
		this.decoration = decoration;
		this.acousticDrums = acousticDrums;
	}

	public Drums(float price, String brand, String model, State status, boolean assembly, boolean connected,
			ArrayList<Percussion_Electronic> electricDrums) {
		super(price, brand, model, status);
		this.assembly = assembly;
		this.connected = connected;
		this.electricDrums = electricDrums;
	}

	public boolean isAssembly() {
		return assembly;
	}

	public void setAssembly(boolean assembly) {
		this.assembly = assembly;
	}

	public ArrayList<Percussion_Acoustic> getAcousticDrums() {
		return acousticDrums;
	}

	public void setAcousticDrums(ArrayList<Percussion_Acoustic> acousticDrums) {
		this.acousticDrums = acousticDrums;
	}

	public ArrayList<Percussion_Electronic> getElectricDrums() {
		return electricDrums;
	}

	public void setElectricDrums(ArrayList<Percussion_Electronic> electricDrums) {
		this.electricDrums = electricDrums;
	}

	public String getDecoration() {
		return decoration;
	}

	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}

	public boolean isConneceted() {
		return connected;
	}

	public void setConneceted(boolean connected) {
		this.connected = connected;
	}

	public String lauchDemo() {
		return "Soon";
	}
	
	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=> Assembly? :");
		System.out.println("=> 1: Yes | 2: No");
		int choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice) {
		case 1:
			this.setAssembly(true);
			break;
		case 2:
			this.setAssembly(false);
			break;
		}
		
		System.out.print("=> Decoration :");
		this.decoration = scanner.nextLine();
	}
}
