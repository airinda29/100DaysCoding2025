package Airinda;

import java.util.Scanner;

public class Day11Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        String nama = airin.nextLine();
        System.out.print("masukkan umur: ");
        int umur = airin.nextInt();
        System.out.print("masukkan tinggi: ");
        float tinggi = airin.nextFloat();
        System.out.print("masukkan berat: ");
        double berat = airin.nextDouble();
        System.out.print("masukkan jeniskelamin: ");
        char jeniskelamin = airin.next().charAt(0);
        System.out.print("masukkan ipk: ");
        long ipk = airin.nextLong();
        System.out.print("masukkan lingkarperut: ");
        short lingkarperut = airin.nextShort();
        System.out.print("masukkan tanggallahir: ");
        byte tanggallahir = airin.nextByte();
        System.out.print("masukkan status: ");
        boolean status = airin.nextBoolean();
                
        System.out.println("nama saya:"+nama);
        System.out.println("umur saya:"+umur);
        System.out.println("tinggi saya:"+tinggi);
        System.out.println("berat saya:"+berat);
        System.out.println("jeniskelamin saya:"+jeniskelamin);
        System.out.println("ipk saya:"+ipk);
        System.out.println("lingkarperut saya:"+lingkarperut);
        System.out.println("tanggallahirairin saya:"+tanggallahir);
        System.out.println("status saya:"+status);
        
    }
    
}
