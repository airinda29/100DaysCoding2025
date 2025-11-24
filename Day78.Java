package Airinda;
import java.util.Scanner;
public class Day78Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("Latihan menggunakan berbagai method string");
        System.out.print("masukkan kalimat: ");
        String kalimat = airin.nextLine();
        System.out.println("Uppercase/mengubah kalimat menjadi kapital: "+kalimat.toUpperCase());
        System.out.println("Substring/mencetak sampai indek tertentu: "+kalimat.substring(0,7));
        System.out.println("Replace/spasi menjadi tanda penghubung: "+kalimat.replace(" ", "-"));
    }
}
