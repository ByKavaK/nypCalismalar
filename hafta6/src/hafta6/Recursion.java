package hafta6;

public class Recursion {

	public static void main(String[] args) {
		int sonuc = sum(5);
		System.out.println("Sonuc: "+sonuc);

	}
	public static int sum (int k) {
		if(k > 0)
			return k + sum(k-1);
		else
			return 0;
	}

}
