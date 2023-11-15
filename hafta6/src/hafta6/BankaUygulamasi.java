package hafta6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankaUygulamasi {
    public static void main(String[] args) {
        ArrayList<String> kullaniciAdlari = new ArrayList<>();
        ArrayList<String> sifreler = new ArrayList<>();
        ArrayList<Double> bakiyeler = new ArrayList<>();
        int kullaniciIndex = -1;
        LocalDate zaman = LocalDate.now();
        
        kullaniciAdlari.add("k1");
        sifreler.add("s1");
        bakiyeler.add(1000.0);
        
        kullaniciAdlari.add("k2");
        sifreler.add("s2");
        bakiyeler.add(1500.0);
        
        kullaniciAdlari.add("k3");
        sifreler.add("s3");
        bakiyeler.add(2000.0);
        
        Scanner sc = new Scanner(System.in);
        boolean girisYapildi = false;
        
        while (true) {
            if (girisYapildi) {
                System.out.println("\nAna Menü:");
                System.out.println("1. Para Yatır");
                System.out.println("2. Para Çek");
                System.out.println("3. Bakiye Görüntüle");
                System.out.println("4. Çıkış");
                
                int secim = sc.nextInt();
                switch (secim) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz miktarı girin: ");
                        double yatirilanMiktar = sc.nextDouble();
                        bakiyeler.set(kullaniciIndex, bakiyeler.get(kullaniciIndex) + yatirilanMiktar);
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz miktarı girin: ");
                        double cekilenMiktar = sc.nextDouble();
                        if (cekilenMiktar <= bakiyeler.get(kullaniciIndex)) {
                            bakiyeler.set(kullaniciIndex, bakiyeler.get(kullaniciIndex) - cekilenMiktar);
                        } else {
                            System.out.println("Yetersiz bakiye!");
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + bakiyeler.get(kullaniciIndex));
                        break;
                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                        girisYapildi = false;
                        continue;
                    default:
                        System.out.println("Geçersiz seçim!");
                }
            } 
            else {
                System.out.print("Kullanıcı adınızı girin: ");
                String kullaniciAdi = sc.next();
                System.out.print("Şifrenizi girin: ");
                String sifre = sc.next();
                
                kullaniciIndex = kullaniciAdlari.indexOf(kullaniciAdi);
                if (kullaniciIndex != -1 && sifreler.get(kullaniciIndex).equals(sifre)) {
                    System.out.print("Giriş başarılı! Hoş geldiniz, " + kullaniciAdi + ".");
                    System.out.println("Giriş Tarihiniz: "+ zaman);
                    girisYapildi = true;
                    
                } else {
                    System.out.println("Geçersiz kullanıcı adı veya şifre. Tekrar deneyin.");
                }
            }
        }
    }
}