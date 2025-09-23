package Airinda;

import java.util.Scanner;

public class Day16Ngoding {
    public static void main(String[] args) {
        Scanner Airin = new Scanner(System.in);
        System.out.print("nilai x: ");
        int x = Airin.nextInt();
        System.out.print("nilai y: ");
        int y = Airin.nextInt();
        System.out.print("nilai z: ");
        int z = Airin.nextInt();
        
        double hasil1 = (x * y) / z ;
        double hasil2 = (x / y) * z ;
        double hasil3 = (x * y * z) / (x + y) ;
        
        System.out.println("\n===HASIL PERHITUNGAN===");
        System.out.println("(x * y) / z = " + hasil1);
        System.out.println("(x / y) * z = " + hasil2);
        System.out.println("(x * y * z) / (x + y) = "+hasil3);
        
        
    }
}
