import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Charleston test = new Charleston();
		test.initialize();
	      
	    // ====== Create Acoustic Drum: ======
	    Charleston charleston = new Charleston(4, Percussion_Material.GOLD, "pssst...");
		Bass_Drum bassDrum = new Bass_Drum(5, Percussion_Material.IRON, "mm...");
		
		ArrayList<Percussion_Acoustic> acousticDrums = new ArrayList<Percussion_Acoustic>();
	    acousticDrums.add(test);
	    //acousticDrums.add(bassDrum);
	    
	    Acoustic_Drum batterieAcoustic = new Acoustic_Drum(4, "Ford", "XO8-0LM60", State.EXPOSITION, true, "BRAH", acousticDrums);
	    
	    System.out.println(batterieAcoustic.toString());
	    
	    
	    // ====== Create Electric Drum : ======
	    Bass_Drum_Pad bassDrumPad = new Bass_Drum_Pad(4, Percussion_Material.GOLD, "pinggg...");
	    
		ArrayList<Percussion_Electronic> electricDrums = new ArrayList<Percussion_Electronic>();
		electricDrums.add(bassDrumPad);
		    
		Electric_Drum batterieElectric = new Electric_Drum(4, "Tesla", "S", State.STOCK, true, true, electricDrums);
		
		//System.out.println(batterieElectric.getStatus());
		
		
		// ====== Create Piano : ======
		Piano mozartPiano = new Piano((float) 4.0, "Maserati", "FR48-9M", State.STOCK, 126, Wood_Body.ASH, 54, 2580);
		//System.out.println(mozartPiano.getLastDateOfTunning());
		
		
		// ====== Create Arrangeur Keyboard : ======
		Arranger_Keyboard arrangeurKey = new Arranger_Keyboard((float) 4.0, "Maserati", "FR48-9M", State.EXPOSITION, 126, 45);
		//System.out.println(arrangeurKey.toString());
		
		
		// ====== Create Electric Guitar : ======
		Electric_Guitar electricGuitar = new Electric_Guitar((float) 4.0, "Maserati", "FR48-9M", State.EXPOSITION, 5, Microphone_Guitar.FENDER, Guitar_Tunning.RE);
		//System.out.println(electricGuitar.getLastDateOfTunning());
		
		
		// ====== Create Violon : ======
		Violon violon = new Violon((float) 4.0, "Maserati", "FR48-9M", State.EXPOSITION, 5, Wood_Body.BEECH);
		//System.out.println(violon.getWoodBow());
		
		
	}
}
