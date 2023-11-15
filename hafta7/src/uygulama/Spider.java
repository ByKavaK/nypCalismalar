package uygulama;

public class Spider extends Animal{

	protected Spider(int legs) {
		super(legs);
	}
	
	public void eat() {
		System.out.println("Örümcekler Et Yer.");
	}
	public void yaz() {
		System.out.println("Örümceğin Bacaklar: " + legs);
	}

}
