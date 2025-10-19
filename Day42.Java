package Airinda;

import java.util.Scanner;


public class Day42Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENENTUKAN GAJI BERSIH");
        System.out.println("Gaji bersih Guru Honorer");
        System.out.print("jam kerja:");
        int jam_kerja = airin.nextInt();
        System.out.print("upah perjam: ");
        int upah_perjam = airin.nextInt();
        System.out.print("tunjangan transportasi: ");
        int tunjangan = airin.nextInt();
        System.out.print("iuran: ");
        int iuran = airin.nextInt();
        
        int gaji_kotor = (jam_kerja * upah_perjam)+tunjangan;
        double pajak = 0.05 * gaji_kotor ;
        if(gaji_kotor > 0){
            double gaji_bersih = gaji_kotor - pajak - iuran; 
             System.out.println("gaji kotor: Rp"+gaji_kotor);
             System.out.println("pajak: Rp"+pajak);
             System.out.println("iuran: Rp"+iuran);
             System.out.println("gaji bersih: Rp"+gaji_bersih);
        }else{
            System.out.println("data tidak valid");
        }
        
    }
}
