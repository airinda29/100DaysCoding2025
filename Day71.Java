package Airinda;

import java.util.Scanner;

public class Day71Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMBUAT POLA SEGITIGA SIKU SIKU");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("O ");
            }
            System.out.println(" ");
        }
        
        
    }
}
