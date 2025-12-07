package Airinda;
import java.util.Scanner;
public class Day91Ngoding {
    static int HitungLuas(int panjang,int lebar){
        return panjang * lebar;
    }
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("PARAMETER METHOD");
        System.out.print("panjang: ");
        int panjang = airin.nextInt();
        System.out.print("lebar: ");
        int lebar = airin.nextInt();
        int hasil = HitungLuas(panjang,lebar);
        System.out.println("luas: "+hasil );
        
    }
}
