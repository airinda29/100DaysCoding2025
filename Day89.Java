package Airinda;
import java.util.Scanner;
public class Day89Ngoding {
    public static void main(String[] args) {
    Scanner airin = new Scanner(System.in);
        System.out.println("METHOD VOID");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        GanjilGenap(angka);
    }
    public static void GanjilGenap(int angka) {
        if(angka % 2 == 0){
            System.out.println(angka+" angka tersebut adalah genap");
        }else{
            System.out.println(angka+" angka tersebut adalah ganjil");
        }
    }

}
