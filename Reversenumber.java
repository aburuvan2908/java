package tamilnadu.erode;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		int no = 0, sum = 0;
		int temp ;
		Reversenumber md = new Reversenumber();
		md.Reverse();
		

	}
	public void Reverse()
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int  temp = no ;
		int sum=0;
		while( temp >0)
		{
			int rem = temp%10;
			sum = (sum*10)+rem;
			temp= temp/10;
		}
		System.out.println("value"+sum);
		
	}

}
