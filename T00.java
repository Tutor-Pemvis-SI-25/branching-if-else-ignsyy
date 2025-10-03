import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, sisa;

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
            System.out.println("Bilangan kedua : Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (a == b) {
            System.out.println("kedua bilangan sama besar");
        } else {
            if (a > b) {
                System.out.println("Bilangan pertama lebih besar");
            } else {
                System.out.println("Bilangan kedua lebih besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println(" Hasil penjumlahan: " + a + b);
        } else {
            if (a % 2 != 0 && b % 2 != 0) {
                System.out.println(" Hasil perkalian: " + a * b);
            } else {
                if (a % 2 != 0 && b % 2 == 0) {
                    System.out.println("Berbeda Jenis");
                } else {
                    if (a % 2 == 0 && b % 2 != 0) {
                        System.out.println("Berbeda Jenis");
                    }
                }
            }
        }
    }
}
