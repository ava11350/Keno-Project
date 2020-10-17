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



}
