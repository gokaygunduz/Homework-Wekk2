package org.example;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {

        //klavyeden okuma yapmak için scarner nesnesi oluşturulur
        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Saniyeyi giriniz");
        int sure = okuyucu.nextInt();
        System.out.println("girdiginiz saniye" + sure);
    }

    public void displayDuration(long sure) {

        long saat = sure / 3600;
        long dakika = (sure % 3600) / 60;
        long saniye = (sure % 3600) % 60;

        if (saat != 0) {
            System.out.println(saat + " saat");
        }
        if (dakika != 0) {
            System.out.println(dakika + " dakika");
        }
        if (saniye != 0) {
            System.out.println(saniye + " saniye");
        }
    }


}
