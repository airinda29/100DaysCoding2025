package Airinda;

import java.util.Scanner;

public class Day65Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMBUAT BILANGAN FAKTORIAL");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        int tamp = 1;
        for (int i = 1; i <= angka; i++) {
            tamp = tamp * i;
        }
        System.out.println("faktorial dari "+angka+" adalah: "+tamp);
    }
}
