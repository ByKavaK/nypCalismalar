package hafta10;

public class Memur extends Calisan implements Devlet{

	protected String departman, mesai;
	protected int sicil;
	
	public Memur(String adSoyad, int telefon, String email, String departman, String mesai) {
		super(adSoyad, telefon, email);
		this.departman = departman;
		this.mesai = mesai;	
	}

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}

	protected String getMesai() {
		return mesai;
	}

	protected void setMesai(String mesai) {
		this.mesai = mesai;
	}
	
	protected void calis() {
		System.out.println(getAdSoyad()+" Calisti.");
	}
	
	protected void setSicilNo(int sicil) {
		this.sicil = sicil;
	}
	public int getSicilNo() {
		return sicil;
	}
	
	protected void giris() {
		System.out.print(getAdSoyad());
		super.giris();
	}
}
