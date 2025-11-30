package Airinda;
import java.util.Scanner;
public class Day84Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        int angka = airin.nextInt();
        int tamp = 0;
        for (int i = 1; i <= angka; i++) {
            if(i % 2 != 0){
                tamp += i;
            }
        }
        System.out.println(tamp);
    }
}
