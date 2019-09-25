
public class replaceLetter {
	
	public String replaceWoord;
	public String letter,hetWoord,tekening;
	public String[] streep;

	public int kansen = 8;
	public int loc;
	public boolean start = true;
	
	public void replace_woord(){
		
		Woord woord = new Woord();
		//System.out.println(woord.woord); //voor testen 
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
		
		if(ingevult[tell].length()>0) {//checkt als er iets is ingevult is.
			letter = ingevult[tell].substring(0,1);//pakt de eerste letter van de input.
			loc = (hetWoord.indexOf(letter));//pakt de locatie van de ingevulde letter in het random woord.
		}
	
		if(kansen>0) { //checkt als er nog levens zijn.
			if(ingevult[tell].length()>0) {//checkt als er iets is ingevult is.
				if(loc >= 0) {//checkt als de letter in het woord zit.
					 System.out.println("zit er in.");
					 replaceWoord = replaceWoord.substring(0, loc) 
						 + letter 
			             + replaceWoord.substring(loc + 1); 
				}
				else { //als de letter niet in het woord zit.
					kansen --; //als de letter er niet in zit dan gaat er een leven van af.
					levens.printLevens(kansen);//print de galg uit.
					tekening = levens.tekening;
					System.out.println("Zit er niet in");
				}
			}
			if(raad.length()>0) {
				if(raad.equals(woord.woord)) {
					System.out.println("gewonnen");
					levens.gewonnen();//doet de gewonnen function in de class levens.
					tekening = levens.gewon;//pakt de winscreen van de class levens.
				}
				else {
					kansen = 0; //als er gegokt is en het is fout dan is de game over.
					levens.printLevens(kansen);//pakt de dood screen van de class levens.
					tekening = levens.tekening;
					System.out.println("verkeerd woord");
				}	
			}
		}
		else {//als de game over is.
			System.out.println("dood");
		}
		
	}
}

	
	/*wat er nog moet gebeuren:
	 * ales zo als de eindopdracht moet maken
	*/

