package tamilnadu.erode;

public class Trainer {
	String dept = "java", institute = "payilagam";
	private int salary = 10000;

	public Trainer(String dept, String insitute) {
		this.dept = dept;
		this.institute = institute;
		System.out.println("deptname="+dept);
		System.out.println("institute="+institute);

	}

	public int getsalary() {
		return this.salary;

	}

	public void training() {
		System.out.println("training");

	}

	public static void main(String[] args) {
		Trainer trainerkumar = new Trainer("CSE","Payilagam");
		

	}

}
