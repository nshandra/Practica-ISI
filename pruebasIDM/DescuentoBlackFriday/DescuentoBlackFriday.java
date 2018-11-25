import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;


public class DescuentoBlackFriday {

	public double PrecioFinal(double precioOriginal) {
		if(precioOriginal <= 0.00) throw new IllegalArgumentException();

		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		double discount = precioOriginal * (30.0/100.0);

		if((month == 11) && (day == 23)){
			return discount;
		}else{
			return precioOriginal;
		}
	}
}
