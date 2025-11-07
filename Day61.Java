package Airinda;

import java.util.Scanner;

public class Day61Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENCETAK BILANGAN KELIPATAN M DARI 1-N");
        System.out.print("masukkan angka N: ");
        int N = airin.nextInt();
        System.out.print("masukkan angka M: ");
        int M = airin.nextInt();
        System.out.println("bilangan kelipatan "+M+" dari 1 sampai "+N+" adalah: ");
        for (int i = 1; i <= N; i++) {
            if( i % M == 0){
                System.out.print(i+" ");
            }
        }
    }
}
