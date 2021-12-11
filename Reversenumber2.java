package tamilnadu.erode;

public class Reversenumber2 {

	public static void main(String[] args) {
		int additionofdigits = 0;
		int countofdigits=0;
		int no = 1234;
		while(no>0) {
			additionofdigits= additionofdigits+no%10;
			System.out.println(no%10);
			no=no/10;
			countofdigits=countofdigits+1;
		}
		System.out.println(additionofdigits);
		System.out.println(countofdigits);

	}

}
