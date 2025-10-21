package Airinda;

import java.util.Scanner;

public class Day44Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN PROGRAM PREDIKAT NILAI A,B,C,D,E");
        System.out.println("Predikat hasil ujian akhir");
        System.out.print("nama: ");
        String nama = airin.nextLine();
        System.out.print("Nilai: ");
        int nilai = airin.nextInt();
        if(nilai > 85 && nilai< 100){
            System.out.println("Anda mendapatkan Predikat A,selamat anda lulus dengan sangat baik");
        }else if(nilai > 70 && nilai < 84){
            System.out.println("Anda mendapatkan predikat B,selamat anda lulus dengan baik");
        }else if(nilai > 55 && nilai< 69){
            System.out.println("Anda mendapatkan predikat C,selamat anda lulus");
        }else if(nilai > 40 && nilai < 54){
            System.out.println("Anda mendapatkan predikat D,Anda tidak lulus");
        }else if(nilai < 40){
            System.out.println("Anda mendapatkan predikat E,Anda tidak lulus");
        }
    }
}
