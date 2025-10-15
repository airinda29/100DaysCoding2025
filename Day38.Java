package isc;

import java.util.Scanner;

public class Day38Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.println("LATIHAN MENENTUKAN BILANGAN POSITIF,NEGATIF DAN NOL");
        System.out.println("SALDO AIRIN");
        System.out.print("jumlah saldo: ");
        int saldo = airin.nextInt();
        if(saldo > 0){
            System.out.println("saldo airin positif dan airin masi memiliki tabungan");
        }else if(saldo < 0){
            System.out.println("saldo airin negatif dan airin tidak memiliki utang ");
        }else{
            System.out.println("saldo airin nol dan airin sudah tidak mempunyai uang");
        }
        
    }
}
