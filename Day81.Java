package Airinda;
import java.util.Scanner;
public class Day81Ngoding {
    public static void main(String[] args) {
            Scanner airin = new Scanner(System.in); 
            System.out.println("LATIHAN AKSES ELEMEN ARRAY DENGAN INDEKS");
            int [] angka = {29,16,11,1,27,28};
        System.out.println("selisih: ");
        for (int i = 0; i < angka.length-1; i++) {
            int selisih = angka[i]-angka[i+1];
            System.out.println(angka[i]+"-"+angka[i+1]+": "+selisih);
        }
    }
}
