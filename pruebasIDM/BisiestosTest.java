package pruebasIDM;

import static org.junit.Assert.*;
import org.junit.*;

import pruebasIDM.Bisiestos;

import java.util.*;

public class BisiestosTest {

	private int year;
	
	@Test (expected = NullPointerException.class)
	public void testNegativeYear() {
		year= -700;
		 
	}
}
