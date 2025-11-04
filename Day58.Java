package day24;

import java.util.Scanner;

public class DAY58Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENCETAK ANGKA 1-N DAN ANGKA N-1");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = angka; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
