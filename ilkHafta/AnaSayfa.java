package ilkHafta;

import java.util.Scanner;

public class AnaSayfa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: ");
		number1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		number2 = sc.nextInt();
		
		if(number1 == number2) {
			System.out.println(number1 + "=" + number2);
		}
		if(number1 != number2) {
			System.out.println(number1 +"!="+number2);
		}
		if(number1<number2) {
			System.out.println(number1 +"<"+ number2);
		}
	}
}