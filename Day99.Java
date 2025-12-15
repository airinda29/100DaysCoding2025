package Airinda;
import java.util.Scanner;
public class Day99Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN DERETAN BILANGAN PRIMA 1-N");
        int angka = airin.nextInt();
        System.out.println("bilangan prima dari 1 sampai "+angka+": ");
        for (int i = 2; i <= angka; i++) {
            boolean status = true;
            for (int j = 2; j <= i / 2; j++) {
                if(i % j == 0){
                    status = false;
                    break;
                }
            }
            if(status){
                System.out.print(i+" ");
            }
        }
            
        }
        
    }
