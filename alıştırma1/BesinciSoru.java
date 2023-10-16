package alıştırma1;

import java.util.Scanner;

public class BesinciSoru {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = sc.nextInt();
        
        System.out.print("Girdiğiniz sayinin tersten yazılışı: ");
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
            sayi /= 10;
        }
	}

}
