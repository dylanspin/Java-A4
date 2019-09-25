import java.util.Random;

public class Levens {

	public String[] leven = new String[8];
	public String[] win = new String[8];
	public String tekening,gewon;
	
	public void printLevens(int levens) { //De galg.
		Woord woord = new Woord();
		
	 	leven[0] = "    Game over woord: " + woord.woord + "\n"
				+ "           _______ \n"
				+ "           |/           |\n"
				+ "           |            ()\n"
				+ "           |           /()\\\n"
				+ "           |            LL\n"
				+ "           |\n"
				+ "   ____|_______\n";
	 	leven[1] = "    Levens: 1\n  "
				+ "           _______ \n"
				+ "           |/           |\n"
				+ "           |            ()\n"
				+ "           |           /()\\\n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
	 	leven[2] = "    Levens: 2\n"
	 			+ "           _______ \n"
				+ "           |/           |\n"
				+ "           |            ()\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
		leven[3] = "    Levens: 3\n"
	 			+ "           _______ \n"
				+ "           |/\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
		leven[4] = "    Levens: 4\n"
	 			+ "     \n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
		leven[5] = "    Levens: 5\n"
	 			+ "     \n"
				+ "           \n"
				+ "           \n"
				+ "           \n"
				+ "           |\n"
				+ "           |\n"
				+ "   ____|_______\n";
		leven[6] = "    Levens: 6\n"
	 			+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "   ____|______\n";
		leven[7] = "    Levens: 7\n"
	 			+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "   ____\n";
		
		tekening = leven[levens];
		
	}
	
	public void gewonnen() { //win screens.
		
		Random rand = new Random();//random nummer die er voor zorgt dat er een van de 4 win screens word gepakt.
		int random = rand.nextInt(4); 
		
		win[0]=	  "     Gewonnen\n"
				+ " ╭━┳━╭━╭━╮╮\r\n" + 
				"┃┈┈┈┣▅╋▅┫┃\r\n" + 
				"┃┈┃┈╰━╰━━━━━━╮\r\n" + 
				"╰┳╯┈┈┈┈┈┈┈┈┈◢▉◣\r\n" + 
				"╲┃┈┈┈┈┈┈┈┈┈▉▉▉\r\n" + 
				"╲┃┈┈┈┈┈┈┈┈┈◥▉◤\r\n" + 
				"╲┃┈┈┈┈╭━┳━━━━╯\r\n" + 
				"╲┣━━━━━━┫﻿";
		win[1]=
				  "|￣￣￣￣￣￣￣ |  \r\n" + 
				  "|    Gewonnen      |\r\n" + 
				  "|＿＿＿＿＿ _＿_|\r\n" + 
				  "(\\__/) || \r\n" + 
				  "(•ㅅ•) || \r\n" + 
				  "/ 　 づ  ";
		
		win[2] =  "   Gewonnen\n"+
				  "   ……...(●̮•) \r\n" + 
				  "   ……..||/█\\\r\n" + 
				  "   …./”\"”\"”\"”\"”\"”\"\\======||| \r\n" + 
				  "   /”\"”\"”\"”\"”\"”\"”\"”\"”\"”\"””\"”\\ \r\n" + 
				  "   \\_@_@_@_@_@_/";
		
		win[3] = "\t |\\_/|    Gewonnen\r\n" + 
				"\t (. .)\r\n" + 
				"\t  =w= (\\  \r\n" + 
				"\t / ^ \\//  \r\n" + 
				"\t(|| ||)\r\n" + 
				"\t,\"\"_\"\"_ .";
		
		gewon = win[random];
	}

}
