package Airinda;

import java.util.Scanner;

public class Day32Ngoding {
    public static void main(String[] args) {
        System.out.println("OPERATOR LOGIKA OR (||)");
        Scanner airin = new Scanner(System.in);
        System.out.print("masukkan kelas_peserta: ");
        int kelas = airin.nextInt();
        System.out.print("masukkan pernah_menang: ");
        boolean pernah_menang = airin.nextBoolean();
        boolean boleh_ikut = (kelas == 10)||(pernah_menang == true);
        System.out.println("boleh ikut lomba: "+boleh_ikut); 
    }
}
