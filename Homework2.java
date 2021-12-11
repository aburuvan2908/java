package tamilnadu;

public class Homework2 {

	public static void main(String[] args) {
		int i = 5;
		int no = 0;
		int sum = 0;

		while (i > 0) {

			no = i * i ;
			sum = sum + no;
			System.out.println(" "+no);
		
			i--;
		}
		i=5;
	
		 no=0;
				
	
		while(i>0) {
			no=i*i;
			//System.out.println(" entering while loop");
			if (no % 2 == 0) {
				System.out.println("even number of sum value");
				System.out.println(no);
				
			}if(no%2!=0)
			{
				System.out.println("odd value");
				System.out.println(no);
			}
			i--;
			
		}

		System.out.println();
		System.out.println(sum);
	}

}
