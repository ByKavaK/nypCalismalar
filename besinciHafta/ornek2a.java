package besinciHafta;

import java.util.Scanner;

public class ornek2a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] yanitlar = new int[20];
		
		int[] dereceler = new int[5];
		
		for(int i = 0; i < yanitlar.length; i++) {
			System.out.println("Yemekhane için 1-5 arasında puan giriniz!");
			yanitlar[i] = sc.nextInt();
		}
		 for (int i = 0; i < dereceler.length; i++) {
	            int derece = i + 1; 
	            int count = dereceler[i]; 
	            System.out.println("Derece " + derece + ": " + count + " yanıt");
	        }

	}

}
