
public class Levens {

	public String[] leven = new String[5];
	public String tekening;
	
	public void printLevens(int levens) {
		Woord woord = new Woord();
		
	 	leven[0] = "    Game over woord: " + woord.woord + "\n"
				+ "           _______ \n"
				+ "           |/           |\n"
				+ "           |            ()\n"
				+ "           |           /()\\\n"
				+ "           |            LL\n"
				+ "           |\n"
				+ "   ____|_______\n";
	 	leven[1] = "    Levens: 1\n"
	 			+ "           _______ \n"
				+ "           |/           |\n"
				+ "           |            ()\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
		leven[2] = "    Levens: 2\n"
	 			+ "           _______ \n"
				+ "           |/\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
		leven[3] = "    Levens: 3\n"
	 			+ "     \n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
		leven[4] = "    Levens: 4\n"
	 			+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "   ____|______\n";
		
		tekening = leven[levens];
	}

}
