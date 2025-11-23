package Airinda;
import java.util.Scanner;
public class Day77Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("method String untuk manipulasi");
        System.out.println("substring()/mengambil sebagian teks berdasarkan indeks yg dimulai nari 0");
        System.out.println("replace()/mengganti teks tertentu dengan teks baru");
        System.out.println("trim()/menghilangkan spasi yang berlebihan di bagian awal teks dan akhir teks");
        System.out.print("masukkan kalimat: ");
        String kalimat = airin.nextLine();
        System.out.println("substring: "+kalimat.substring(0, 15));
        System.out.println("replace a menjadi i: "+kalimat.replace("a", "i"));
        System.out.println("trim: "+kalimat.trim());
    }
}
