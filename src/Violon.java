import java.util.Scanner;

public class Violon extends String_Instrument {
	private Wood_Body woodBow;

	public Violon() {
	}
	
	public Violon(float price, String brand, String model, State status, int stringNumber,
			Wood_Body woodBow) {
		super(price, brand, model, status, stringNumber, woodBow);
		this.woodBow = woodBow;
	}

	public Wood_Body getWoodBow() {
		return woodBow;
	}

	public void setWoodBow(Wood_Body woodBow) {
		this.woodBow = woodBow;
	}
	
	public String toString() {
		return "=> Piano | Price : " + this.getPrice() + " | Brand : " + this.getBrand()
			+ " | Model : " + this.getModel() + " | Status : " + this.getStatus() + " | String Number : "
			+ this.getStringNumber() + " | Wood Bow : " + this.getWoodBow();
	}
	
	public void initialize() {
		System.out.print("<===== New Instrument : Piano =====>\n");		
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("=> Wood Bow : ");
		System.out.print("=> 1: ASH | 2: BEECH | 3: BIRCH | 4: MAPLE | 5: TEAK : ");
		
		int choise = scanner.nextInt();
		scanner.nextLine();
		switch (choise) {
		case 1:
			this.setWoodBow(Wood_Body.ASH);
			break;
		case 2:
			this.setWoodBow(Wood_Body.BEECH);
			break;
		case 3:
			this.setWoodBow(Wood_Body.BIRCH);
			break;
		case 4:
			this.setWoodBow(Wood_Body.MAPLE);
			break;
		case 5:
			this.setWoodBow(Wood_Body.TEAK);
			break;
		}
		
		System.out.print("<=== /!\\ Instrument created /!\\ ===>\n");
		System.out.print(this.toString());
	}
}
