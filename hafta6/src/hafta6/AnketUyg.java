package hafta6;

import java.util.ArrayList;
import java.util.Scanner;

public class AnketUyg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] konular = {
	            "Eğitim",
	            "Askeri",
	            "Siyaset",
	            "Sağlık",
	            "Ekonomi"
	        };
		
		ArrayList<int[]> kullaniciYanitlari = new ArrayList<>();
		
		while(true) {
			int[] yanitlar = new int[konular.length];
			for(int i = 0;i < konular.length; i++) {
				System.out.println("Lütfen " + konular[i] + " konusunu 1 ile 10 arasında derecelendirin:");
				int derece = sc.nextInt();
				yanitlar[i] = derece;
			}
			kullaniciYanitlari.add(yanitlar);
			
			System.out.println("Başka bir kullanıcının yanıtını girmek ister misiniz? (Evet/Hayır)");
            String devam = sc.next();
            if (!devam.equalsIgnoreCase("Evet")) {
                break;
            }
		}
		
		System.out.println("\n(a) Alınan Derecelendirmelerin Sayısı:");
		int[][] sayilar = new int[konular.length][10];
        for (int i = 0; i < kullaniciYanitlari.size(); i++) {
            int[] yanitlar = kullaniciYanitlari.get(i);
            for (int j = 0; j < konular.length; j++) {
                int derece = yanitlar[j];
                sayilar[j][derece - 1]++;
            }
        }
        for (int i = 0; i < konular.length; i++) {
            System.out.print(konular[i] + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(sayilar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n(b) Ortalama Derecelendirme:");
        double[] ortalamaDerecelendirmeler = new double[konular.length];
        for (int i = 0; i < konular.length; i++) {
            double toplam = 0;
            for (int j = 0; j < kullaniciYanitlari.size(); j++) {
                toplam += kullaniciYanitlari.get(j)[i];
            }
            ortalamaDerecelendirmeler[i] = toplam / kullaniciYanitlari.size();
            System.out.println(konular[i] + ": " + ortalamaDerecelendirmeler[i]);
        }
        int enYuksekPuan = 0;
        int enYuksekPuanKonuIndex = -1;
        for (int i = 0; i < konular.length; i++) {
            if (ortalamaDerecelendirmeler[i] > enYuksekPuan) {
                enYuksekPuan = (int) ortalamaDerecelendirmeler[i];
                enYuksekPuanKonuIndex = i;
            }
        }
        System.out.println("\n(c) En Yüksek Puan Alan Konu: " + konular[enYuksekPuanKonuIndex] + " - Toplam Puan: " + enYuksekPuan);
        int enDusukPuan = 10;
        int enDusukPuanKonuIndex = -1;
        for (int i = 0; i < konular.length; i++) {
            if (ortalamaDerecelendirmeler[i] < enDusukPuan) {
                enDusukPuan = (int) ortalamaDerecelendirmeler[i];
                enDusukPuanKonuIndex = i;
            }
        }
        System.out.println("(d) En Düşük Puan Alan Konu: " + konular[enDusukPuanKonuIndex] + " - Toplam Puan: " + enDusukPuan);
        
        if (enDusukPuanKonuIndex != -1) {
            switch (enDusukPuanKonuIndex) {
                case 0:
                    System.out.println("Eğitim Konusu Geliştirilmeli.");
                    break;
                case 1:
                    System.out.println("Askeri Okullar Geliştirilmeli.");
                    break;
                case 2:
                    System.out.println("Siyasetçiler Biraz Daha Genç Olmalı.");
                    break;
                case 3:
                    System.out.println("Sağlık Konusunda Temizlik Önemlidir.");
                    break;
                case 4:
                    System.out.println("Ekonomik Konusuna Daha Çözüm Bulan Olmadı.");
                    break;
                default:
                    break;
            }
        }
    }

	}