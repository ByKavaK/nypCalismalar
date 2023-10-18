package alıştırma1;

import java.util.Scanner;

public class IkinciSoru {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int sayi,onbinler,binler,yuzler,onlar,birler;
		
		System.out.println("Bir 5 basamaklı sayı giriniz: ");
		sayi=sc.nextInt();
		
		if(sayi>10000&&sayi<99999) {
			onbinler=sayi/10000;   
			binler=(sayi/1000) %10 ;   
			yuzler=(sayi/100) %10 ;   
			onlar=(sayi/10) %10 ; 
			birler=sayi%10; 
			
			System.out.println("Birler: "+birler);
			System.out.println("Onlar: "+onlar);
			System.out.println("Yüzler: "+yuzler);
			System.out.println("Binler: "+binler);
			System.out.println("Onbinler: "+onbinler);
		}
		else {
			System.out.println("Lütfen 5 basamaklı bir sayı giriniz!");
		}
	}

}
