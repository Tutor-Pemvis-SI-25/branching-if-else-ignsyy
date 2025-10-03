import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, total, tambah, kali;

        System.out.println("Input bilangan 1 : ");
        bil1 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("Merupakan bilangan genap");
        } else {
            System.out.println("Merupakan bilangan ganjil");
        }
        System.out.println("Input bilangan 2 : ");
        bil2 = Integer.parseInt(input.nextLine());
        if (bil2 % 2 == 0) {
            System.out.println("Merupakan bilangan genap");
        } else {
            System.out.println("Merupakan bilangan ganjil");
        }
        if (bil1 > bil2) {
            if (bil1 == bil2) {
                System.out.println("Angka bernilai sama = " + bil2);
            } else {
                System.out.println("Angka terbesar = " + bil1);
            }
        } else {
            System.out.println("Angka terbesar = " + bil2);
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            tambah = bil1 + bil2;
            System.out.println("Bilangan 1 + bilangan 2 = " + tambah);
        } else {
            if (bil1 % 2 != 0 && bil2 % 2 != 0) {
                kali = bil1 * bil2;
                System.out.println("Bilangan 1 * bilangan 2 = " + kali);
            } else {
                if (bil1 % 2 == 0 && bil2 % 2 != 0) {
                    System.out.println("Merupakan bilangan berbeda jenis");
                } else {
                    if (bil1 % 2 != 0 && bil2 % 2 == 0) {
                        System.out.println("Merupakan bilangan berbeda jenis");
                    }
                }
            }
        }
    }
}
