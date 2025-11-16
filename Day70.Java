package Airinda;

import java.util.Scanner;


public class Day70Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMBUAT POLA PERSEGI");
        System.out.print("masukkan panjang: ");
        int panjang = airin.nextInt();
        System.out.print("masukkan lebar: ");
        int lebar = airin.nextInt();
        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j <= lebar; j++) {
                System.out.print("o");
            }
                    System.out.println(" ");

        }
    }
}
