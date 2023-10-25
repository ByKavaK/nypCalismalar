package ikinciHafta;

public class AnaSayfa {

	public static void main(String[] args) {
		
		Account person1 = new Account("Yasin", "KAVAK", 500);
		Account person2 = new Account("Ali", "Cabbar", 100);
		
		System.out.println("İlk insanın adı: " + person1.getAdi());
		System.out.println("İlk insanın soyadı: " + person1.getSoyAdi());
		System.out.println("İkinci insanın adı: "+ person2.getAdi());
		System.out.println("İkinci insanın soyadı: "+ person2.getSoyAdi());
		//person1.setPara(900);
		System.out.println(person1.getPara());
		
		person1.bakiye(100);
		System.out.println(person1.getPara());
	}

}
