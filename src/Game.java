import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	public Game() {
	}

	public void mainGame() {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Instrument> allInstrument = new ArrayList<Instrument>();
		
		int choice;
		do {
			System.out.println("\n<========== Menu Music Shop ==========>");
			System.out.println("=> 1 : Display all Instrument");
			System.out.println("=> 2 : Buy an Instrument");
			System.out.println("=> 3 : Edit an Instrument");
			System.out.println("=> 4 : Leave");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				// ============ Display All Instrument ============
				System.out.println("<====== All Instrument ======>");
				if (allInstrument.size() == 0) {
					System.out.println("==> No Instrument in STOCK or in EXPOSITION");
					break;
				}
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
							piano.setInstrumentName("Piano");
							allInstrument.add(piano);
							break;
						case 2 :
							// ==== Buy Arranger KeyBoard ====
							Arranger_Keyboard arrangerKeyBoard = new Arranger_Keyboard();
							arrangerKeyBoard.initialize();
							arrangerKeyBoard.setInstrumentName("Arranger KeyBoard");
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
							electricGuitar.setInstrumentName("Electric Guitar");
							allInstrument.add(electricGuitar);
							break;
						case 2 :
							// ==== Buy Violin ====
							Violon violon = new Violon();
							violon.initialize();
							violon.setInstrumentName("Violon");
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
							acousticDrum.setInstrumentName("Acoustic Drums");
							
							ArrayList<Percussion_Acoustic> acousticPercussion = new ArrayList<Percussion_Acoustic>();
							
							// ===== Choose Percussion =====
							int choisePercussion;
							do {
								System.out.println("===> Choose Percussion :");
								System.out.println("===> 1: Charleston | 2: Bass Drum | 3: Snare Drum | 4: Tom | 5: Cymbale | 6: Finish ");
								
								choisePercussion = scanner.nextInt();
								
								switch (choisePercussion) {
									case 1 :
										// Charlston :
										Charleston charleston = new Charleston();
										charleston.initialize();
										acousticPercussion.add(charleston);
										break;
										
									case 2 :
										// Bass Drum :
										Bass_Drum bassdrum = new Bass_Drum();
										bassdrum.initialize();
										acousticPercussion.add(bassdrum);
										break;
										
									case 3 :
										// Snare Drum :
										Snare_Drum snareDrum = new Snare_Drum();
										snareDrum.initialize();
										acousticPercussion.add(snareDrum);
										break;
									case 4 :
										// Tom :
										Tom tom = new Tom();
										tom.initialize();
										acousticPercussion.add(tom);
										break;
									case 5 :
										// Cymbale :
										Cymbale cymbale = new Cymbale();
										cymbale.initialize();
										acousticPercussion.add(cymbale);
										break;
								}
							} while (choisePercussion != 6);
							
							
							acousticDrum.setAcousticDrums(acousticPercussion);
							allInstrument.add(acousticDrum);
							
							break;
						case 2 :
							// ==== Buy Electric Drums ====
							Electric_Drum electricDrum = new Electric_Drum();
							electricDrum.initialize();
							electricDrum.setInstrumentName("Electric Drums");
							
							ArrayList<Percussion_Electronic> electricPercussion = new ArrayList<Percussion_Electronic>();
							
							// ===== Choose Percussion =====
							int choisePercussionE;
							do {
								System.out.println("===> Choose Percussion :");
								System.out.println("===> 1: Bass Drum Pad | 2: Tom Pad | 3: Cymbale Pad | 4: Finish ");
								
								choisePercussionE = scanner.nextInt();
								
								switch (choisePercussionE) {
									case 1 :
										// Bass Drum Pad :
										Bass_Drum_Pad bassdrumpad = new Bass_Drum_Pad();
										bassdrumpad.initialize();
										electricPercussion.add(bassdrumpad);
										break;
										
									case 2 :
										// Tom Pad :
										Tom_Pad tompad = new Tom_Pad();
										tompad.initialize();
										electricPercussion.add(tompad);
										break;
										
									case 3 :
										// Cymbale Pad :
										Cymbale_Pad cymbalepad = new Cymbale_Pad();
										cymbalepad.initialize();
										electricPercussion.add(cymbalepad);
										break;
								}
							} while (choisePercussionE != 4);
							
							
							electricDrum.setElectricDrums(electricPercussion);
							
							allInstrument.add(electricDrum);
							break;
					}
					break;
				}
			break;
			case 3 :
				// ============ Edit Instrument ============
				System.out.println("<====== Edit Instrument ======>");
				System.out.println("==> All Instrument : <==");
				
				for (Instrument allInstru : allInstrument) {
					System.out.println("   => " + allInstru.getInstrumentName() + " (Id :" + allInstru.getId() + " | Brand : " + allInstru.getBrand() + " | Model : " + allInstru.getModel() + ")");
				}
				
				if (allInstrument.size() == 0) {
					System.out.println("=> No Instrument in STOCK or in EXPOSITION...");
					break;
				}
				
				Instrument instrumentEdit = this.findInstrument(allInstrument);
				
				if (instrumentEdit != null) {
					instrumentEdit.modify();
				}
				
				break;
			
			}
		 } while (choice != 4);
	}
	
	public static Instrument findInstrument(ArrayList<Instrument> allInstrument) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n===> Instrument to Edit | ID : ");
		int id = scanner.nextInt();

		int i = 0;
		Instrument instrument = null;
		boolean found = false;
		while (i < allInstrument.size() && !found) {
			if (id == allInstrument.get(i).getId()) {
				instrument = allInstrument.get(i);
				found = true;
			}
			i++;
		}
		if (found == false) {
			System.out.println("=> No ID : " + id + " found...");
			return null;
		} else {
			return instrument;
		}
	}
}
