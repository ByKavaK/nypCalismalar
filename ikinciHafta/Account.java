package ikinciHafta;

public class Account {
	
	String adi, soyAdi;
	int para;
	public Account(String adi, String soyAdi, int para) {
		super();
		this.adi = adi;
		this.soyAdi = soyAdi;
		this.para = para;
	}
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
	public int getPara() {
		return para;
	}
	private void setPara(int para) {
		this.para = para;
	}
	public void bakiye(int a) {
		this.para = this.para + a;
		setPara(this.para);
	}
	
}
