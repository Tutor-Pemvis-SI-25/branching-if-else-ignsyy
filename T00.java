import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, sisa, hP, hK;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        sisa = a % 2;
        if (sisa == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        sisa = b % 2;
        if (sisa == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (a == b) {
            System.out.println("Kedua bilangan sama besar");
        } else {
            if (a > b) {
                System.out.println("Bilangan pertama lebih besar");
            } else {
                System.out.println("Bilangan kedua lebih besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            hP = a + b;
            System.out.println("Hasil penjumlahan: " + hP);
        } else {
            if (a % 2 != 0 && b % 2 != 0) {
                hK = a * b;
                System.out.println("Hasil perkalian: " + hK);
            } else {
                if (a % 2 != 0 && b % 2 == 0) {
                    System.out.println("Berbeda jenis");
                } else {
                    if (a % 2 == 0 && b % 2 != 0) {
                        System.out.println("Berbeda jenis");
                    }
                }
            }
        }
    }
}
