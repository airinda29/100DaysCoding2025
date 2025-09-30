package Airinda;

import java.util.Scanner;

public class Day23Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("PROGRAM LUAS PERSEGI PANJANG");
        System.out.print("masukkan panjang: ");
        byte panjang = airin.nextByte();
        System.out.print("masukkan lebar: ");
        byte lebar = airin.nextByte();
        
        int luas = panjang * lebar ;
        
        System.out.println("luas: "+luas);
        
        
    }
}
