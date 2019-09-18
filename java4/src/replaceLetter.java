
public class replaceLetter {
	
	public String replaceWoord;
	public String letter,hetWoord,text;
	public void replace_woord(){
		
		Woord woord = new Woord();
		
		replaceWoord = (woord.woord);//krijgt het woord van de classe Woord.
		
		replaceWoord = replaceWoord.replaceAll("[a-z]","-");//replaced alle letters van het woord naar streepjes

	}
	
	public void gelijk(String[] ingevult, int tell){
		
		Woord woord = new Woord();
		hetWoord = (woord.woord);
		letter = ingevult[tell].substring(0,1);
		
		System.out.println("tell: "+tell);
		System.out.println("ingevulde letter: "+letter);
		System.out.println(hetWoord);
		
		int loc = (hetWoord.indexOf(letter));
		System.out.println("locatie van de letter: "+loc);
		
		if(loc >= 0) {
			System.out.println("zit er in.");
			 //String test;
			 //test=replaceWoord.replace(replaceWoord.charAt(loc),'x');
			 //System.out.println(test);
			//moet het streepje met de locatie van de letter de letter worden.
		}
		else {
			System.out.println("fout");
			//moet er een leven van af.
		}
	}
	
	/*wat er nog mmoet gebeuren:
	 * settext van de JLabel
	 * replacewoord text aanpasen
	 * het raden van het woord 
	 * de levens 
	 * de soort van foto's van de galg
	 * ales zo als de eindopdracht moet maken
	*/

}
