package Airinda;

import java.util.Scanner;

public class Day45Ngoding {

    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("PERCABANGAN(SWITCH-CASE)");
        System.out.print("masukkan angka 1-7: ");
        int angka = airin.nextInt();
        switch (angka) {
            case 1:
                System.out.println("hari ini adalah hari senin");
                break;
            case 2:
                System.out.println("hari ini adalah hari selasa");
                break;
            case 3:
                System.out.println("hari ini adalah hari rabu");
                break;
            case 4:
                System.out.println("hari ini adalah hari kamis");
                break;
            case 5:
                System.out.println("hari ini adalah hari jumat");
                break;
            case 6:
                System.out.println("hari ini adalah hari sabtu");
                break;
            case 7:
                System.out.println("hari ini adalah hari minggu");
                break;
            default:
                System.out.println("nomor hari tidak valid.");

        }

    }
}
