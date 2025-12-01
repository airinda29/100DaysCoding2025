package Airinda;
import java.util.Scanner;
public class Day85Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        int [] angka = new int [5];
        System.out.print("masukkan data: ");
        for (int i = 0; i < angka.length; i++) {
        angka [i] =airin.nextInt();
        }
        int maks = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if(angka [i] > maks){
                maks = angka[i];
            }
        }
        System.out.println("nilai maksimal adalah: "+maks);
    }
}
