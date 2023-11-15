package hafta7;

public class Test {

	public static void main(String[] args) {
		
		Bicycle bike1 = new Bicycle(30, 40, 18);
		bike1.yaz();

		MountainBike bike2 = new MountainBike(25, 20, 24, "Dual");
		bike2.yaz();
		
		RoadBike bike3 = new RoadBike(30, 50, 24, 27);
		bike3.yaz();
		
		System.out.println(bike2.getPedal());
		
		Bicycle bike4 = new MountainBike(25, 20, 24, "Dual");
		bike4.yaz();
		
	}

}
