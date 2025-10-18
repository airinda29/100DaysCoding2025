package Airinda;

import java.util.Scanner;

public class Day41Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("EVALUASI MENTOR");
        System.out.println("menghitung nilai predikat siswa");
        int nilai = airin.nextInt();
        if(nilai >= 90){
            if(nilai == 100){
                System.out.println("predikat: A (sempurna)");
            }else{
                System.out.println("predikat: A");
            }      
        }else if(nilai >= 80 && nilai <=89){
            System.out.println("predikat: B");
        }else if(nilai >= 70 && nilai <= 79){
            System.out.println("predikat: C");
        }else{
            System.out.println("siswa tidak lulus");
        }

        
    }
 
}
