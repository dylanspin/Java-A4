
public class replaceLetter {
	
	public String replaceWoord;
	public int tell;
	
	public void replace_woord(){
		
		Woord woord = new  Woord();
		Index index = new Index();
		
		replaceWoord = (woord.woord);//krijgt het woord van de classe Woord.
		
		replaceWoord = replaceWoord.replaceAll("[a-z]","-");//replaced alle letters van het woord naar streepjes

	}
	
	public void gelijk() {
		Index index = new Index();
		
		tell = index.tell;
		System.out.println("tell: "+index.tell);
		
		StringBuilder replaceWoord = new StringBuilder("test"); //moet nog veranderen is een test.
		replaceWoord.setCharAt(2, 'x');
		//System.out.println(replaceWoord);
		System.out.println("ingevulde letter: "+index.ingevult[tell]);
		
		//replaceWoord = replaceWoord.replace(index.ingevult[tell],index.ingevult[tell]);
	}

}
