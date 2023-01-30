import java.util.Scanner;

public class Arranger_Keyboard extends Keyboard {
	private int numberOfSound;
	
	public Arranger_Keyboard() {
	}
	
	public Arranger_Keyboard(float price, String brand, String model, State status, int numberKey,
			int numberOfSound) {
		super(price, brand, model, status, numberKey);
		this.numberOfSound = numberOfSound;
	}

	public int getNumberOfSound() {
		return numberOfSound;
	}

	public void setNumberOfSound(int numberOfSound) {
		this.numberOfSound = numberOfSound;
	}
	
	public String toString() {
		return "=> Arangeur KeyBoard | Id : " + this.getId() + " | Price : " + this.getPrice() + " | Brand : " + this.getBrand()
			+ " | Model : " + this.getModel() + " | Status : " + this.getStatus() + " | Number Key : "
			+ this.getNumberKey() + " | Sound Number : " + this.getNumberOfSound();	
	}
	
	public void initialize() {
		System.out.print("<===== New Instrument : Arranger KeyBoard =====>\n");		
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("=> Number of Sound : ");
		this.numberOfSound = scanner.nextInt();
		
		System.out.println("\n	/!\\ Instrument created /!\\");
		System.out.println("	==" + this.toString());
	}

}
