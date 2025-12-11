package Airinda;
import java.util.Scanner;
public class Day95Ngoding {
    static void Perkenalan(String nama,int umur,double tb){
        System.out.println("Halo nama saya "+nama+
                ", saya berusia "+umur+" tahun,"+
                " dan tinggi badan saya "+tb+" meter."); 
    }
    
    
    public static void main(String[] args) {
          Scanner airin = new Scanner(System.in);
          System.out.println("Latihan menggunakan parameter");
          System.out.println("masukkan nama: ");
          String nama = airin.nextLine();
          System.out.println("masukkkan umur anda: ");
          int umur = airin.nextInt();
          System.out.println("masukkan tinggi badan: ");
          double tb = airin.nextDouble();
          Perkenalan(nama,umur,tb);
    }
}
