package tamilnadu.erode;

public class Primechallenge {

	public static void main(String[] args) {
		int i, j, count = 0;
		int no = 50;
		for (i = 1; no >= i; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}

				if (count==2)
				{
					System.out.println(i);
					System.out.println("prime");
				}
			
		}

	}

}
