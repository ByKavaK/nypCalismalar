package alıştırma1;

import java.util.Scanner;

public class DorduncuSoru {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double yariCap;
		double alan;
		double pi = 3.14159;
		
		System.out.print("Yarıçapı Giriniz: ");
		yariCap = sc.nextDouble();
		
		alan = pi*(yariCap*yariCap);
		
		System.out.println("Dairenizin Alanı: "+ alan);

	}

}
