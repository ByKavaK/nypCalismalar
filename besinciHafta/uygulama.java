package besinciHafta;

import java.util.Scanner;

public class uygulama {

	private static Scanner input;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sorular= {
			"1. Hangi ülke en çok sera gazı yaymaktadır?",
			"2. Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?",
			"3. Hangi tür ampul en az enerjiyi tüketir?",
			"4. İklim değişikliği nedeniyle yılda kaç kişi ölmektedir?",
			"5. Küresel ısınmaya karşı en savunmasız hayvan hangisidir?"	
		};
		
		String[][] şiklar= {
				{"A)Çin" , "B)Hindistan" , "C)Amerika" , "D)Japonya"},
				{"A)Jüpiter" , "B)Venüs" , "C)Mars" , "D)Merkür"},
				{"A)Akkor Ampul" , "B)Halojen Ampul" , "C)Kompakt Floresan Ampul" ,"D)Led Ampul"},
				{"A)1500" , "B)100.000" , "C)150.000" , "D)500.000"},
				{"A)Kar Leoparı" , "B)Kutup Ayısı" , "C)Deniz Gergedanı" , "D)Tukan"},
		};
		
		char[] dogrucevaplar= {'A' , 'B' , 'C' ,'C' , 'C',};
		
		int dogrusayisi= 0;
		
		for(int i=0; i < sorular.length; i++) {
			System.out.println(sorular[i]);
			for(String şik: şiklar[i]) {
				System.out.println(şik);
			}
			System.out.println("Cevabınızı girin:");
			char cevap= sc.next().toUpperCase().charAt(0);
			if(cevap == dogrucevaplar[i]) {
				dogrusayisi++;
			}
		}
		
		System.out.println("Doğru cevap sayısı:" + dogrusayisi);
		
		if(dogrusayisi == 5) {
			System.out.println("Mükemmel");
		}else if (dogrusayisi == 4) {
			System.out.println("Çok iyi");
		}else if (dogrusayisi == 3 || dogrusayisi== 2 || dogrusayisi== 1 || dogrusayisi == 0) {
			System.out.println("Küresel ısınma hakkındaki bilgilerinizi tazeleme zamanı");
		}
			
		
		
	};

}