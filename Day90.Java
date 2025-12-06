package Airinda;
import java.util.Scanner;
public class Day90Ngoding {
    static int penjumlahan(int a,int b){
    return a + b;
}
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("METHOD NON VOID");
        System.out.print("masukkan nilai a: ");
        int nilaiA = airin.nextInt();
        System.out.print("masukkan nilai b: ");
        int nilaiB = airin.nextInt();
        int hasil = penjumlahan(nilaiA,nilaiB);
        System.out.println("hasil dari penjumlahan nilai a dan nilai b adalah "+hasil);
    }
}
