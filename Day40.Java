package Airinda;

import java.util.Scanner;

public class Day40Ngoding {

    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMBUAT KALKULATOR MENGGUNAKAN IF");
        int pertama = airin.nextInt();
        char operator = airin.next().charAt(0);
        int kedua = airin.nextInt();
        if (operator == '+') {
            pertama += kedua;
            System.out.print("= " + pertama);
        }else if(operator == '-'){
            pertama += kedua;
            System.out.print("= "+pertama);
        }else if(operator == '*'){
            pertama *= kedua;
            System.out.print("= "+pertama);
        }else if(operator == '/'){
            pertama /= kedua;
            System.out.print("= "+pertama);
        }
    }
}
