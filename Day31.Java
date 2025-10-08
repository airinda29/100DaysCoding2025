package isc;

import java.util.Scanner;

public class Day31Ngoding {

    public static void main(String[] args) {
        System.out.println("OPERATOR LOGIKA && (AND)");
        Scanner airin = new Scanner(System.in);
        System.out.print("masukkan minimal umur: ");
        int minimal_umur = airin.nextInt();
        System.out.print("masukkan minimal nilai: ");
        int minimal_nilai = airin.nextInt();
        boolean status = (minimal_umur >= 17 && minimal_nilai >= 75);
        System.out.println("apakah andi di terima menjadi anggota club futsal yaitu: " + status);
    }
}
