package org.example;

import java.util.Scanner; // sayı almak için scanner kütüphanesini dahil ediyoruz

public class soru5 {
    public static void main(String[] args) {
        Scanner klayve = new Scanner(System.in);
        System.out.println("a sayiyisini giriniz: "); // kullanıcıdanan  ilk sayıyın girilmesi istenir
        int a = klayve.nextInt(); // kullanıcıdan girilen değer integer a olarak atanır.
        System.out.println("b sayıyısini giriniz ");// kullanıcıdan ikinci sayı girilmesi istenir
        int b = klayve.nextInt(); // kullanıcının girdiği 2. değer integer b olarak atanır ve saklanır.
        System.out.println("c  sayıyısini  giriniz"); //  kullanıcıdan son sayının girilmesi istenir
        int c = klayve.nextInt(); // kullanıcının girdiği 3. değerde c dir.
        if (a >= b) {
            if (b >= c)
                System.out.print("üç sayının sıralaması: a>=b>=c");
            else if (c >= a)
                System.out.print("üç sayının sıralaması: c>=a>=b");
            else if (a > c)
                System.out.print("üç sayının sıralaması: a>=b>c");
        }
        if (b > a) {
            if (c >= b)
                System.out.print("üç sayının sıralaması: c>=b>a");
            else if (c >= a)
                System.out.print("üç sayının sıralaması: b>c>=a");
            else if (a > c)
                System.out.print("üç sayının sıralaması:b>a>c");
        }


    }
}
    /* normalde yapılması gereken soru 5 teki if else değerlerini mid = ortanca değeri atayıp her bir if else den sonra
    mid = ortanca değer yazıp sonunda return mid yapmak lazım ama kodu yazdığımda bir hata verdi hatayı bulamadım bende
    kullanıdan alınan değil 3 tane değerin ortancasını yazdıran kodu yazdım */













