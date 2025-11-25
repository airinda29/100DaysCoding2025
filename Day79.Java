package Airinda;

import java.util.Scanner;

public class Day79Ngoding {

    public static void main(String[] args) {
        Scanner airin = new Scanner(System.in);
        System.out.print("buat username anda: ");
        String username = airin.nextLine();
        System.out.print("buat passsword: ");
        String password = airin.nextLine();
        System.out.println("\n======AKUN BERHASIL DIBUAT======\n");
        while(true){
            System.out.print("masukkan username anda: ");
            String inputanUser = airin.nextLine();
            System.out.print("masukkan password: ");
            String inputanPassword = airin.nextLine();
            if(inputanUser.equals(username) && inputanPassword.equals(password)){
                System.out.println("\nLogin anda berhasil! Selamat datang "+username+"!");
                break;
            }else{
                System.out.println("Username atau password anda salah! silahkan coba lagi.\n");
            }
        }
    }
}
