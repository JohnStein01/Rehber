import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rehber {
    public static void main(String[] args) {

        List<Kisi> liste = new ArrayList<>();

        int tamamDevam = 2;

        do {

            Scanner scan = new Scanner(System.in);
            System.out.println("Kaç numaralı kullanıcısın? 1 mi 2 mi?");
            int num = scan.nextInt();

            if (num == 1) {
                Scanner scanSelect = new Scanner(System.in);
                System.out.println("Seçiniz:  1-Kullanıcı Ekle    2-Listele     3-Güncelle    4-Sil");
                int numSelect = scanSelect.nextInt();

                if (numSelect == 1) {
                    Kisi yeniKisi = new Kisi();

                    System.out.println("Adınızı Girin");
                    Scanner scanAd = new Scanner(System.in);
                    String ad = scanAd.next();
                    yeniKisi.setAd(ad);

                    System.out.println("Soyadınızı Girin");
                    Scanner scanSoyad = new Scanner(System.in);
                    String soyad = scan.next();
                    yeniKisi.setSoyad(soyad);

                    System.out.println("Telefon Numaranızı Girin");
                    Scanner scanTel = new Scanner(System.in);
                    Long tel = scanTel.nextLong();
                    yeniKisi.setPhone(tel);

                    liste.add(yeniKisi);
                } else if (numSelect == 2) {
                    for (int i = 0; i < liste.size(); i++) {

                        System.out.println("Ad:" + liste.get(i).getAd() + " Soyad:" + liste.get(i).getSoyad() + " Tel:" + liste.get(i).phone);

                    }
                } else if (numSelect == 3) {
                    System.out.println("Kaç numarayı güncelliceksiniz?");
                    Scanner scanGuncelle = new Scanner(System.in);
                    int numGuncelle = scanGuncelle.nextInt();

                    Kisi yeniKisi = liste.get(numGuncelle);

                    System.out.println("Adınızı Girin");
                    Scanner scanAd = new Scanner(System.in);
                    String ad = scanAd.next();
                    yeniKisi.setAd(ad);

                    System.out.println("Soyadınızı Girin");
                    Scanner scanSoyad = new Scanner(System.in);
                    String soyad = scan.next();
                    yeniKisi.setSoyad(soyad);

                    System.out.println("Telefon Numaranızı Girin");
                    Scanner scanTel = new Scanner(System.in);
                    Long tel = scanTel.nextLong();
                    yeniKisi.setPhone(tel);

                } else if (numSelect == 4) {
                    System.out.println("Kaç numarayı sileceksiniz?");
                    Scanner scanSil = new Scanner(System.in);
                    int numSil = scanSil.nextInt();

                    liste.remove(numSil);
                } else
                    System.out.println("Yanlış Numara");
            } else if (num == 2) {
                for (int i = 0; i < liste.size(); i++) {

                    System.out.println("Ad:" + liste.get(i).getAd() + " Soyad:" + liste.get(i).getSoyad() + " Tel:" + liste.get(i).phone);

                }
            } else
                System.out.println("Yanlış bir numara seçtiniz");

do {
    System.out.println("Tamam için 1 devam için 2");
    Scanner scanTamam = new Scanner(System.in);
    tamamDevam = scanTamam.nextInt();
}
while(!(tamamDevam==1||tamamDevam==2));

        }
        while(tamamDevam==2);

        }



    }


