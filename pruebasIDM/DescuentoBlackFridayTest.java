import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class DescuentoBlackFridayTest {

	private double price;
	private Date date = new Date();
	private LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

	//Test 1
	@Test
	public void testCheckPrice(){
		price = 30.0;

		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		double discount = price * (30.0/100.0);
		if((month == 11) && (day == 23)){
				assertTrue("Es Black Friday, fallo", discount == DescuentoBlackFriday.PrecioFinal(price));
		}else{
				assertTrue("No es Black Friday, fallo", price == DescuentoBlackFriday.PrecioFinal(price));
		}

	}

	//Test 2
	@Test (expected = IllegalArgumentException.class)
	public void testNonPositivePrice(){
		price = -59.99;
		DescuentoBlackFriday.PrecioFinal(price);

	}
}
