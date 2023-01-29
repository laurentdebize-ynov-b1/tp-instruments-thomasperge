import java.util.Scanner;

public abstract class Keyboard extends Instrument {
	private int numberKey;

	public Keyboard() {
	}
	
	public Keyboard(float price, String brand, String model, State status, int numberKey) {
		super(price, brand, model, status);
		this.numberKey = numberKey;
	}

	public int getNumberKey() {
		return numberKey;
	}

	public void setNumberKey(int numberKey) {
		this.numberKey = numberKey;
	}
	
	public void initialize() {
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("=> Key Number :");
		this.setNumberKey(scanner.nextInt());
		scanner.nextLine();
	}
}
