package Airinda;

import java.util.Scanner;

public class Day22Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in); 
        System.out.println("===PROGRAM LUAS PERSEGI===");
        System.out.print("masukkan keliling persegi: ");
        int keliling = airin.nextInt();
        
        int sisi = keliling / 4 ;
        int luas = sisi * sisi ;
        
        System.out.println("keliling persegi = " + keliling);
        System.out.println("sisi persegi = " + sisi);
        System.out.println("luas persegi = " + luas);
        
    }
}
