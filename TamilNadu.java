package tamilnadu.erode;

public class TamilNadu extends SouthIndia{

	public TamilNadu(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SouthIndia si = new TamilNadu("modi");
		si.cultivate();
		si.dress();
		si.eat();
		si.speakLanguage();
		si.livingStyle();

	}

	@Override
	void speakLanguage() {
		System.out.println("tamil");
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		System.out.println("rise");
		// TODO Auto-generated method stub
		
	}

	@Override
	void dress() {
		System.out.println("cotton");
		// TODO Auto-generated method stub
		
	}

}
