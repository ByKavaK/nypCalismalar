package hafta7;

public class RoadBike extends Bicycle{
	
	protected int lastik;
	
	RoadBike(int pedal, int hiz, int vites, int lastik){
		super(pedal, hiz, vites);
		this.lastik = lastik;
	}

	protected int getLastik() {
		return lastik;
	}

	protected void setLastik(int lastik) {
		this.lastik = lastik;
	}
	
	protected void yaz() {
		super.yaz();
		System.out.println("Lastik Çapi: " + getLastik());
		System.out.println("-----------------------------");
	}

}
