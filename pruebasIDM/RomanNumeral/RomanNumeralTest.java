import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanNumeralTest {

	private String s;

	@Before      // Set up - Called before every test method.
	public void setUp()
	{
		;
	}

	@After      // Tear down - Called after every test method.
	public void tearDown()
	{
		;
	}

	@Test //(expected = NullPointerException.class)
	public void testTooManyLetters() {
		RomanNumeral num = new RomanNumeral();
		assertTrue("Too many letters", -1 == num.convierte("MMMM") );
	}

	@Test
	public void testInvalidRepeatedLetters(){
		RomanNumeral num = new RomanNumeral();
		assertTrue("Invalid repeated letters", -1 == num.convierte("XVVI"));
	}

	@Test
	public void testHappyPath(){
		RomanNumeral num = new RomanNumeral();
		assertTrue("Happy path", 1467 == num.convierte("MCDLXVII"));
	}

	@Test
	public void testBadOrder(){
		RomanNumeral num = new RomanNumeral();
		assertTrue("Bad order", -1 == num.convierte("MMIM"));
	}

	@Test 
	public void testWrongRepetition(){
		RomanNumeral num = new RomanNumeral();
		assertTrue("Wrong repetition", -1 == num.convierte("LIXL"));
	}


}



