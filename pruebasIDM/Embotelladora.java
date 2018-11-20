public class Embotelladora {
	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) {
		if (pequenas < 0 || grandes < 0 || total < 0) {
			return -1;
		} else {
			int rest = total - (grandes * 5);
			if (rest >= 0) {
				if (pequenas >= rest) {
					return rest;
				} else {
					return -1;
				}
			} else {
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.format("%d\n", calculaBotellasPequenas(1,2,6));
	}
}
