package uygulama;

public class Test {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(8);
		a1.eat();
		a1.walk();
		System.out.println("-------------------");
		Spider a2 = new Spider(8);
		a2.eat();
		a2.yaz();
		System.out.println("-------------------");
		Cat a3 = new Cat(4, "Sezar");
		a3.eat();
		a3.yaz();
		a3.play();
		System.out.println("--------------------");
		Fish a4 = new Fish(0, "Hamza");
		a4.eat();
		a4.yaz();
		a4.play();
		
	}

}
