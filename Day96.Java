package Airinda;

import java.util.Scanner;

public class Day96Ngoding {

    static int penjumlahan(int a, int b) {
        return a + b;
    }

    static int pengurangan(int a, int b) {
        return a - b;
    }

    static int perkalian(int a, int b) {
        return a * b;
    }

    static int pembagian(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);

        System.out.println("LATIHAN MENGHITUNG PENJUMLAHAN, PENGURANGAN, PERKALIAN DAN PEMBAGIAN MENGGUNAKAN METHOD");
        System.out.print("Masukkan angka a : ");
        int a = airin.nextInt();

        System.out.print("Masukkan angka b : ");
        int b = airin.nextInt();

        System.out.println("\nHASIL PERHITUNGAN");
        System.out.println("Penjumlahan : " + penjumlahan(a, b));
        System.out.println("Pengurangan : " + pengurangan(a, b));
        System.out.println("Perkalian   : " + perkalian(a, b));
        System.out.println("Pembagian   : " + pembagian(a, b));

    }
}
