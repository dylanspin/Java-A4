
public class replaceLetter {
	
	public String replaceWoord;
	public String letter,hetWoord,tekening;
	public String[] streep;

	public int kansen = 5;
	public int loc;
	public boolean start = true;
	
	public void replace_woord(){
		
		Woord woord = new Woord();
		
		if(start) {
			replaceWoord = (woord.woord);//krijgt het woord van de classe Woord.
			replaceWoord = replaceWoord.replaceAll("[a-z]","-");//replaced alle letters van het woord naar streepjes
			start = false;
		}
	}
	
	public void gelijk(String[] ingevult, int tell,String raad){
		
		replace_woord();
		
		Levens levens = new Levens();//levens class.
		Woord woord = new Woord();//Woord class.
				
		hetWoord = (woord.woord);//het random woord.
		
		if(ingevult[tell].length()>0) {
			letter = ingevult[tell].substring(0,1);
			loc = (hetWoord.indexOf(letter));
		}
	
		if(kansen>0) { //checkt als er nog levens zijn.
			if(ingevult[tell].length()>0) {
				if(loc >= 0) {//checkt als de letter in het woord zit.
					 System.out.println("zit er in.");
					 replaceWoord = replaceWoord.substring(0, loc) 
						 + letter 
			             + replaceWoord.substring(loc + 1); 
				}
				else { //als de letter niet in het woord zit.
					kansen --;
					levens.printLevens(kansen);
					tekening = levens.tekening;
				}
			}
			if(raad.length()>0) {
				if(raad.equals(woord.woord)) {
					System.out.println("gewonnen");
					tekening = "\tGewonnen";
				}
				else {
					kansen = 0;
					levens.printLevens(kansen);
					tekening = levens.tekening;
					System.out.println("verkeerd woord");
				}	
			}
		}
		else {
			System.out.println("dood");
		}
		
	}
}

	
	/*wat er nog moet gebeuren:
	 * ingevulde letters toevoegen aan de JList of een J
	 * ales zo als de eindopdracht moet maken
	*/

