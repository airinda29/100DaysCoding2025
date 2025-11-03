package Airinda;

import java.util.Scanner;

public class Day57Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("NESTED LOOP");
        System.out.println("menyusun angka secara bertingkat");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }                
            System.out.println();
        }
        
    }
  
}
