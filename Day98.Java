package Airinda;
import java.util.Scanner;
public class Day98Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = airin.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Deret Fibonacci sampai "+angka+": ");
        for (int i = 0; a <= angka; i++) {
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
