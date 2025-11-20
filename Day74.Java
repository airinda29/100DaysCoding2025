package Airinda;

import java.util.Scanner;

public class Day74Ngoding {

    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN DO WHILE: MEMBUAT MENU BERULANG");
        do {
            System.out.println("Daftar menu makanan: ");
            System.out.println("1.Cookies:Rp.5.000");
            System.out.println("2.Mochi baites:Rp.5.000");
            System.out.println("3.Dimsum mentai:Rp.15.000");
            System.out.println("4.Salad buahr:Rp.13.000");
            System.out.print("masukkan pesanan anda: ");
            int pilihan = airin.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("anda memlih cookies dengan harga Rp.5.000");
                    break;
                case 2:
                    System.out.println("anda memilih mochi baites dengan harga Rp.5.000");
                    break;
                case 3:
                    System.out.println("anda memilih dimsum mentai dengan harga Rp.15.000");
                    break;
                case 4:
                    System.out.println("anda memilih salad buah dengan harga Rp.13.000");
                    break;
            }
            System.out.println(" ");
        }while (true);
    }
}
