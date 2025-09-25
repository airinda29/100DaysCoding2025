package Airinda;

import java.util.Scanner;

public class Day18Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.print("masukkan angka pertama: ");
        byte angka1 = airin.nextByte();
        System.out.print("masukkan angka kedua: ");
        byte angka2 = airin.nextByte();
        
        int hasilInt = angka1 + angka2;
        long hasilLong = hasilInt * 1000;
        float hasilFloat = hasilLong / 3f;
        double hasilDouble = hasilFloat + 0.95;
        
        System.out.println("\n>>>HASIL KONVERSI OTOMATIS<<<");
        System.out.println("penjumlahan: " + hasilInt);
        System.out.println("Dikali: " + hasilLong);
        System.out.println("Dibagi: " + hasilFloat);
        System.out.println("Ditambah: " + hasilDouble);
        
        
        
        
            }
}
