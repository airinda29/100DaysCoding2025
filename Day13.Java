package Airinda;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.print("masukkan jari jari lingkaran: ");
        double r = airin.nextDouble();
        double luas = PI*r*r;
        System.out.printf("luas lingkaran dengan jari jari %.2f adalah %.2f%n",r,luas);
        
        
        
    }
 
}
