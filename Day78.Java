package Airinda;

import java.util.Scanner;

public class Day78Ngoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Latihan menggunakan berbagai method string");
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        System.out.println("\n=== HASIL ===");
        System.out.println("Uppercase      : " + kalimat.toUpperCase());
        System.out.println("Lowercase      : " + kalimat.toLowerCase());
        System.out.println("Panjang kalimat: " + kalimat.length());
        if (kalimat.length() >= 5) {
            System.out.println("Substring(0-5) : " + kalimat.substring(0, 5));
        } else {
            System.out.println("Substring(0-5) : Kalimat terlalu pendek");
        }

        System.out.println("Replace a->o   : " + kalimat.replace("a", "o"));
    }
}
