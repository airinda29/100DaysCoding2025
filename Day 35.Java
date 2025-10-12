package Airinda;

import java.util.Scanner;

public class Day35Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        int suhu = airin.nextInt();
        if(suhu < 15){
            System.out.println("dingin");
        }else if (suhu >= 15 && suhu <= 25){
            System.out.println("sejuk");
        } else {
        System.out.println("panas");
    }

    }
}
