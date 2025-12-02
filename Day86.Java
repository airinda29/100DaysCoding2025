package Airinda;
import java.util.Scanner;
public class Day86Ngoding {
      public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
          System.out.println("LATIHAN MENENTUKAN NILAI MINIMAL ARRAY");
        int [] angka = new int [5];
        System.out.print("masukkan data: ");
        for (int i = 0; i < angka.length; i++) {
        angka [i] =airin.nextInt();
        }
        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if(angka [i] < min){
                min = angka[i];
            }
        }
        System.out.println("nilai minimal adalah: "+min);
    }

  
}
