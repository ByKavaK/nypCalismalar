package hafta10;

public class OgretimGor extends Akademisyen{
	protected String unvan;
	
	protected OgretimGor(String adSoyad, int telefon, String email, String bolum, String gorev, String dersler, String unvan) {
		super(adSoyad, telefon, email, bolum, gorev, dersler);
		this.unvan = unvan;
	}

	protected String getUnvan() {
		return unvan;
	}

	protected void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	protected void derseGir()
	{
		System.out.print(getUnvan()+" "+getAdSoyad()+" "+getDersler());
		super.derseGir();
	}
	
	
}
