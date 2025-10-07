package Airinda;
import java.util.Scanner;
public class Day30Ngoding {
    public static void main(String[]args){
        Scanner airin = new Scanner(System.in);
        System.out.println("OPERATOR PERBANDINGAN >= DAN <=");
        System.out.print("nilai_ujian_matematika: ");
        int nilai_ujian_matematika = airin.nextInt();
        System.out.println("apakah nilai matematika rina lebih kecil sama dengan 75? "+(nilai_ujian_matematika >= 75));
        System.out.println("apakah nilai matematika rina lebih besar sama dengan 75? "+(nilai_ujian_matematika <= 75));
    }
}
