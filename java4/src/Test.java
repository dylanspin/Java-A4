import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class Test extends JFrame{
	
	static public String[] woorden = { "scherm","beer","dylan","koelkast","laptop","apple","oplader","mobiel","water","stoel","leven","school","joke"
									   ,"fles","muis","klomp","bus","station","muismat","tafel","raam","auto","brandblusser","klok","paracetamol",
									   "takties","stage","pen","fiets","android","busje","zeven","huis","letter","fietstas","woestijn","pinpas",
									   "importeren","trap","camper","tesla","jumbo","lamp","kernbom","bank","telefoon","stekkerdoos","mond","voedsel",
									   "chimmel","filmen","drugs","dood","arbeidsongeschiktheidsverzekering","zandsteen","straalen","wiel","fietsband",
									   "pakje","bakje","zakje","hekje","koffie","vlekje","thee","suiker","game","hippo","lidl","makro","duitsland",
									   "dop","papier","wc","stoelpoot","deurklink","kruk","rood","bloed","zee","computerscherm","oortjes","muziek",
									   "natrium","kernenergie","brand","amazone","vliegtuig","boot","heg","koffievlek","wcroll","wcbrill","kraan",
									   "hond","kat","eten","maand","maan","maart","maat","makker","ijzer","Zyklon","mostardgas","mostard","bom","rusland",
									   "amerika","卍","geen","zuurstof","meer","hyper","knop","zout","zuur","bot","pijn","pijp","lange","gordijn",
									   "monitor","kabel","pizza","pizzadeeg","massa","graf","begraafplaats","parkeerplaats","botten","stof","jodium",
									   "guillotine","touw","heks","wich","johnwick","lucht","wolken","zon","regen","ratten","marters","bond","vogel",
									   "spijkers","potlood","receptionist","kraam","random","bootvliegtuig","zinken","zink","regenpijp","slecht","wifi",
									   "wortel","werken","stoppen","aangereden","bord","man","vrouw","geld","vis","vissen","haven","sluiten","student",
									   "dik","vet","crimineel","briefenbus","wetenschap","baas","basischool","schedel","gras","juf","film","hout","club",
									   "opium","coke","cola","brood","vloer","draad","noten","leer","walvis","handel","lang","afval","rook","brandalarm",
									   "hoefijzer","vervoerdersaansprakelijkheidsverzekering","gamalagamala","praten","donker","wolf","kinderen","opgegeten"};
	
	
	public Test() {
		
		createView();
		
		setTitle("Hangman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	private void createView() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel);
		
	}
	

	public static void main(String[] args) {
		
		Test Class = new Test();
		
		System.out.println(woorden[205-1]);
		
		SwingUtilities.invokeLater(new Runnable() {
	  		    	
    		public void run() {
    			new Test().setVisible(true);
    		}
    	});   

	}

}
