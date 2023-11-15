package hafta7;

public class MountainBike extends Bicycle{
	
	protected String süspan;
	
	MountainBike(int pedal, int hiz, int vites, String süspan){
		super(pedal, hiz, vites);
		this.süspan = süspan;
	}

	protected String getSüspan() {
		return süspan;
	}

	protected void setSüspan(String süspan) {
		this.süspan = süspan;
	}
	protected void yaz () {
		super.yaz();
		System.out.println("Süspansiyon: " + getSüspan());
		System.out.println("-----------------------------");
	}

}
