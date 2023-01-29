import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class String_Instrument extends Instrument implements Accord_Instrument {
	
	private int stringNumber;
	private Wood_Body woodenBody;
	private String lastDateOfTunning;
	
	public String_Instrument() {
	}
	
	public String_Instrument(float price, String brand, String model, State status, int stringNumber,
			Wood_Body woodenBody) {
		super(price, brand, model, status);
		this.stringNumber = stringNumber;
		this.woodenBody = woodenBody;
		this.tunningAnInstrument();
	}
	
	public String_Instrument(float price, String brand, String model, State status, int stringNumber) {
		super(price, brand, model, status);
		this.stringNumber = stringNumber;
		this.tunningAnInstrument();
	}
	
	public int getStringNumber() {
		return stringNumber;
	}
	
	public void setStringNumber(int stringNumber) {
		this.stringNumber = stringNumber;
		this.tunningAnInstrument();
	}
	
	public Wood_Body getWoodenBody() {
		return woodenBody;
	}
	
	public void setWoodenBody(Wood_Body woodenBody) {
		this.woodenBody = woodenBody;
	}
	
	public String getLastDateOfTunning() {
		return lastDateOfTunning;
	}

	@Override
	public void tunningAnInstrument() {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    String newDateOfTunning = dateFormat.format(LocalDateTime.now());
		this.lastDateOfTunning = newDateOfTunning;
	}
	
}
