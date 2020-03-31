import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class replaceLetterTest {
	
	@Test
	void test1() {
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.replace_woord();
	}
	
	@Test
	void test2() {
		int Levens = 80;
		Levens levensTest = new Levens();
		levensTest.printLevens(Levens);
	}
	
	@Test
	void test3() {
		Levens levensTest = new Levens();
		levensTest.gewonnen();
	}

	@Test
	void test4() {
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.start = true;
	}
	
	@Test
	void test5() {
		Index IndexTest = new Index();
		IndexTest.ingevult = new String[0];
	}
	
	@Test
	void test6() {
		Index IndexTest = new Index();
		IndexTest.ingevult = new String[20];
	}
	
	@Test
	void test7() {
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.replaceWoord = "dddddddddddddddddddddddddddddddd";
	}
	@Test
	void test8() {
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.replaceWoord = "";
	}
	
	@Test
	void test9() {
		String[] test = {"",""};
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.gelijk(test,0);
	}
	
	@Test
	void test10() {
		String[] test = {"dddddddddddddddddd","AAAAAAAAAAAAAAAAAA"};
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.gelijk(test,0);
	}
	
	@Test
	void test11() {
		replaceLetter ReplaceTest = new replaceLetter();
		ReplaceTest.start = false;
	}

}
