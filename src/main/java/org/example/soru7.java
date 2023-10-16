package org.example;

import java.util.Scanner;

public class soru7 {
    public static int main(String[] args) {
        Scanner okuyucu = new Scanner(System.in);
        System.out.print("Bir sayı giriniz ");
        int sayi = okuyucu.nextInt();
        // sayı 0 dan küçükse negatif
        if (sayi < 0) {
            System.out.println(sayi + " negatiftir");
            return -1;
            // sayı 0 dan büyükse pozitif
        } else if (sayi > 0) {


            System.out.println(sayi + "pozitiftir");

            return 1;
            // sayı 0'a eşit ise
        } else
            System.out.println(sayi + "sıfırdır");

        return 0;

    }
}
