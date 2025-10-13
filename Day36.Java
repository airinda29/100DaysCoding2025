package Airinda;

import java.util.Scanner;

public class Day36Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner (System.in);
        System.out.println("NESTED IF/IF DALAM IF");
        System.out.print("total belanja: ");
        double belanja = airin.nextDouble();
        double diskon = 0;
        if(belanja > 100000){
            diskon = 0.10;
            if (belanja > 500000){
                diskon = 0.15;
            }
        }
        double total_bayar = belanja - (belanja * diskon);
        System.out.printf("diskon anda: %.0f%%\n ",diskon * 100);
        System.out.printf("total yang di bayar: Rp%.2f\n ",total_bayar);
    }
}
