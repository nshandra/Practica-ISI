// javac 
// javac -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests.java
// java -cp .:../../hamcrest-core-1.3.jar:../../junit-4.12.jar AllTests


public class RomanNumeral {
// Parámetro: s es un número romano.
// Devuelve : s en base 10
//No se especifica qué ocurre si el número no es romano


//Si a la derecha de una cifra romana de escribe otra igual o menor, el valor de ésta se suma a la anterior.
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
		for (int n = 0 ; n<s.length(); n++){
			char c = s.charAt (n); 
			System.out.println (valueFromRoman(c));

			if(n!=0){
				charAnt = charActual;
				charActual = c;
			}else{
				charActual = c;
				charAnt = c;
			}

			if((int) charActual <= (int) charAnt){
				System.out.println("Bien");
			}

		}
		return 0;
	}

	public static void main(String[] args){
		String str = "MCDM";
		RomanNumeral rn = new RomanNumeral();
		rn.convierte(str);
	}
}
