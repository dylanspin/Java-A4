
public class replaceLetter {
	
	public String replaceWoord;
	public String letter,hetWoord,woord2,tekening,hoofd;
	public String[] streep;

	public int kansen = 8;
	public int loc;
	public boolean start = true;
	
	public void replace_woord(){
		
		Woord woord = new Woord();
		System.out.println(woord.woord); //voor testen/cheaten.
		
		if(start) {
			woord2 = woord.woord;
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
		
		if(ingevult[tell].length()>0) {//checkt als er iets is ingevult is.
			letter = ingevult[tell].substring(0,1);//pakt de eerste letter van de input.
			hoofd = letter.toUpperCase();//maakt de letter naar een hoofdletter.
			loc = (hetWoord.indexOf(letter));//pakt de locatie van de ingevulde letter in het random woord.
		}
		
		if(kansen>0) { //checkt als er nog levens zijn.
			if(ingevult[tell].length() == 1) {//checkt als er iets is ingevult is.
				if(loc >= 0) {//checkt als de letter in het woord zit.
					 woord2 = woord2.replaceAll(letter,hoofd);
					 replaceWoord = woord2.replaceAll("[a-z]","-");//veranderd alles naar een - behalve als het een hoofdletter is.
					 System.out.println("zit er in.");
				}
				else { //als de letter niet in het woord zit.
					kansen --; //als de letter er niet in zit dan gaat er een leven van af.
					levens.printLevens(kansen);//print de galg uit.
					tekening = levens.tekening;
					System.out.println("Zit er niet in");
				}
			}else {		
				if(ingevult[tell].equals(woord.woord)) {
					levens.gewonnen();//doet de gewonnen function in de class levens.
					tekening = levens.gewon;//pakt de winscreen van de class levens.
					System.out.println("gewonnen");
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


