import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith(Parameterized.class)
public class DataDrivenEmbotelladoraTest {

	int pequenas, grandes, total, expected;
	Embotelladora emb = new Embotelladora(); 
	
	public DataDrivenEmbotelladoraTest (int pequenas, int grandes, int total, int expected) {
		this.pequenas = pequenas;
		this.grandes = grandes;
		this.total = total;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> calcValues() {
		return Arrays.asList (new Object [][] {
			//Entrada nula
			{0,0,0,0},{0,1,1,0},{1,0,1,1},{1,1,0,0},
			//Entrada negativa
			{-1,-1,-1,-1},{-1,1,1,-1},{1,-1,1,-1},{1,1,-1,-1},
			
			{0,1,6,-1},{0,2,6,0},{0,2,10,0},			
			{1,2,6,0},{6,2,6,0},{8,2,6,0},		
			{0,2,10,0},{10,2,10,0},{20,2,10,0},
			{5,1,10,5},{11,1,10,5},{5,1,10,5}
			}); 
	}
	

	@Test
	public void testCalculaBotellasPequenas() {
		assertTrue ("Addition Test", expected == emb.calculaBotellasPequenas(pequenas, grandes, total));
	}
}