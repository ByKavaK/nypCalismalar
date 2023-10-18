package alıştırma1;

import java.util.Scanner;

public class IlkSoru {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double number1;
		double number2;
		double sum;
		double fark;
		double carpim;
		double bolum;
		
		System.out.print("Enter first number: ");
		number1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		number2 = sc.nextDouble();
		
		sum = number1 + number2;
		fark = number1 - number2;
		carpim = number1 * number2;
		bolum = number1 / number2;

		System.out.println(sum);
		System.out.println(fark);
		System.out.println(carpim);
		System.out.println(bolum);
	}

}
