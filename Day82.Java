package Airinda;
import java.util.Scanner;
public class Day82Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENGISI ELEMEN ARRAY DAN MENAMPILKAN SEMUA ELEMAN ARRAY MENGGUNAKAN PERULANGAN");
        System.out.println("mengisi elemen array: ");
        int [] angka = new int[5];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("elemen "+(i+1)+": ");
            angka[i]=airin.nextInt();
        }
        System.out.println("menampilkan elemen array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("elemen "+(i+1)+": "+angka[i]);
        }
    }
}
