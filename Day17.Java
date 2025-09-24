package Airinda;

import java.util.Scanner;

public class Day17Ngoding {
    public static void main(String[] args) {
        Scanner airinda = new Scanner (System.in);
        System.out.println("===OPERATOR ARITEMTIKA MODULUS===");
        System.out.print("bilangan pertama: ");
        int angka1 = airinda.nextInt();
        System.out.print("bilangan kedua: ");
        int angka2 = airinda.nextInt();
        
        int HasilBagi = angka1 / angka2 ;
        int SisaBagi = angka1 % angka2 ;
        
        System.out.println("\nHasil Pembagian: " + angka1 + "/" + angka2 + "=" + HasilBagi);
        System.out.println("Sisa bagi: " + SisaBagi);
        
    }
}
