
public class main {

	public static void main(String[] args) {
		
		
		Woord woord = new  Woord(); //Woord class.
		replaceLetter Replace = new replaceLetter(); //replaceLetter class.
		
		woord.random();//pakt een random woord uit de classe woord.
		Replace.replace_woord();//maakt van het woord streepjes.
		
		Index index = new Index();
		index.vak = Replace.replaceWoord;
		index.main(null);
		index.createView();

	}

}
