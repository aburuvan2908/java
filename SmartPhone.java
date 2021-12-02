package tamilnadu.erode;

public abstract class SmartPhone {
 abstract int call(int seconds);

	public abstract void sendMessage();

	public abstract void receiveCall();

	public void browse() {
		System.out.println("SmartPhone browsing");
	}

	public SmartPhone() {
		System.out.println("SmartPhone under development");
	}
}