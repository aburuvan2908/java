package tamilnadu.erode;

public class Homework3 {

	public static void main(String[] args) {
		int i=12;
		int no=42;
		while(i>0)
		{
			no=no-i;
			i=i-2;
			System.out.println(no);
			if (no%10==0)
			{
				System.out.println("divisible by 10 value"+no);
			}
	
		}
		

	}

}
