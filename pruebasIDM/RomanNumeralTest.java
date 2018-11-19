package pruebasIDM;

import static org.junit.Assert.*;
import org.junit.*;
import pruebasIDM.RomanNumeral;
import java.util.*;

public class RomanNumeralTest {

	private String s;
	private int num;

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

	@Test (expected = NullPointerException.class)
	public void testNegativeYear() {
		num = RomanNumeral.convierte("MCDL");
	}
}



