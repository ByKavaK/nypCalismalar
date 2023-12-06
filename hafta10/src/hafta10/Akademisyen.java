package hafta10;

public class Akademisyen extends Calisan implements Devlet{
	
	protected String bolum, gorev, dersler;
	protected int sicil;

	protected Akademisyen(String adSoyad, int telefon, String email, String bolum, String gorev, String dersler) {
		super(adSoyad, telefon, email);
		this.bolum = bolum;
		this.gorev = gorev;
		this.dersler = dersler;
	}

	protected String getBolum() {
		return bolum;
	}

	protected void setBolum(String bolum) {
		this.bolum = bolum;
	}

	protected String getGorev() {
		return gorev;
	}

	protected void setGorev(String gorev) {
		this.gorev = gorev;
	}

	protected String getDersler() {
		return dersler;
	}

	protected void setDersler(String dersler) {
		this.dersler = dersler;
	}
	
	protected void setSicilNo(int sicil) {
		this.sicil = sicil;
	}
	
	public int getSicilNo() {
		return sicil;
	}

	protected void derseGir()
	{
		System.out.print(" Derse Girdi");
	}
	
	protected void giris()
	{
		System.out.println(getAdSoyad());
		super.giris();
	}
}
