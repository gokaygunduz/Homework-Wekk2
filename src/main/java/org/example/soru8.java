package org.example;

import java.util.Scanner;

public class soru8 {  // üst üçgeni çizmek için kullanılan kod alt içinse  i değerini 6 dan başlatıp i-- yaparak i>0a kadar.
    public static void main(String[] args) {
        int kenarUzunlugu;
        String nesne;

        Scanner scan = new Scanner(System.in);

        //Üçgenimizin uzunluğunu giriyoruz.
        System.out.print("Uzunluk değerini giriniz = ");
        kenarUzunlugu = scan.nextInt();

        //Ekranda olmasını istediğimiz harf yada nesne giriyoruz.
        System.out.print("Ekrana yazılacak nesne: = ");
        nesne = scan.next();

        //Orta nokta uzunluğunu buluyoruz.
        int ortaNokta = kenarUzunlugu - 1;
        int taban = kenarUzunlugu * 2 - 1; // * sayısı girilen değerin 2 katının 1 eksiği

        // For döngüleriyle girilen nesneyi ekrna yazdırıyoruz.
        for (int i = 0; i < kenarUzunlugu; i++) {
            for (int k = 0; k < taban; k++) {
                if ((i + k == ortaNokta || k - i == ortaNokta)) {
                    System.out.print(nesne);
                } else if ((i + k >= ortaNokta && k - i <= ortaNokta)) {
                    System.out.print("*");
                } else if (i == ortaNokta)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }

}
