package pruebasIDM;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith(Parameterized.class)
public class EmbotelladoraTest {

	int pequenas, grandes, total, expected;
	Embotelladora emb = new Embotelladora(); 
	
	public EmbotelladoraTest (int pequenas, int grandes, int total, int expected) {
		this.pequenas = pequenas;
		this.grandes = grandes;
		this.total = total;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> calcValues() {
		return Arrays.asList (new Object [][] {
			// Happy path: valores positivos y total < grandes x 5 + pequeñas.
			// [0] FFF TTT TF
			{8,6,22,0},
			// [1] FFF TTF TF
			{20,2,-16,-1},
			// [2] FFF TFT TF
			{2,-8,16,-1},
			// [3] FFF FTT TF
			{-18,1,16,-1},
			// Happy path: valores positivos y total = grandes x 5 + pequeñas.
			// [4] FFF TTT FT
			{5,1,10,5},
			// [5] FFF TFT FT
			{6,-2,16,-1},
			// [6] FFF FTT FT
			{-6,2,16,-1},
			// Happy path: valores positivos y total > grandes x 5 + pequeñas.
			// [7] FFF TTT FF
			{3,1,18,-1},
			// [8] FFF TFT FF
			{6,-4,5,-1},
			// [9] FFF FTT FF
			{-6,2,16,-1},
			// Entrada mas simple: todo ceros.
			// [10] TTT FFF FT
			{0,0,0,0}
			}); 
	}
	

	@Test
	public void testCalculaBotellasPequenas() {
		System.out.println(emb.calculaBotellasPequenas(pequenas, grandes, total));
		assertTrue ("Addition Test", expected == emb.calculaBotellasPequenas(pequenas, grandes, total));
	}
}