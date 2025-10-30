package Airinda;

import java.util.Scanner;

public class Day53Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("KEYWORD BREAK");
        while(true){
            System.out.print("masukkan angka: ");
            int angka = airin.nextInt();
            if(angka == 0){
                break;
            }
        }
        System.out.println("program selesai");
    }
}
