package tamilnadu.erode;

public class Additionofdigits {

	public static void main(String[] args) {
		int sum=0;
		int digit,number=1234;
		int count=0;
		while(number>0)
		{
			count=count+1;
			digit= number%10;
			sum = sum +digit;
			number=number/10;
			//System.out.println(sum);
			if (number==0&&sum/10!=0)
			{
				number=sum;
				System.out.println(sum);
				sum=0;
				
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
