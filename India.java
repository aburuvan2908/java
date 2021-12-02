package tamilnadu.erode;

public abstract class India {
	static String captial = "New delhi";

	abstract void speakLanguage();

	abstract void eat();

	abstract void dress();

	public India(String primeMinister) {
		System.out.println("our primeminister is =" + primeMinister);
	}

}
