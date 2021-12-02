package tamilnadu.erode;

import java.util.Scanner;

public class Aburuvan {

	public static void main(String[] args) {
		System.out.println("what is your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("age");
		Scanner ag = new Scanner(System.in);
		int a = ag.nextInt();
		System.out.println("are you in india");
		Scanner in = new Scanner(System.in);
		String mi = in.next();

		System.out.println("welcome" + name);
		System.out.println("your door number");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();

		System.out.println("weight");
		Scanner sc2 = new Scanner(System.in);
		float j = sc2.nextFloat();
		System.out.println("height");
		Scanner he = new Scanner(System.in);
		float height = he.nextFloat();
		float bmi = j / height;
		System.out.println("BMI" + bmi);

	}

}
