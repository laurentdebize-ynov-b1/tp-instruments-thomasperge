import java.util.Scanner;

public class Electric_Guitar extends String_Instrument {
	private Microphone_Guitar microphone;
	private Guitar_Tunning tunning;
	
	public Electric_Guitar() {
	}
	
	public Electric_Guitar(float price, String brand, String model, State status, int stringNumber,
			Microphone_Guitar microphone, Guitar_Tunning tunning) {
		super(price, brand, model, status, stringNumber);
		this.microphone = microphone;
		this.tunning = tunning;
	}

	public Microphone_Guitar getMicrophone() {
		return microphone;
	}
	
	public void setMicrophone(Microphone_Guitar microphone) {
		this.microphone = microphone;
	}
	
	public Guitar_Tunning getTunning() {
		return tunning;
	}
	
	public void setTunning(Guitar_Tunning tunning) {
		this.tunning = tunning;
	}
	
	public String toString() {
		return "=> Electric Guitar | Id : " + this.getId() + " | Price : " + this.getPrice() + " | Brand : " + this.getBrand()
			+ " | Model : " + this.getModel() + " | Status : " + this.getStatus()  + " | Microphone : " + this.getMicrophone() + " | Tunning : " + this.getTunning();
	}
	
	public void initialize() {
		System.out.print("<===== New Instrument : Electric Guitar =====>\n");		
		super.initialize();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("=> Microphone ");
		System.out.print("=> 1: FISHMAN | 2: GIBSON | 3: SEYMOUR | 4: FENDER | 5: LINDY : ");
		
		int choise = scanner.nextInt();
		scanner.nextLine();
		switch (choise) {
		case 1:
			this.setMicrophone(Microphone_Guitar.FISHMAN);
			break;
		case 2:
			this.setMicrophone(Microphone_Guitar.GIBSON);
			break;
		case 3:
			this.setMicrophone(Microphone_Guitar.SEYMOUR);
			break;
		case 4:
			this.setMicrophone(Microphone_Guitar.FENDER);
			break;
		case 5:
			this.setMicrophone(Microphone_Guitar.LINDY);
			break;
		}
		
		System.out.print("=> Tunning ");
		System.out.print("=> 1: STANDARD | 2: DROP_D | 3: DROP_C | 4: DROP_B | 5: OPEN | 6: RE | 7: SOL | 8: DO : ");
		
		int choise2 = scanner.nextInt();
		scanner.nextLine();
		switch (choise2) {
		case 1:
			this.setTunning(Guitar_Tunning.STANDARD);
			break;
		case 2:
			this.setTunning(Guitar_Tunning.DROP_D);
			break;
		case 3:
			this.setTunning(Guitar_Tunning.DROP_C);
			break;
		case 4:
			this.setTunning(Guitar_Tunning.DROP_D);
			break;
		case 5:
			this.setTunning(Guitar_Tunning.OPEN);
			break;
		case 6:
			this.setTunning(Guitar_Tunning.RE);
			break;
		case 7:
			this.setTunning(Guitar_Tunning.SOL);
			break;
		case 8:
			this.setTunning(Guitar_Tunning.DO);
			break;
		}
		
		System.out.println("\n/!\\ Instrument created /!\\");
		System.out.println("====" + this.toString());
	}

}
