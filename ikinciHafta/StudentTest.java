package ikinciHafta;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		String ad, soyad, harfNotu;
		double dersOrt;
		int kacOgrenci;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kaç öğrenci girmek istiyosunuz?");
		kacOgrenci = sc.nextInt();
		
		for(int i = 0;i < kacOgrenci;i++) {
			System.out.print("Öğrencinin adını giriniz: ");
            ad = sc.next();
            System.out.print("Öğrencinin soyadını giriniz: ");
            soyad = sc.next();
            System.out.print("Öğrencinin ders ortalamasını giriniz: ");
            dersOrt = sc.nextDouble();

            Student ogrenci = new Student();
            ogrenci.setAdi(ad);
            ogrenci.setSoyAdi(soyad);
            ogrenci.setDersOrtalamasi(dersOrt);

            if (dersOrt <= 100 && dersOrt >= 0) {
                harfNotu = ogrenci.getHarfNotu(dersOrt);
                System.out.println("Harf Notu: " + harfNotu);
            } else {
                System.out.println("Geçersiz ders ortalaması! Lütfen 0 ile 100 arasında bir değer girin.");
                dersOrt = sc.nextDouble();
                ogrenci.setDersOrtalamasi(dersOrt);
            }

            System.out.println((i+1)+". Öğrencinin Bilgileri:");
            ogrenci.show();
            System.out.println();
		}
		
		
	}

}
