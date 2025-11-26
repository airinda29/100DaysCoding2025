package Airinda;
import java.util.Scanner;
public class Day80Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("ARRAY 1D");
        System.out.print("masukkan jumlah data: ");
        int jumlah = airin.nextInt();
        int [] nilai = new int[jumlah];
        int tamp = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print("msukkan nilai ke-"+(i+1)+": ");
            nilai[i]=airin.nextInt();
            tamp += nilai[i];
        }
        double rata_rata = tamp/jumlah;
        System.out.println("total nilai: "+tamp);
        System.out.println("nilai rata rata: "+rata_rata);
    }
  
}
