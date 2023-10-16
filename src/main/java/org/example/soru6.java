package org.example;

public class soru6 {
    public static int mid(int a, int b, int c) {
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            return a; //ortanca değer a
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            return b; // ortanca değer b
        } else {
            return c; // ortanca değer c
        }
    }

    public static void main(String[] args) {
        int s1 = 27;
        int s2 = 118;
        int s3 = 73;
        int midDeger = mid(s1, s2, s3);
        System.out.println("Ortancası: " + midDeger);
    }
}
