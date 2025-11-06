package Airinda;

import java.util.Scanner;

public class Day60Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENCETAK ANGKA GANJIL GENAP(N-1");
        System.out.print("masukkan angka N: "); int angka = airin.nextInt();
        System.out.print("angka ganjil: ");
        for (int i = angka; i >= 1; i--) {
            if( i % 2 != 0){
                System.out.print(i+" ");
            }else{
                System.out.print(" ");
            }
        }
        System.out.print("angka genap: ");
        for (int j = angka; j >= 1; j--) {
            if( j % 2 == 0){
                System.out.print(j+" ");
            }else{
                System.out.print(" ");
            }
        }

        
    }
}
