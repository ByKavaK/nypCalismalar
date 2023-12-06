package hafta10;

public class Test {

	public static void main(String[] args) {

		OgretimGor o = new OgretimGor("Yasin Kavak", 5555, "y@ibu.edu.tr", "Bilgisayar Mühendisliği", "Hoca", "OOP Java", "Doç.Dr.");
		o.derseGir();
		o.giris();
		o.setSicilNo(1122);
		System.out.println(o.getAdSoyad()+" sicil numarası: "+o.getSicilNo());
		
		VeriHazirlama v = new VeriHazirlama("Ali Veli", 5555, "v@ibu.edu.tr", "Yazı İşleri", "Gündüz", "Veri Hazırlama Memuru");
		v.yazisma();
		
	}

}
