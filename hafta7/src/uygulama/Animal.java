package uygulama;

public class Animal{
	
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Yürür.");
	}
	
	public void eat() {
		System.out.println("Hayvanlar Yemek Yer.");
	}
}
