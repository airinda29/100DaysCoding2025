package Airinda;
import java.util.Scanner;
public class Day97Ngoding {
    static int LuasPersegi(int sisi){
        int luasPersegi= sisi*sisi;
        return luasPersegi;
    }
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENGHITUNG LUAS PERSEGI DENGAN METHOD NON VOID DAN PARAMETERNYA");
        System.out.print("masukkan panjang sisi persegi: ");
        int sisi = airin.nextInt();
        int hasil = LuasPersegi(sisi);
        System.out.println("Luas Persegi adalah "+hasil);
    }
}
