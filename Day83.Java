package Airinda;
import java.util.Scanner;
public class Day83Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);   
        System.out.println("LATIHAN MENJUMLAHKAN ELEMEN ARRAY");
        int [] angka = new int[5];
        int tamp = 0;
        for (int i = 0; i < angka.length; i++) {
            System.out.print("masukkan elemen "+(i+1)+": ");
            angka[i]=airin.nextInt();
            tamp = angka[i]+tamp;
        }
        System.out.println("total dari elemen array adalah "+tamp);
    }
}
