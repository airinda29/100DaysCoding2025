package Airinda;

import java.util.Scanner;

public class Day56Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("PERULANGAN DO-WHILE");
        System.out.print("masukkan angka: "); 
        int angka = airin.nextInt();
        do {
            System.out.println("Angka ke-"+angka);
            angka++;
        }while (angka <= 15);
    }
}
