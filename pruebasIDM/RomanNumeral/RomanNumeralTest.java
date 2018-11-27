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
}



