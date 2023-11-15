package uygulama;

public class Cat extends Animal implements Pet{
	
	protected String name;
	
	public Cat(int legs, String name) {
		super(legs);
		this.name = name;
	}
	
	public void Cat() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void play() {
		System.out.println("Kediler Kuyruklarıyla Oynar.");
	}
	
	public void eat() {
		System.out.println("Kediler Ne Bulursa Yer.");
	}
	
	public void yaz() {
		System.out.println("Kedinin İsmi: " + getName());
		System.out.println("Kedinin Bacakları: " + legs);
	}

}
