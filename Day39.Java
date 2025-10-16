package Airinda;

import java.util.Scanner;

public class Day39Ngoding {
    public static void main(String[] args) {
       Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMEBUAT MENU MENGGUNAKAN IF");
        System.out.println("Menu minuman cafe airin");
        System.out.println("1.Alpukat kocok - Rp 15.000");
        System.out.println("2.Matcha - Rp 12.000");
        System.out.println("3.Redvelvet oreo - Rp 12.000");
        System.out.print("pilih minuman yang anda inginkan: ");
        int minuman = airin.nextInt();
        System.out.print("jumlah pesanan: ");
        int jumlah = airin.nextInt();
        if(minuman==1){
            System.out.println("anda memilih Alpukat kocok dengan harga Rp.15.000");
        }else if(minuman == 2){
            System.out.println("anda memilih Matcha dengan harga Rp.12.000");
        }else if(minuman == 3){
            System.out.println("anda memilih Redvelvet oreo dengan harga Rp.12.000");
        }else{
            System.out.println("pilihan anda tidak ada pada daftar menu kami");
        }
        
    }
}
