public class Eshop
{
int price;
	private String profit = "30%";
	private void profit()
{

System.out.println(profit);
}

public Eshop()
{
System.out.println(" Dec 31 -500/-- offer");
}
public Eshop(int price)
{
this();
this.price = price;
System.out.println("your bill is "+ price );
}
public static void main(String[] args)
{
Eshop tv = new Eshop (10000);
Eshop fridge = new Eshop (20000);
Eshop enquiry = new Eshop();
	tv.purchase(1000);
	fridge.purchase();
	tv.profit();
}
public void purchase(int discount)
{
	System.out.println(discount);
}
	public void purchase()
	{
		System.out.println(" no dicounts");
	}
}


