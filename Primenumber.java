package tamilnadu.erode;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner (System.in);
		int no = sc.nextInt();
		int count=0,count1=0;
		int div = 1;
		//int no = 14;
		while(div<=no)
		{
			if (no%div==0)
			{
				count = count +1;
			
			
				System.out.println(div);
			} 
			div = div+1;
		}
		System.out.println("count value"+count);
		
int n=count;
	
	//count1 = 0;
	while(count>0)
	{
		if(n%count==0)
		{
			count1 = count1+1;
			
		}
		
		count--;

	}
	if (count1==2)
	{
		System.out.println("count value is prime");
	}
	else
	{
		System.out.println("count value is not prime");
	}
	}

}
