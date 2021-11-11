public class Constructorlearning
{
	public Constructorlearning()
	{
		System.out.println("check");
	}
		public Constructorlearning(String brand)
		{
			System.out.println(brand);
		}
         
	
	public static void main(String[] args)
	{
		Constructorlearning cl1 = new Constructorlearning();
		Constructorlearning cl2 = new Constructorlearning();
		Constructorlearning cl3 = new Constructorlearning("abcd");
		
		
	}
}