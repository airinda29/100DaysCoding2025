import java.util.Scanner;

public class Day43Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN KELIPATAN 3,5 3 DAN 5");
        int angka = airin.nextInt();
        if(angka % 3 == 0 && angka % 5 == 0){
            System.out.println(angka+" kelipatan dari 3 dan 5");
        }else if(angka % 3 ==0){
            System.out.println(angka+" kelipatan dari 3");
        }else if(angka % 5 == 0){
            System.out.println(angka+" kelipatan dari 5");
        }else{
            System.out.println(angka+" bukan kelipatan dari 3 dan 5");
        }
        
    }
}
