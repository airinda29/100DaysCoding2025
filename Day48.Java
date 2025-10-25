package Airinda;

import java.util.Scanner;

public class Day48Ngoding {

    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);

        System.out.println("LATIHAN MEMBUAT KALKULATOR MENGGUNAKAN SWITCH CASE");
        System.out.print("a: ");
        int a = airin.nextInt();
        System.out.print("operasi");
        char operasi = airin.next().charAt(0);
        System.out.print("b: ");
        int b = airin.nextInt();

        int hasil = 0;

        switch (operasi) {
            case '+':
                hasil = a + b;
                System.out.println("hasilnya adalah " + hasil);
                break;

            case '-':
                hasil = a - b;
                System.out.println("hasilnya adalah " + hasil);
                break;

            case '*':
                hasil = a * b;
                System.out.println("hasilnya adalah " + hasil);
                break;

            case '/':
                hasil = a / b;
                System.out.println("hasilnya adalah " + hasil);
                break;

            default:
                System.out.println("Operasi tidak valid!");
                break;
        }

        
    }
}
