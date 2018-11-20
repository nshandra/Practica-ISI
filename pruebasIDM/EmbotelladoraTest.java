import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

public class EmbotelladoraTest {

	int pequenas, grandes, total, expected;

	@Test
	public void testAllZero() {
		pequenas = 0;
		grandes = 0;
		total = 0;
		expected = 0;
		assertTrue ("Test All Zero", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
	@Test
	public void testGrandesZero() {
		pequenas = 1;
		grandes = 0;
		total = 1;
		expected = 1;
		assertTrue ("Test Grandes Zero", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
	@Test
	public void testPequenasZero() {
		pequenas = 0;
		grandes = 1;
		total = 1;
		expected = 0;
		assertTrue ("Test Pequenas Zero", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
	@Test
	public void testTotalZero() {
		pequenas = 1;
		grandes = 1;
		total = 0;
		expected = 0;
		assertTrue ("Test Total Zero", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
	@Test
	public void testAllPositive() {
		pequenas = 1;
		grandes = 1;
		total = 1;
		expected = 0;
		assertTrue ("Test All Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
	@Test
	public void testGrandesPositive() {
		pequenas = 0;
		grandes = 1;
		total = 1;
		expected = 0;
		assertTrue ("Test Grandes Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
	@Test
	public void testPequenasPositive() {
		pequenas = 1;
		grandes = 0;
		total = 1;
		expected = 1;
		assertTrue ("Test Pequenas Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
	@Test
	public void testTotalPositive() {
		pequenas = 1;
		grandes = 1;
		total = 1;
		expected = 0;
		assertTrue ("Test Total Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
//	C7: total > grandes x 5
	@Test
	public void testTotalGreaterGrandes() {
		pequenas = 0;
		grandes = 1;
		total = 6;
		expected = -1;
		assertTrue ("Test Total Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
//	C8: total = grandes x 5
	@Test
	public void testTotalEqualsGrandes() {
		pequenas = 0;
		grandes = 1;
		total = 5;
		expected = 0;
		assertTrue ("Test Total Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
//	C9: pequeñas > total
	@Test
	public void testPequenasGreaterGrandes() {
		pequenas = 6;
		grandes = 0;
		total = 5;
		expected = 5;
		assertTrue ("Test Total Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
//	C10: pequeñas = total
	@Test
	public void testPequenasEqualsGrandes() {
		pequenas = 5;
		grandes = 0;
		total = 5;
		expected = 5;
		assertTrue ("Test Total Positive", 
					expected == Embotelladora.calculaBotellasPequenas(pequenas, grandes, total));
	}
	
}
