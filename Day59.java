package Airinda;

import java.util.Scanner;

public class Day59Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENCETAK ANGKA GANJIL 1-N DAN ANGKA GENAP N-1");
        System.out.print("masukkan angka: ");int angka = airin.nextInt();
        System.out.println("angka ganjil dari 1 sampai: "+angka);
        for (int i = 1; i <= angka; i++) {
            if( i % 2 != 0){
                System.out.println(i+" ");
            }
            
        }
        System.out.println("angka genap dari 1 sampai: "+angka);
        for (int i = 1; i <= angka; i++) {
            if( i % 2 == 0){
                System.out.println(i+" ");
            }
            
        }

    }
}
