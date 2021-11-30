package tamilnadu.erode;
public class SQLTrainer extends Trainer {
	public SQLTrainer(String dept)
	{
		super("CSE","payilagam");
		this.dept=dept;
		this.institute=institute;
		
	}

public static void main(String[] args) {


	SQLTrainer ram = new SQLTrainer("SQL");
	System.out.println("course name is="+ram.dept);
	System.out.println("institute name is ="+ram.institute);
	ram.training();
	ram.getsalary();
	System.out.println(ram.getsalary());
}
}
