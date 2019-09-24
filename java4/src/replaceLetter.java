
public class replaceLetter {
	
	public String replaceWoord;
	public String letter,hetWoord,tekening;
	public String[] streep;

	public int kansen = 5;
	public boolean start = true;
	
	public void replace_woord(){
		
		Woord woord = new Woord();
		
		if(start) {
			replaceWoord = (woord.woord);//krijgt het woord van de classe Woord.
			replaceWoord = replaceWoord.replaceAll("[a-z]","-");//replaced alle letters van het woord naar streepjes
			start = false;
		}
	}
	
	public void gelijk(String[] ingevult, int tell){
		
		replace_woord();
		
		Levens levens = new Levens();//levens class.
		Woord woord = new Woord();//Woord class.
		
		hetWoord = (woord.woord);//het random woord.
		letter = ingevult[tell].substring(0,1);
		int loc = (hetWoord.indexOf(letter));
		
		if(kansen>0) {
			System.out.println(hetWoord);//moet nog weg
			if(loc >= 0) {
				 System.out.println("zit er in.");
				 replaceWoord = replaceWoord.substring(0, loc) 
					 + letter 
		             + replaceWoord.substring(loc + 1); 
			}
			else {
				kansen --;
				levens.printLevens(kansen);
				tekening = levens.tekening;
			}
		}
		else {
			System.out.println("dood");
		}
	}
	
	/*wat er nog moet gebeuren:
	 * fixen van het uitprinten van de galg
	 * het raden van het woord 
	 * ingevulde letters toevoegen aan de JList of een J
	 * ales zo als de eindopdracht moet maken
	*/

}
