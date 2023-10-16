package org.example;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz:");
        int sayi = scanner.nextInt();
        int bolen = 2;
        int bolunen = sayi;
        System.out.println("Asal çarpanlar");
        while (bolen < sayi) {
            if (bolunen % bolen == 0) {
                System.out.println(bolen);
                bolunen /= bolen;

            } else {
                bolen++;
            }
        }

    }
}
