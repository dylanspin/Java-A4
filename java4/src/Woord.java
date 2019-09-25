import java.util.Random;

public class Woord {

	static public String[] woorden = {
			   "scherm","beer","dylan","koelkast","laptop","apple","oplader","mobiel","water","stoel","leven","school","joke",
			   "fles","muis","klomp","bus","station","muismat","tafel","raam","auto","brandblusser","klok","paracetamol",
			   "takties","stage","pen","fiets","android","busje","zeven","huis","letter","fietstas","woestijn","pinpas",
			   "importeren","trap","camper","tesla","jumbo","lamp","kernbom","bank","telefoon","stekkerdoos","mond","voedsel",
			   "chimmel","filmen","drugs","dood","arbeidsongeschiktheidsverzekering","zandsteen","stralen","wiel","fietsband",
			   "pakje","bakje","zakje","hekje","koffie","vlekje","thee","suiker","game","hippo","lidl","makro","duitsland",
			   "dop","papier","wc","stoelpoot","deurklink","kruk","rood","bloed","zee","computerscherm","oortjes","muziek",
			   "natrium","kernenergie","brand","amazone","vliegtuig","boot","heg","koffievlek","wcroll","wcbrill","kraan",
			   "hond","kat","eten","maand","maan","maart","maat","makker","ijzer","kooper","mostardgas","mostard","bom","rusland",
			   "amerika","naam","geen","zuurstof","muismat","hyper","knop","zout","zuur","bot","pijn","pijp","lange","gordijn",
			   "monitor","kabel","pizza","pizzadeeg","tomaat","graf","begraafplaats","parkeerplaats","botten","stof","jodium",
			   "guillotine","touw","heks","cijfer","johnwick","lucht","wolken","zon","regen","ratten","marters","bond","vogel",
			   "spijkers","potlood","receptionist","kraam","random","bootvliegtuig","zinken","zink","regenpijp","slecht","wifi",
			   "wortel","werken","stoppen","aangereden","bord","man","vrouw","geld","vis","vissen","haven","sluiten","student",
			   "dik","vet","crimineel","briefenbus","wetenschap","baas","basischool","schedel","gras","juf","film","hout","club",
			   "opium","coke","cola","brood","vloer","draad","noten","leer","walvis","handel","lang","afval","rook","brandalarm",
			   "hoefijzer","vervoerdersaansprakelijkheidsverzekering","gamalagamala","praten","leugen","donker","wolf","kinderen",
			   "opgegeten","paard","rijden","geen","sport","pc","toets","ondernemen","normaal","hand","vinger","galgje","lichaam",
			   "zak","drie","boom","vis","dier","natuurlijk","usb","flag","nederland","duitsland","frankrijk","spanje","sla","brood",
			   "boot","tank","spoor","tijd","spatie","letter","weggaan","verlaten","eten","appel","peer","meloen","schakel","lamp",
			   "water","bureaustoelwielen","doos","kerk","toren","dorp","stad","fiets","meneer","mevrouw","paintballgeweer",
			   "paddestoel","kikker","afval","bier","java","marvel","spel","horloge","kunst","vloer","emotie","lucht","gras","spin",
			   "halfuur","tegenwoordig","landelijk","geschiedenis","groot","klein","eigenaar","werkgever","werknemer","alochtoon",
			   "geel","bever","bioscoop","vogel","japan","actie","insect","reeling","rellen","vallen","regen","spijker","tas",
			   "karton",""
   };
	static public int lengte = 0;
	
	static public String woord;
	
	public String[] getWoord() { return woorden; }
	
	public void random() {
		
		Random random = new Random();
		int number;
		number = 1+random.nextInt(295);
		woord = (woorden[number]);
		lengte = (woorden[number].length());//moet mischien nog weg.
		//System.out.println(woorden.length);
		
	}

}
