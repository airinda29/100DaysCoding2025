package Airinda;

import java.util.Scanner;

public class Day46Ngoding {

    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMBUAT MENU MENGGUNAKAN SWITCH-CASE");
        System.out.println("MENU CAFE DRINK AIRIN");
        
        System.out.println("1.Matcha:Rp.15.000");
        System.out.println("2.Coklat panas:Rp.10.000");
        System.out.println("3.Redvelvet:Rp.17.000");
        System.out.println("4.Oreo susu:Rp.13.000");
        System.out.print("masukkan pilihan anda: ");
        int pilihan = airin.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Matcha dengan harga Rp.15.000 ");
                break;
            case 2:
                System.out.println("Anda memilih Coklat panas dengan harga Rp.10.000 ");
                break;
            case 3:
                System.out.println("Anda memilih Redvelvet dengan harga Rp.17.000 ");
                break;
            case 4:
                System.out.println("Anda memilih Oreo susu dengan harga Rp.13.000 ");
                break;
            default:
                System.out.println("pilihan anda tidak tersedia di cafe airin");
        }
    }
}
