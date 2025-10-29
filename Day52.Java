package Airinda;

import java.util.Scanner;

public class Day52Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("PERULANGAN WHILE");
        System.out.println("menghitung tabungan");
        int tabungan = 0;
        int minggu = 0;
        int tambahan = 10000;
        int target = 100000;
        while (tabungan < target){
            minggu++;
            tabungan+= tambahan;
            System.out.println("minggu ke-"+minggu+" total tabungan= "+tabungan);
        }
        System.out.println("total minggu untuk mencapai target Rp "+ target +" adalah: "+minggu);
    }
}
