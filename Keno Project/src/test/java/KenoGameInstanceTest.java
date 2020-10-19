import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class KenoGameInstanceTest {
	static KenoGameInstance testInstance1;
	static KenoGameInstance testInstance4;
	static KenoGameInstance testInstance8;
	static KenoGameInstance testInstance10;
	@BeforeAll
	static void setup() {
		testInstance1 = new KenoGameInstance(1);
		testInstance4 = new KenoGameInstance(4);
		testInstance8 = new KenoGameInstance(8);
		testInstance10 = new KenoGameInstance(10);
	}

	@Test
	void computerDrawTest(){ //this test checks to make sure that all computer draws are valid
		KenoGameInstance testInstance = new KenoGameInstance(1);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		Collections.sort(testInstance.computerResult);
		ArrayList<Integer> expectedResults = new ArrayList<>();
		for(int i = 1; i<=80; i++) {
			expectedResults.add(i);
		}
		assertArrayEquals(expectedResults.toArray(), testInstance.computerResult.toArray(), "Computer draw showed incorrect input");
	}

	@Test
	void pushInputTest1(){
		KenoGameInstance testInstance = new KenoGameInstance(4);
		testInstance.pushInput(1);
		assertEquals(false, testInstance.pushInput(1), "Can't insert the same value twice");
	}

	@Test
	void pushInputTest2(){
		testInstance1.pushInput(1);
		assertEquals(false, testInstance1.pushInput(2), "Can't more than 1 spots into an instance of size 1");
	}

	@Test
	void pushInputTest3(){
		assertEquals(false,testInstance1.pushInput(81), "81 should not be able to be pushed as it is outside the valid bounds");
		assertEquals(false, testInstance1.userInput.contains(81), "81 should not be in userInput as it is outside the range");
	}

	@Test
	void pushInputTest4(){
		assertEquals(false, testInstance1.pushInput(0), "No values less than 1 should be allowed to push");
		assertEquals(false, testInstance1.userInput.contains(0), "0 should not be in userInput as its outside the range");
	}

	@Test
	void pushInputTest5(){
		assertEquals(true, testInstance4.pushInput(80), "80 should be a valid push");
		assertEquals(true, testInstance4.userInput.contains(80), "80 should be within the userInput array");
	}

	@Test
	void pushInputTest6(){
		KenoGameInstance testInstance = new KenoGameInstance(1);
		testInstance.pushInput(1);
		assertEquals(false, testInstance.pushInput(2), "You cannot push more than 1 into an instance of 1 spot");
	}

	@Test
	void isUserInputFullTest1(){
		assertEquals(true, testInstance1.isUserInputFull(), "instance 1 should be full by this point");
	}

	@Test
	void isUserInputFullTest2(){
		assertEquals(false, testInstance4.isUserInputFull(), "instance 4 shouldn't be full by now");
	}

	@Test
	void softResetTest1(){ //tests if computerDraws are successfully cleared
		KenoGameInstance testInstance = new KenoGameInstance(1);
		for(int i = 0; i < 80; i++){
			testInstance.computerDraw();
		}
		testInstance.softReset();
		assertEquals(0, testInstance.computerResult.size(), "computerResult should be empty after softReset");
	}

	@Test
	void softResetTest2(){ //test if hits are successfully cleared
		KenoGameInstance testInstance = new KenoGameInstance(1);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		testInstance.pushInput(1);
		testInstance.softReset();
		assertEquals(0 , testInstance.hits.size(), "hits should be cleared after soft reset");
	}

	@Test
	void softResetTest3(){
		KenoGameInstance testInstance = new KenoGameInstance(1);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		testInstance.pushInput(1);
		testInstance.softReset();
		assertEquals(0, testInstance.moneyWon, "money should be cleared after a soft reset");
	}

	@Test
	void winningsTest1(){
		KenoGameInstance testInstance = new KenoGameInstance(1);
		testInstance.pushInput(1);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(2, testInstance.moneyWon, "Should win $2 in 1 spot 1 hit case");
	}

	@Test
	void winningsTest2(){
		KenoGameInstance testInstance = new KenoGameInstance(4);
		for(int i = 1; i <=4; i++){
			testInstance.pushInput(i);
		}
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(75, testInstance.moneyWon, "Should win $75 in 4 spot 4 hit case");
	}

	@Test
	void winningsTest3(){
		KenoGameInstance testInstance = new KenoGameInstance(8);
		for(int i = 1; i <=8; i++){
			testInstance.pushInput(i);
		}
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(10000, testInstance.moneyWon, "Should win $10,000 in 8 spot 8 hit case");
	}

	@Test
	void winningsTest4(){
		KenoGameInstance testInstance = new KenoGameInstance(10);
		for(int i = 1; i <=10; i++){
			testInstance.pushInput(i);
		}
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(100000, testInstance.moneyWon, "Should win $100,000 in 10 spot 10 hit case");
	}

	@Test
	void winningsTest5(){
		KenoGameInstance testInstance = new KenoGameInstance(1);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(0, testInstance.moneyWon, "Should win $0 in 1 spot 0 hit case");
	}

	@Test
	void winningsTest6(){
		KenoGameInstance testInstance = new KenoGameInstance(4);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(0, testInstance.moneyWon, "Should win $0 in 4 spot 0 hit case");
	}

	@Test
	void winningsTest7(){
		KenoGameInstance testInstance = new KenoGameInstance(8);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(0, testInstance.moneyWon, "Should win $0 in 8 spot 0 hit case");
	}

	@Test
	void winningsTest8(){
		KenoGameInstance testInstance = new KenoGameInstance(10);
		while(testInstance.computerResult.size() <80 ){ //keep drawing results until all possible results were drawn
			testInstance.computerDraw();
		}
		assertEquals(0, testInstance.moneyWon, "Should win $0 in 10 spot 0 hit case");
	}

	@Test
	void constructorTest(){
		KenoGameInstance testInstance = new KenoGameInstance(1);
		assertEquals(false, testInstance.userInput==null, "userInput should be initialized");
		assertEquals(false, testInstance.computerResult==null, "computerResult should be initialized");
		assertEquals(false, testInstance.hits == null, "hits should be initialized ");
		assertEquals(0, testInstance.moneyWon, "moneyWon should be 0");
	}

	@Test
	void constructor1Test(){
		assertEquals(1, testInstance1.spotsToPlay, "spotsToPlay should be 1");
	}
	@Test
	void constructor4Test(){
		assertEquals(4, testInstance4.spotsToPlay, "spotsToPlay should be 4");
	}
	@Test
	void constructor8Test(){
		assertEquals(8, testInstance8.spotsToPlay, "spotsToPlay should be 8");
	}
	@Test
	void constructor10Test(){
		assertEquals(10, testInstance10.spotsToPlay, "spotsToPlay should be 10");
	}


}
