package tamilnadu.erode;

public class Pattern12 {

	public static void main(String[] args) {
		int end =4;
		int star = 0;
		for(int row=1;star<=end;star++)
		{
			for(int star1=1;star1<=end;star1++)
			{
				System.out.print("  ");
				
			}
			for(int no =1;no<=row;no++)
			{
				System.out.print(no+"");
			}
			System.out.println();
			end--;
		}

	}

}
