package Airinda;

import java.util.Scanner;

public class Day28Ngoding {
    public static void main (String[]args){
  Scanner airin =  new Scanner(System.in);
        System.out.println("OPERATOR PENUGASAN == DAN !=");
        int nilai_siswa = airin.nextInt();
        int rata_rata = 75;
        int minimal_kelulusan = 60;
        System.out.println("apakah nilai siswa sama dengan rata_rata kelas? "+(nilai_siswa == rata_rata));
        System.out.println("apakah nilai siswa tidak dengam nilai minimal kelulusan? "+(nilai_siswa != minimal_kelulusan));
  
  
    }
}
