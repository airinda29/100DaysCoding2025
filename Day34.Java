package Airinda;

import java.util.Scanner;

public class Day34Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENGKOMBINASIKAN OPERATOR LOGIKA");
        System.out.print("masukkan nilai: ");
        int nilai= airin.nextInt();
        System.out.print("masukkan kehadiran: ");
        int kehadiran = airin.nextInt();
        if(nilai >= 60 && kehadiran >= 80){
            System.out.println("siswa dapat mengikuti ujian akhir semester");
        }else{
            System.out.println("siswa tidak dapat mengikuti ujian akhir semester");
        }
    }
}
