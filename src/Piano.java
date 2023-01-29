import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Piano extends Keyboard implements Accord_Instrument {
	private Wood_Body woodHammer;
	private int numberHammer;
	private int tunningPrice;
	private String lastDateOfTunning;

	public Piano() {
	}
	
	public Piano(float price, String brand, String model, State status, int numberKey, Wood_Body woodHammer,
			int numberHammer, int tunningPrice) {
		super(price, brand, model, status, numberKey);
		this.woodHammer = woodHammer;
		this.numberHammer = numberHammer;
		this.tunningPrice = tunningPrice;
		this.tunningAnInstrument();
	}


	public Wood_Body getWoodHammer() {
		return woodHammer;
	}
	
	public void setWoodHammer(Wood_Body woodHammer) {
		this.woodHammer = woodHammer;
	}
	
	public int getNumberHammer() {
		return numberHammer;
	}
	
	public void setNumberHammer(int numberHammer) {
		this.numberHammer = numberHammer;
		tunningAnInstrument();
	}
	
	public int getTunningPrice() {
		return tunningPrice;
	}

	public void setTunningPrice(int tunningPrice) {
		this.tunningPrice = tunningPrice;
	}


	public String getLastDateOfTunning() {
		return lastDateOfTunning;
	}
	
	public String toString() {
		return "=> Piano | Price : " + this.getPrice() + " | Brand : " + this.getBrand()
			+ " | Model : " + this.getModel() + " | Status : " + this.getStatus() + " | Key Number : "
			+ this.getNumberKey() + " | Wood Hammer : " + this.getWoodHammer() + " | Number Hammer : " + this.getNumberHammer() + " | Tunning Price : " + this.getTunningPrice();
	}
	
	public void initialize() {
		System.out.print("<===== New Instrument : Piano =====>\n");		
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("=> Wood Hammer : ");
		System.out.print("=> 1: ASH | 2: BEECH | 3: BIRCH | 4: MAPLE | 5: TEAK : ");
		
		int choise = scanner.nextInt();
		scanner.nextLine();
		switch (choise) {
		case 1:
			this.setWoodHammer(Wood_Body.ASH);
			break;
		case 2:
			this.setWoodHammer(Wood_Body.BEECH);
			break;
		case 3:
			this.setWoodHammer(Wood_Body.BIRCH);
			break;
		case 4:
			this.setWoodHammer(Wood_Body.MAPLE);
			break;
		case 5:
			this.setWoodHammer(Wood_Body.TEAK);
			break;
		}
		
		System.out.print("=> Hammer Number : ");
		this.numberHammer = scanner.nextInt();
		
		System.out.print("=> Tunning Price : ");
		this.tunningPrice = scanner.nextInt();
		
		this.tunningAnInstrument();
		
		System.out.print("<=== /!\\ Instrument created /!\\ ===>\n");
		System.out.print(this.toString());
	}

	@Override
	public void tunningAnInstrument() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    String newDateOfTunning = dateFormat.format(LocalDateTime.now());
		this.lastDateOfTunning = newDateOfTunning;
	}
}
