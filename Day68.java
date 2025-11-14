package Airinda;

import java.util.Scanner;

public class Day68Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMBUAT PERSEGI");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print(" o ");
            }
            System.out.print("\n");
        }

    }
}
