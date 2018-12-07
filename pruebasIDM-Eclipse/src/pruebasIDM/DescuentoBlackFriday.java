package pruebasIDM;

import java.util.*;
import java.time.LocalDate;


public class DescuentoBlackFriday {

	public double PrecioFinal(double precioOriginal, LocalDate today) {
		if(precioOriginal <= 0.00) throw new IllegalArgumentException();


		int month = today.getMonthValue();
		int day   = today.getDayOfMonth();
		double discount = precioOriginal * (30.0/100.0);

		if((month == 11) && (day == 23)){
			return discount;
		}else{
			return precioOriginal;
		}
	}
}
