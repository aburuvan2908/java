package tamilnadu.erode;

import java.util.Scanner;

public class Powerprogram {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner Sc = new Scanner(System.in);
		int no = Sc.nextInt();
		System.out.println("enter the power value");
		int b=Sc.nextInt();
		int d=1;
		int i,j=b ;
		for(i=1;i<=j;i++)
		{
			d=d*no;
			//System.out.println("j is"+j);
			System.out.println(d);
			
		}
		System.out.println(d);
		

	}

}
