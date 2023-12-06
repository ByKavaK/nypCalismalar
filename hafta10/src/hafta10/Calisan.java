package hafta10;

public class Calisan {
	protected String adSoyad;
	protected int telefon;
	protected String email;
	
	public Calisan(String adSoyad, int telefon, String email) {
		this.adSoyad = adSoyad;
		this.telefon = telefon;
		this.email = email;
	}
	
	protected String getAdSoyad() {
		return adSoyad;
	}
	
	protected void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	
	protected int getTelefon() {
		return telefon;
	}

	protected void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected void giris()
	{
		System.out.println(" Giris Yapti");
	}
	
	protected void cikis()
	{
		System.out.println(" Cikis Yapti");
	}
	
	protected void yemek()
	{
		System.out.println(" Yemek Yedi");
	}
}
