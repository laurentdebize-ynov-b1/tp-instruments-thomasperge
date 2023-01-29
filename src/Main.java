import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Instrument> allInstrument = new ArrayList<Instrument>();
		
		int choice;
		do {
			System.out.println("\n<========== Menu Music Shop ==========>");
			System.out.println("=> 1 : Display all Instrument");
			System.out.println("=> 2 : Buy an Instrument");
			System.out.println("=> 3 : Sell an Instrument");
			System.out.println("=> 4 : Edit an Instrument");
			System.out.println("=> 5 : Leave");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("<====== All Instrument ======>");
				for (Instrument allInstru : allInstrument) {
					System.out.println("==> [" + allInstru.toString() + "]");
				}
				break;
			case 2:
				// ============ Buy Instrument ============
				System.out.println("\n<=== Buy an Instrument - Music Shop ===>");
				System.out.println("=> 1 : Buy KeyBoard");
				System.out.println("=> 2 : Buy String Instrument");
				System.out.println("=> 3 : Buy Drums");
				int choiceInstrument = scanner.nextInt();
				
				switch (choiceInstrument) {
				case 1 :
					// ======== Buy KeyBoard ========
					System.out.println("\n<=== Buy KeyBoard ===>");
					System.out.println("=> 1 : Buy Piano");
					System.out.println("=> 2 : Buy Arranger KeyBoard");
					int choiceKeyBoard = scanner.nextInt();
					
					switch (choiceKeyBoard) {
						case 1 :
							// ==== Buy Piano ====
							Piano piano = new Piano();
							piano.initialize();
							allInstrument.add(piano);
							break;
						case 2 :
							// ==== Buy Piano ====
							Arranger_Keyboard arrangerKeyBoard = new Arranger_Keyboard();
							arrangerKeyBoard.initialize();
							allInstrument.add(arrangerKeyBoard);
							break;
					}
					break;
				case 2 :
					// ======== Buy String Instrument ========
					System.out.println("\n<=== Buy String Instrument ===>");
					System.out.println("=> 1 : Buy Electric Guitar");
					System.out.println("=> 2 : Buy Violon");
					
					int choiceString = scanner.nextInt();
					
					switch (choiceString) {
						case 1 :
							// ==== Buy Electric Guitar ====
							Electric_Guitar electricGuitar = new Electric_Guitar();
							electricGuitar.initialize();
							allInstrument.add(electricGuitar);
							break;
						case 2 :
							// ==== Buy Violin ====
							Violon violon = new Violon();
							violon.initialize();
							allInstrument.add(violon);
							break;
					}
					break;
				case 3 :
					// ======== Buy Drums ========
					System.out.println("\n<=== Buy Drums ===>");
					System.out.println("=> 1 : Buy Acoustic Drums");
					System.out.println("=> 2 : Buy Electric Drums");
					
					int choiceDrums = scanner.nextInt();
					
					switch (choiceDrums) {
						case 1 :
							// ==== Buy Acoustic Drums ====
							Acoustic_Drum acousticDrum = new Acoustic_Drum();
							acousticDrum.initialize();
							allInstrument.add(acousticDrum);
							break;
						case 2 :
							// ==== Buy Electric Drums ====
							Electric_Drum electricDrum = new Electric_Drum();
							electricDrum.initialize();
							allInstrument.add(electricDrum);
							break;
					}
					break;
				}
				
				break;
			
			}
		 } while (choice != 6);		
	}
	
	public static Instrument findComputer(ArrayList<Instrument> allInstrument) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which ID ?");
		int id = scanner.nextInt();

		int i = 0;
		Instrument instrument = null;
		boolean found = false; // flag
		while (i < allInstrument.size() && !found) {
			if (id == allInstrument.get(i).getId()) {
				instrument = allInstrument.get(i) ;
				found = true;
			}
			i++;
		}
		return instrument;
	}
}
