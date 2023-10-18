package alıştırma1;

import java.util.Scanner;

public class UcuncuSoru {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kilo;
		double boy;
		double bmi;
		
		System.out.print("Enter your kilo: ");
		kilo = sc.nextInt();
		System.out.print("Enter your size (cm): ");
		boy = sc.nextDouble();
		
		boy /=100;
		bmi = kilo/(boy*boy);
		
		if(bmi < 18.5) {
			System.out.println("ZAYIF");
		}
		else if(bmi > 18.5 && bmi < 24.9) {
			System.out.println("NORMAL");
		}
		else if(bmi > 24.9 && bmi < 29.9) {
			System.out.println("ŞİŞMAN");
		}
		else if(bmi > 30) {
			System.out.println("OBEZ");
		}
	}

}
