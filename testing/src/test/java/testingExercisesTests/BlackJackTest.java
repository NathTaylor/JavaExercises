package testingExercisesTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import testingExercises.BlackJack;

public class BlackJackTest {

	BlackJack blackJack1 = new BlackJack();
	
	@BeforeClass
	public static void init() {
	    System.out.println("Before test");
	}
	
	@Test
	public void testBothBust() {
		assertEquals("Error unexpected outsome", 0, blackJack1.play(23, 22));
	}
	
	@Test
	public void boolIsTrueTest() {
	    boolean bool = true;
	    assertTrue("Expected: Flag Set to True", blackJack1.play(22, 22) == 0);
}

	@Test

		
	}
