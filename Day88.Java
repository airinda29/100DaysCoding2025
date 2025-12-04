package Airinda;
import java.util.Scanner;
public class Day88Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("MEANGAKSES ARRAY DENGAN MENGGUNAKAN FOR-EACH");
        String[]buah = {"mangga","jeruk","apel","pisang","anggur"}; 
        System.out.println("Daftar nama-nama buah:");
        for (String daftar : buah) {
            System.out.println(daftar);
        }
    }
}
