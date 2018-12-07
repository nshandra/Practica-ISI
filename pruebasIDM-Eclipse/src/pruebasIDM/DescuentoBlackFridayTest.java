package pruebasIDM;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class DescuentoBlackFridayTest {

	private double price;
	DescuentoBlackFriday dbf = new DescuentoBlackFriday();

	//Test 1
	@Test
	public void testCheckPriceBlackFriday(){
		price = 30.0;
		
		double discount = price * (30.0/100.0);
										//year, month, day
		LocalDate inputDate = LocalDate.of(2018,11,23);
		assertTrue("Es Black Friday, fallo", discount == dbf.PrecioFinal(price,inputDate));

	}
	
	//Test 2
	@Test
	public void testCheckPriceNoBlackFriday() {
		price = 59.99;
		
										//year, month, day
		LocalDate inputDate = LocalDate.of(2018,6,7);
		assertTrue("No es Black Friday, fallo", price == dbf.PrecioFinal(price,inputDate));
	}

	//Test 3
	@Test
	public void testCheckSameMonthNoBF() {
		price = 40.55;
		
										//year, month, day
		LocalDate inputDate = LocalDate.of(2018,11,7);
		assertTrue("No es Black Friday, fallo", price == dbf.PrecioFinal(price,inputDate));
	}
	
	//Test 4
	@Test
	public void testCheckSameDayNoBF() {
		price = 25.99;
		
										//year, month, day
		LocalDate inputDate = LocalDate.of(2018,3,11);
		assertTrue("No es Black Friday, fallo", price == dbf.PrecioFinal(price,inputDate));
	}
	
	//Test 5
	@Test (expected = IllegalArgumentException.class)
	public void testNonPositivePrice(){
		price = -59.99;
		LocalDate inputDate = LocalDate.of(2018,5,5); //Cualquiera me sirve aquí
		dbf.PrecioFinal(price,inputDate);

	}
}
