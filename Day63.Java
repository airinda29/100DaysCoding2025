package Airinda;

import java.util.Scanner;

public class Day63Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENGALIKAN 1-N ");
        System.out.print("masukkan angka N: ");
        int n = airin.nextInt();
        int tamp = 1;
        for (int i = 1; i <= n; i++) {
            tamp *= i;
            System.out.print(i +"x");
        }
        System.out.print("="+tamp+"\n");
    }
}
