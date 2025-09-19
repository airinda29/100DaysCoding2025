package Airinda;

import java.util.Scanner;

public class Day12Ngoding {
    public static void main(String[] args) {
   Scanner airin = new Scanner (System.in);
        System.out.println(">>BIODATA AIRINDA<<");
        System.out.print("nama: ");
        String nama = airin.nextLine();
        System.out.print("Tempat_Lahir: ");
        String Tempat_Lahir = airin.nextLine();
        System.out.print("Tanggal_Lahir: ");
        long Tanggal_Lahir = airin.nextLong();
        System.out.print("umur: ");
        byte umur = airin.nextByte();
        System.out.print("Jenis_Kelamin: ");
        char Jenis_Kelamin = airin.next().charAt(0);
        System.out.print("agama: ");
        String agama = airin.next();
        System.out.print("BB: ");
        double BB = airin.nextDouble();
        System.out.print("TB: ");
        float TB = airin.nextFloat();
        System.out.print("GolDar: ");
        char GolDar = airin.next().charAt(0);
        System.out.print("Nama_Ayah: ");
        String Nama_Ayah = airin.next();
        System.out.print("Nama_Ibu: ");
        String Nama_Ibu = airin.next();
        System.out.print("alamat: ");
        String alamat = airin.next();
        
        System.out.println("nama: "+nama);
        System.out.println("Tempat_Lahir: "+Tempat_Lahir);
        System.out.println("Tanggal_Lahir: "+Tanggal_Lahir);
        System.out.println("umur: "+umur);
        System.out.println("Jenis_Kelamin: "+Jenis_Kelamin);
        System.out.println("agama: "+agama);
        System.out.println("BB: "+BB);
        System.out.println("TB: "+TB);
        System.out.println("GolDar: "+GolDar);
        System.out.println("Nama_Ayah: "+Nama_Ayah);
        System.out.println("Nama_Ibu: "+Nama_Ibu);
        System.out.println("alamat: "+alamat);
       
    }   
}
