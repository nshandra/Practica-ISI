package pruebasIDM;



public class RomanNumeral {
// Parámetro: s es un número romano.
// Devuelve : s en base 10
//No se especifica qué ocurre si el número no es romano


//Si a la derecha de una cifra romana se escribe otra igual o menor, el valor de ésta se suma a la anterior.
//Si un símbolo está a la izquierda inmediata de otro de mayor valor, se resta al valor del segundo el valor del primero.
//Se permiten a lo sumo tres repeticiones consecutivas del mismo símbolos I, X y C.
//No se permite la repetición de una misma símbolos V, L y D. (Muchos relojes el uso de IIII para el numeral 4, en lugar del correcto IV.)
//La cifra I colocada delante de la V o la X, les resta una unidad; la X, precediendo a la L o a la C, les resta diez unidades y la C, delante de la D o la M, les resta cien unidades.


	private int valueFromRoman(char c){
		int val;

		val = 0;

		switch(c){
		case 'I': val = 1;
			break;
		case 'V': val = 5;
			break;
		case 'X': val = 10;
			break;
		case 'L': val = 50;
			break;
		case 'C': val = 100;
			break;
		case 'D': val = 500;
			break;
		case 'M': val = 1000;
			break;
		default: val = 0;
			break;
		}
		return val;
	}

	public int convierte(String s){
		char charActual, charAnt;
		charActual = 'Z';
		charAnt = 'Z';
		int total;

		total = 0;

		for (int n = s.length()-1 ; n>=0; n--){
			char c = s.charAt (n); 
			System.out.println (valueFromRoman(c));

			if(n!=s.length()-1){
				charAnt = charActual;
				charActual = c;
			}else{
				charActual = c;
				charAnt = c;
			}

			if((int) valueFromRoman(charActual) >= valueFromRoman(charAnt)){
				total = total + valueFromRoman(charActual);
			}else{
				total = total - valueFromRoman(charActual);
			}
			System.out.println("La cuenta va en: " + total);
		}
		
		return total;
	}

	public static void main(String[] args){
//		String str = "MCDLXXIIX";
		String str = "MCDLXIV";
		RomanNumeral rn = new RomanNumeral();
		System.out.println("El número es: " + rn.convierte(str));
	}
}
