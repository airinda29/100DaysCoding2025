package Airinda;

import java.util.Scanner;

public class Day55Evaluasi {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        int n = airin.nextInt();
        int total = 0;
        for (int i = 0; i< n; i++) {
            int berat = airin.nextInt();
            total += berat;
        }
        System.out.println(total+"kg");
    }
}
