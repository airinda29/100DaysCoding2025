package Airinda;

import java.util.Scanner;

public class Day47Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN PROGRAM UNTUK MENENTUKAN HARI MENGGUNAKAN SWITCH CASE");
        System.out.print("masukkan angka 1-7: ");
        int angka = airin.nextInt();
        switch (angka){
            case 1:
                System.out.println("Senin");
                break;
                case 2:
                System.out.println("Selasa");
                break;
                case 3:
                System.out.println("Rabu");
                break;
                case 4:
                System.out.println("Kamis");
                break;
                case 5:
                System.out.println("jumat");
                break;
                case 6:
                System.out.println("sabtu");
                break;
                case 7:
                System.out.println("minggu");
                break;
        }
    }
}
