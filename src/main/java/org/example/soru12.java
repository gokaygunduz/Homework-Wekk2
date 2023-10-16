package org.example;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir çift sayı girin: "); // kullancıdan alınan çift sayı değeri
        int n = scanner.nextInt();
        scanner.close();

        if (n < 4 || n % 2 != 0) {
            System.out.println("Geçersiz giriş! Lütfen çift bir sayı girin.");
        } else {
            boolean found = false;
            for (int i = 2; i <= n / 2; i++) {
                if (isAsal(i) && isAsal(n - i)) {
                    System.out.printf("%d = %d + %d", n, i, n - i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Verilen şartlara uygun iki asal sayı yoktur.");
            }
        }
    }

    public static boolean isAsal(int sayi) {
        if (sayi < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }


}
