import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class replaceLetterTest {
	
	//Weet nog niet goed hoe deze test werken.
	
	@Test
	void test() {
		String WoordTest[] = {"TestWorRD","Test","RandomWOord"};
		String LetterTest = "r";
		int LengteTest = 5;
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.gelijk(WoordTest, LengteTest ,LetterTest);
	}
	
	@Test
	void test2() {
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.replace_woord();
	}
	
	@Test
	void test3() {
		int Levens = 80;
		Levens levensTest = new Levens();
		levensTest.printLevens(Levens);
	}
	
	@Test
	void test4() {
		Levens levensTest = new Levens();
		levensTest.gewonnen();
	}
	
	@Test
	void test5() {
		String WoordTest[] = {"","",""};
		String LetterTest = "1";
		int LengteTest = 5;
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.gelijk(WoordTest, LengteTest ,LetterTest);
	}
	
	@Test
	void test6() {
		String WoordTest[] = {"Nieuw woorden","oke oke","Text woorden"};
		String LetterTest = "1";
		int LengteTest = 20;
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.gelijk(WoordTest, LengteTest ,LetterTest);
	}
	
	@Test
	void test7() {
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.start = true;
	}
	
	@Test
	void test8() {
		Index IndexTest = new Index();
		IndexTest.ingevult = new String[0];
	}
	@Test
	void test9() {
		Index IndexTest = new Index();
		IndexTest.ingevult = new String[20];
	}

}
