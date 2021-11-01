public class Bakery
{
static String bakery_name = "abu";
int doorNo =4;
	int price;
public static void main(String[] args)
{
Bakery cake = new Bakery();
	cake.price=100;
Bakery cooldrinks = new Bakery();
	cooldrinks.price=200;
Bakery vadai = new Bakery();
	vadai.price=6;
Bakery bonda = new Bakery();
	
	System.out.println(bakery_name );
	System.out.println(cake.price);
	System.out.println(cooldrinks.price);
	System.out.println(vadai.price);
}

}