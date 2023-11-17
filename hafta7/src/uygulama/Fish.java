package uygulama;

public class Fish extends Animal implements Pet{
	
	public String name;

	public Fish(int legs, String name) {
		super(legs);
		this.name = name;
	}
	
	public Fish(int legs) {
		super(legs);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Balıklar Balıklarla Oynar.");
	}
	
	public void walk() {
		System.out.println("Balıklar Yüzer.");
	}
	public void eat() {
		System.out.println("Balıklar Et Yer.");
	}
	
	public void yaz() {
		System.out.println("Balığın İsmi: " + getName());
		System.out.println("Balığın Bacakları: " + legs);
	}

}
