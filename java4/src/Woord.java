import java.util.Random;

public class Woord {

	 public String[] woorden = {
			   "scherm","beer","persoon","koelkast","laptop","apple","oplader","mobiel","water","stoel","leven","school","joke",
			   "fles","muis","klomp","bus","station","muismat","tafel","raam","auto","brandblusser","klok","paracetamol",
			   "zwart","stage","pen","fiets","android","busje","zeven","huis","letter","fietstas","woestijn","pinpas",
			   "importeren","trap","camper","tesla","jumbo","lamp","kernbom","bank","telefoon","stekkerdoos","mond","voedsel",
			   "chimmel","filmen","drugs","dood","zandsteen","stralen","wiel","fietsband","takties","koevoet","weergeven",
			   "pakje","bakje","zakje","hekje","koffie","vlekje","thee","suiker","game","hippo","lidl","makro","duitsland",
			   "dop","papier","wc","stoelpoot","deurklink","kruk","rood","bloed","zee","computerscherm","oortjes","muziek",
			   "natrium","kernenergie","brand","amazone","vliegtuig","boot","heg","koffievlek","wcroll","wcbrill","kraan",
			   "hond","kat","eten","maand","maan","maart","maat","makker","ijzer","koper","mostardgas","mostard","bom","rusland",
			   "amerika","naam","geen","zuurstof","muismat","hyper","knop","zout","zuur","bot","pijn","pijp","lange","gordijn",
			   "monitor","kabel","pizza","pizzadeeg","tomaat","graf","begraafplaats","parkeerplaats","botten","stof","jodium",
			   "zakje","touw","heks","cijfer","tank","lucht","wolken","zon","regen","ratten","marters","bond","vogel",
			   "spijkers","potlood","receptionist","kraam","random","draad","zinken","zink","regenpijp","slecht","wifi",
			   "wortel","werken","stoppen","aangereden","bord","man","vrouw","geld","vis","vissen","haven","sluiten","student",
			   "dik","vet","crimineel","briefenbus","wetenschap","baas","basischool","schedel","gras","juf","film","hout","club",
			   "opium","coke","cola","brood","vloer","draad","noten","leer","walvis","handel","lang","afval","rook","brandalarm",
			   "hoefijzer","vloeken","praten","leugen","donker","wolf","kinderen","olie","oerwoud","wist","privacy","band",
			   "opgegeten","paard","rijden","geen","sport","pc","toets","ondernemen","normaal","hand","vinger","galgje","lichaam",
			   "zak","drie","boom","vis","dier","natuurlijk","usb","flag","nederland","duitsland","frankrijk","spanje","sla","brood",
			   "boot","tank","spoor","tijd","spatie","letter","weggaan","verlaten","eten","appel","peer","meloen","schakel","lamp",
			   "water","doos","kerk","toren","dorp","stad","fiets","meneer","mevrouw","paintbal","verleden","toekomst","drama",
			   "paddestoel","kikker","afval","bier","java","marvel","spel","horloge","kunst","vloer","emotie","lucht","gras","spin",
			   "halfuur","tegenwoordig","landelijk","geschiedenis","groot","klein","eigenaar","werkgever","werknemer","alochtoon",
			   "geel","bever","bioscoop","vogel","japan","actie","insect","reeling","rellen","vallen","regen","spijker","tas",
			   "karton","veld","slogan","heerlijk","sokken","broek","bewaken","proberen","apen","huid","geslacht","buurt","les",
			   "maffia","kritiek","goed","moment","moeder","vader","trainer","verkocht","puur","wijn","uitverkocht","laag","hoog",
			   "opent","gebracht","praktijk","eind","lang","radio","rat","afgebroken","mischien","besef","half","boederij","boer",
			   "galg","weg","lopen","station","dankbaar","onderdelen","oma","opa","overheid","verplicht","overgang","oud","besluit",
			   "arts","afwezig","belooft","stage","droom","gelukkig","molens","donker","techniek","balans","internet","ei","kip","koe",
			   "inwoners","geweldig","slaapkamer","voorzien","verborgen","locaties","zingen","jeugd","touw","vat","bergen","cactus","struik",
			   "huis","buurman","buurvrouw","kermis","kerst","vereist","scheldel","schop","woedde","weigeren","voelt","portier","poort",
			   "steen","mijn","plaat","spreekt","grens","wachttoren","vries","zetel","kennis","geloof","'minder","schuld","toeristen",
			   "droeg","akker","vermeld","dochter","zoon","controle","paart","oordeel","treffer","mammoet","dino","treffer","simpel",
			   "stal","afname","kennen","benzine","wilt","creatie","illusie","eer","knopen","metro","trein","fout","leeftijd","oscar",
			   "inhuren","ingeslikt","pret","faalde","voetbal","minuut","seconde","zak","bericht","honden","lezen","schenken","vals",
			   "dreigen","kast","schade"
   };
	static public int lengte = 0;
	
	static public String woord;
	
	public String[] getWoord() { return woorden; }
	
	public void random() {
		
		Random random = new Random();
		int number;
		number = 1+random.nextInt(449);
		woord = (woorden[number]);
		lengte = (woorden[number].length());
	}

}
