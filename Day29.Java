package Airinda;

import java.util.Scanner;

public class Day29Ngoding {
    public static void main(String[] args) {
        System.out.println("OPERATOR PENUGASAN > DAN <");
        Scanner airin = new Scanner(System.in);
        System.out.print("nilai matematika: ");
        int matematika = airin.nextInt();
        System.out.print("nilai bahasa_inggris");
        int bahasa_inggris = airin.nextInt();
        System.out.println("apakakah nilai matematika lebih besar dari bahasa_inggris? "+(matematika>bahasa_inggris));
        System.out.println("apakah nilai matematika lebih kecil dari bahasa inggris? "+(matematika<bahasa_inggris));
        
    }
}
