package Airinda;

import java.util.Scanner;

public class Day62Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENJUMLAHKAN 1-N");
        System.out.print("masukkan angka N: ");
        int angka = airin.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= angka; i++) {
            jumlah += i;
        }
        System.out.println("jumlah dari 1 sampai "+ angka +" adalah: "+jumlah);
    }
}
