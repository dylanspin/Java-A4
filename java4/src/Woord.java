import java.util.Random;

public class Woord {

	static public String[] woorden = {
			   "scherm","beer","dylan","koelkast","laptop","apple","oplader","mobiel","water","stoel","leven","school","joke"
			   ,"fles","muis","klomp","bus","station","muismat","tafel","raam","auto","brandblusser","klok","paracetamol",
			   "takties","stage","pen","fiets","android","busje","zeven","huis","letter","fietstas","woestijn","pinpas",
			   "importeren","trap","camper","tesla","jumbo","lamp","kernbom","bank","telefoon","stekkerdoos","mond","voedsel",
			   "chimmel","filmen","drugs","dood","arbeidsongeschiktheidsverzekering","zandsteen","straalen","wiel","fietsband",
			   "pakje","bakje","zakje","hekje","koffie","vlekje","thee","suiker","game","hippo","lidl","makro","duitsland",
			   "dop","papier","wc","stoelpoot","deurklink","kruk","rood","bloed","zee","computerscherm","oortjes","muziek",
			   "natrium","kernenergie","brand","amazone","vliegtuig","boot","heg","koffievlek","wcroll","wcbrill","kraan",
			   "hond","kat","eten","maand","maan","maart","maat","makker","ijzer","Zyklon","mostardgas","mostard","bom","rusland",
			   "amerika","naam","geen","zuurstof","meer","hyper","knop","zout","zuur","bot","pijn","pijp","lange","gordijn",
			   "monitor","kabel","pizza","pizzadeeg","massa","graf","begraafplaats","parkeerplaats","botten","stof","jodium",
			   "guillotine","touw","heks","wich","johnwick","lucht","wolken","zon","regen","ratten","marters","bond","vogel",
			   "spijkers","potlood","receptionist","kraam","random","bootvliegtuig","zinken","zink","regenpijp","slecht","wifi",
			   "wortel","werken","stoppen","aangereden","bord","man","vrouw","geld","vis","vissen","haven","sluiten","student",
			   "dik","vet","crimineel","briefenbus","wetenschap","baas","basischool","schedel","gras","juf","film","hout","club",
			   "opium","coke","cola","brood","vloer","draad","noten","leer","walvis","handel","lang","afval","rook","brandalarm",
			   "hoefijzer","vervoerdersaansprakelijkheidsverzekering","gamalagamala","praten","donker","wolf","kinderen","opgegeten"
   };
	static public int lengte = 0;
	
	static public String woord;
	
	public String[] getWoord() { return woorden; }
	
	public void random() {
		
		Random random = new Random();
		int number;
		number = 1+random.nextInt(204);
		woord = (woorden[number]);
		System.out.println(woord);
		lengte = (woorden[number].length());//moet mischien nog weg.
	}

}
