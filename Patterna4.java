package tamilnadu.erode;

public class Patterna4 {

	public static void main(String[] args) {
		int i, j;
		int value = 1;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print( "     "  +value  +"    " );
				value++;

			}
			System.out.println();
		}

	}

}
