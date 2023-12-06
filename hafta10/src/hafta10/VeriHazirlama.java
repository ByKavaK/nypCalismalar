package hafta10;

public class VeriHazirlama extends Memur{
	
	protected String gorev;

	public VeriHazirlama(String adSoyad, int telefon, String email, String departman, String mesai, String gorev) {
		super(adSoyad, telefon, email, departman, mesai);
		this.gorev = gorev;
	}
	
	protected String getGorev() {
		return gorev;
	}

	protected void setGorev(String gorev) {
		this.gorev = gorev;
	}

	protected void yazisma() {
		System.out.println(getGorev()+" "+getAdSoyad()+" yazisma yapar.");
	}
}
