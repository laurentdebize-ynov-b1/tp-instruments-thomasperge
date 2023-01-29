import java.util.Scanner;

public class Instrument {
	private float price;
	private String brand;
	private String model;
	private State status;
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
		System.out.println("1: Stock ");
		System.out.println("2: Exposition ");
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
