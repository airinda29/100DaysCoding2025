package Airinda;

import java.util.Scanner;

public class Day37Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENENTUKAN BILANGAN GANJIL GENAP");
        System.out.print("masukkan nomor kursi anda: ");
        int nomor = airin.nextInt();
        if(nomor % 2 == 0){
            System.out.println("nomor kursi: "+nomor +" bilangan genap,anda duduk di sebelah kanan panggung");
        }else{
            System.out.println("nomor kursi: "+nomor +" bilangan ganjil,anda duduk di debelah kiri panggung");
        }
        
    }
}
