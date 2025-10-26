package Airinda;

import java.util.Scanner;

public class Day49Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("OPERATOR TERNARY");
        System.out.print("nilai: ");
        int nilai = airin.nextInt();
        String status_kelulusan = (nilai >= 60 )? "lulus":"tidak lulus";
        System.out.println("status kelulusan siswa: "+status_kelulusan);
    }
}
