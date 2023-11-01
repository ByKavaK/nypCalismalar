package besinciHafta;
import java.util.ArrayList;
import java.util.Scanner;

public class uyg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sorular = new ArrayList<>();
        ArrayList<String> şıklar = new ArrayList<>();
        ArrayList<String> cevaplar = new ArrayList<>();
        int dogruCevapSayisi = 0;
        int yanlisCevapSayisi = 0;

        sorular.add("Hangi ülke en çok sera gazı yaymaktadır?");
        sorular.add("Hangi gezegenin atmosferi küresel ısınma ile yok edilmektedir?");
        sorular.add("Hangi tür ampul en az enerjiyi tüketir?");
        sorular.add("İklim değişikliği nedeniyle yılda kaç kişi ölmektedir?");
        sorular.add("Küresel ısınmaya karşı en savunmasız hayvan hangisidir?");

        şıklar.add("Çin");
        şıklar.add("Hindistan");
        şıklar.add("Amerika");
        şıklar.add("Japonya");
        şıklar.add("Jüpiter");
        şıklar.add("Venüs");
        şıklar.add("Mars");
        şıklar.add("Merkür");
        şıklar.add("Akkor Ampul");
        şıklar.add("Halojen Ampul");
        şıklar.add("Kompakt Floresan Ampul");
        şıklar.add("Led Ampul");
        şıklar.add("1500");
        şıklar.add("100.000");
        şıklar.add("150.000");
        şıklar.add("500.000");
        şıklar.add("Kar Leoparı");
        şıklar.add("Kutup Ayısı");
        şıklar.add("Deniz Gergedanı");
        şıklar.add("Tukan");

        
        String[] dogruCevaplar = {"A", "B", "LC", "C", "C"};

        for (int i = 0; i < sorular.size(); i++) {
            System.out.println(sorular.get(i));
            for (int j = 0; j < 4; j++) {
                int index = i * 4 + j;
                System.out.println((char) ('A' + j) + ") " + şıklar.get(index));
            }
            System.out.print("Cevabınızı girin (A/B/C/D): ");
            String cevap = sc.next().toUpperCase();
            cevaplar.add(cevap);
        }

        for (int i = 0; i < sorular.size(); i++) {
            String cevap = cevaplar.get(i);
            String dogruCevap = dogruCevaplar[i];
            if (cevap.equalsIgnoreCase("A")) {
                dogruCevapSayisi++;
            } else if (cevap.equalsIgnoreCase("B")) {
                dogruCevapSayisi++;
            } else if (cevap.equalsIgnoreCase("C")) {
                dogruCevapSayisi++;
            } else if (cevap.equalsIgnoreCase("C")) {
                dogruCevapSayisi++;
            } else if(cevap.equalsIgnoreCase("C")){
                dogruCevapSayisi++;
            }
            else {
            	yanlisCevapSayisi++;
            }
        }

        System.out.println("Doğru Cevap Sayısı: " + dogruCevapSayisi);
        System.out.println("Yanlış Cevap Sayısı: " + yanlisCevapSayisi);
    }
}
