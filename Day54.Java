package Airinda;

import java.util.Scanner;

public class Day54Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("KEYWORD CONTINUE");
        System.out.print("masukkan angka continue: ");
        int a = airin.nextInt();
        for (int i = 0; i < 10; i++) {
            if(i==a){
                continue;
            }
            System.out.println("angka "+ i);
        }
    }
}
