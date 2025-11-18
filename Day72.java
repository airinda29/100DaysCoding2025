package Airinda;
    import java.util.Scanner;
public class Day72Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MEMBUAT SEGITIGA SIKU SIKU TERBALIK");
        System.out.print("masukkan angka: ");
        int angka = airin.nextInt();
        for (int i = angka; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("O ");
            }
            System.out.println(" ");

        }
        
    }
}
