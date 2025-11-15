package Airinda;

import java.util.Scanner;

public class Day69Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
       int m = airin.nextInt();
       int l = airin.nextInt();
       int jam = (m + l )%24;
      System.out.println(jam);
    }
        

}
