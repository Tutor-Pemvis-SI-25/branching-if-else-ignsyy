import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, total, tambah, kali;

        System.out.println("Input bilangan 1 : ");
        bil1 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        System.out.println("Input bilangan 2 : ");
        bil2 = Integer.parseInt(input.nextLine());
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (bil1 > bil2) {
            if (bil1 == bil2) {
                System.out.println("Kedua bilangan sama besar");
            } else {
                System.out.println("Bilangan pertama lebih besar");
            }
        } else {
            System.out.println("Bilangan kedua lebih besar");
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            tambah = bil1 + bil2;
            System.out.println("Hasil penjumlahan: " + tambah);
        } else {
            if (bil1 % 2 != 0 && bil2 % 2 != 0) {
                kali = bil1 * bil2;
                System.out.println("Hasil perkalian: " + kali);
            } else {
                if (bil1 % 2 == 0 && bil2 % 2 != 0) {
                    System.out.println("Kedua bilangan sama besar");
                } else {
                    if (bil1 % 2 != 0 && bil2 % 2 == 0) {
                        System.out.println("Kedua bilangan sama besar");
                    }
                }
            }
        }
    }
}
