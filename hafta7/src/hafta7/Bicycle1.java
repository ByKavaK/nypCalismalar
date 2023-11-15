package hafta7;

public class Bicycle1 implements Vehicle{
	
	int speed;
	int gear;
	
	@Override
	public void changeGear(int a) {
		gear = a;
	}

	@Override
	public void speedUp(int a) {
		speed += a;
	}

	@Override
	public void applyBreak(int a) {
		speed -= a;
	}
	
	protected void yaz() {
		System.out.println("Hız: " + speed);
		System.out.println("Vites: " + gear);
	}

}
