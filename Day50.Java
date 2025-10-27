package Airinda;

import java.util.Scanner;

public class Day50Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENENTUKAN GANJIL GENAP MENGGUNAKAN OPERATOR TERNARY");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        String hasil = (angka % 2 == 0) ? "angka genap" : "angka ganjil";
        System.out.println(hasil);
    }
 
}
