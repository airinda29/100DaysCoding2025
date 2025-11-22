package Airinda;
import java.util.Scanner;
public class Day76Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("mehtod string untuk pengecekan (equals(),equalsIgnoreCase(),contains(),isEmpty");
        System.out.print("masukkan nama anda: ");
        String nama_lengkap = airin.nextLine();
        System.out.print("masukkan nama panggilan: ");
        String nama_panggilan = airin.nextLine();
        System.out.print("nama asli yang di butuhkan jadi yang mana?: ");
        String nama_yang_asli = airin.nextLine();
        System.out.print("kosong: ");
        String kosong = airin.nextLine();
        System.out.println("equals()/membandingkan dua string: "+nama_lengkap.equals(nama_panggilan));
        System.out.println("equalsIgnoreCase()/mengabaikan huruf besar dan kecil: "+nama_lengkap.equalsIgnoreCase(nama_panggilan));
        System.out.println("contains()/mengecek apakah sebuah string mengandung kata tertentu: "+nama_yang_asli.contains(nama_yang_asli));
        System.out.println("isEmpty/mengecek apakah string kosong: "+kosong.isEmpty());
    }
}
