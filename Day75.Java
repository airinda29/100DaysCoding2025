package Airinda;
import java.util.Scanner;
public class Day75Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("method string dasar(lenght())?jumlah karakter,toUpperCase()/menjadi huruf besar,dan toLowerCase()/menjadi huruf kecil)");
        String nama =airin.nextLine();
        System.out.println("lenght/jumlah karakter: "+nama.length());
        System.out.println("Upper/huruf besar: "+nama.toUpperCase());
        System.out.println("Lower/huruf kecil: "+nama.toLowerCase());
    }
}
