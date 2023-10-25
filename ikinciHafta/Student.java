package ikinciHafta;

public class Student {
	
	String adi, soyAdi;
	double dersOrtalamasi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyAdi() {
		return soyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}

	public double getDersOrtalamasi() {
		return dersOrtalamasi;
	}

	public void setDersOrtalamasi(double dersOrtalamasi) {
		this.dersOrtalamasi = dersOrtalamasi;
	}
	
	public String getHarfNotu(double dersOrt) {
		this.dersOrtalamasi = dersOrt;
		if(dersOrt >= 90) {
			return "Harf Notu A";
		}
		else if(dersOrt >= 80) {
			return "Harf Notu B";
		}
		else if(dersOrt >= 70) {
			return "Harf Notu C";
		}
		else if(dersOrt >= 60) {
			return "Harf Notu D";
		}
		else {
			return "Harf Notu F";
		}
	}
	public void show() {
		System.out.println("Öğrencinin Adı: " + adi);
		System.out.println("Öğrencinin SoyAdı: "+ soyAdi);
		System.out.println("Öğrencinin Ders Ortalaması: "+ dersOrtalamasi);
		System.out.println("Öğrencinin Harf Notu: "+ getHarfNotu(dersOrtalamasi));
	}
	
	

}
