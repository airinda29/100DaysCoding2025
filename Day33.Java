package Airinda;

import java.util.Scanner;

public class Day33Ngoding {
    public static void main(String[]args){
        System.out.println("OPERATOR LOGIKA NOT(!)");
        Scanner airin = new Scanner(System.in);
        System.out.print("apakah sistem sedang terkunci?: ");
        boolean kunci = airin.nextBoolean();
        boolean boleh_masuk = !kunci;
        System.out.println("pengguna boleh masuk ke sistem adalah "+boleh_masuk);
    }
}
