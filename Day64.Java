package Airinda;

import java.util.Scanner;

public class Day64Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENCETAK M PANGKAT N");
        System.out.print("masukkan angka M: ");
        int M = airin.nextInt();
        System.out.print("masukkan angka N: ");
        int N = airin.nextInt();
        int tamp = 1;
        for (int i = 1; i <= N; i++) {
            tamp *= M;
        }
        System.out.println("hasil dari "+M+" pangkat "+N+" = "+tamp);
    }
}
