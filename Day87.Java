package Airinda;
import java.util.Scanner;
public class Day87Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENCARI ELEMEN PADA ARRAY");
        String [] buah = {"apel","mangga","pisang","anggur","jeruk",};
        System.out.print("masukkan nama buah: ");
        String cari = airin.nextLine();
        String a="buah tidak tersedia";
        String b =" ";
        for (int i = 0; i < buah.length; i++) {
            if(cari.toLowerCase().equalsIgnoreCase(buah[i])){
                b ="buah tersedia";
            }else{
                b = "buah tidak tersedia";
            }
        }
        System.out.println(b);
                   
    }
}
