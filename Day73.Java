package Airinda;

import java.util.Scanner;
public class Day73Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN PENJUMLAHAN ANGKA(BEREHNTI KETIKA MENGINPUTKAN ANGKA NEGATIF");
        int tamp = 0;
        for (int i = 0; i > -1; i++) {
            System.out.print("masukkan angka: ");
            int angka = airin.nextInt();
            if(angka >= 0){
                tamp += angka;
            }
            if(angka < 0){
                break;
            }
        }
        System.out.println("hasil dari penjumlahan adalah: "+ tamp);
    }
}
