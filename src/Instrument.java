import java.util.Scanner;

public class Instrument {
	private float price;
	private String brand;
	private String model;
	private State status;
	private String instrumentName;
	private int id;
	
	public Instrument() {
	}
	
	public Instrument(float price, String brand, String model, State status) {
		super();
		this.price = price;
		this.brand = brand;
		this.model = model;
		this.status = status;
	}

	public Instrument(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public State getStatus() {
		return status;
	}

	public void setStatus(State status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	
	public void modify() {
		Scanner scanner = new Scanner(System.in);
		
		int editChoise;
		do {
			System.out.println("=> 1 : Edit Id");
			System.out.println("=> 2 : Edit Price");
			System.out.println("=> 3 : Edit Brand");
			System.out.println("=> 4 : Edit Model");
			System.out.println("=> 5 : Edit Status");
			System.out.println("=> 6 : Leave ");
			System.out.println("=> : ");
			
			editChoise = scanner.nextInt();
			
			switch (editChoise) {
				case 1:
					// ======== Edit Id ========
					System.out.println("<==== Edit ID ====>");
					System.out.println("=> : ");
					this.setId(scanner.nextInt());
					break;
				case 2:
					// ======== Edit Price ========
					System.out.println("<==== Edit Price ====>");
					System.out.println("=> : ");
					this.setPrice(scanner.nextInt());
					scanner.nextLine();
					break;
				case 3:
					// ======== Edit Brand ========
					System.out.println("<==== Edit Brand ====>");
					System.out.println("=> : ");
					this.setBrand(scanner.nextLine());
					break;
				case 4:
					// ======== Edit Model ========
					System.out.println("<==== Edit Model ====>");
					System.out.println("=> : ");
					this.setModel(scanner.nextLine());
					break;
				case 5:
					// ======== Edit Status ========
					System.out.print("<==== Edit Status ====>");
					System.out.print("=> 1 : STOCK | 2: EXPOSITION");
					System.out.println("=> : ");
					int editStatus = scanner.nextInt();
					
					switch (editStatus) {
						case 1:
							// ======== Status: Stock ========
							this.setStatus(State.STOCK);
							break;
						case 2:
							// ======== Status: Exposition ========
							this.setStatus(State.EXPOSITION);
							break;
					}
					break;
			}
		} while (editChoise != 6);
	}

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==> Id : ");
		this.setId(scanner.nextInt());
		scanner.nextLine();
		
		System.out.print("=> Price : ");
		this.price = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("=> Brand : ");
		this.brand = scanner.nextLine();
		
		System.out.print("=> Model : ");
		this.model= scanner.nextLine();
		
		System.out.print("=> Status :\n");
		System.out.println("1: STOCK | 2: EXPOSITION");
		int choice = scanner.nextInt();
		scanner.nextLine();

		switch (choice) {
		case 1:
			this.setStatus(State.STOCK);
			break;
		case 2:
			this.setStatus(State.EXPOSITION);
			break;
		}
	}
}
