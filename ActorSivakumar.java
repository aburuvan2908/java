package tamilnadu.erode;

public class ActorSivakumar implements Actor {
	int age = 65;
	String car = "Audicar";
	static String address = "coimbatore";
	

	public ActorSivakumar(int age, String car) {
		this.age = age;
		this.car = car;
		System.out.println("sivakumar age is ="+age);
		System.out.println("sivakumar car is ="+car);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ActorSivakumar as = new ActorSivakumar(65,"Audi car");
		Actor ac = new ActorSivakumar(65,"audicar");
		System.out.println("boolean="+makeUpRequired);
		System.out.println("address="+address);
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		System.out.println("Actorsivakumar.address");

	}
	public void  speaking()
	{
		System.out.println("speak");
	}
	public void act()
	{
		System.out.println("acting");
		
	}
	public void dance()
	{
		System.out.println("dance");
		
	}
	public void  sing()
	{
		System.out.println("singing");
	}

}
