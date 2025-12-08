package Airinda;

import java.util.Scanner;
public class Day92Ngoding {
    static int kelilingPersegi(int k,int panjang){
        return k * panjang;
    }
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("KEYWARD RETURN");
        int k = 4;
        int panjang = 8;
        int sisi = kelilingPersegi(k,panjang);
        System.out.println(sisi);
    }
    
}
