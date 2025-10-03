package Airinda;
import java.util.Scanner;
public class Day26Ngoding {
   public static void main(String[]args) {
       System.out.println("OPERATOR PENUGASAN");
       Scanner airin = new Scanner(System.in);
       System.out.print("masukkan x: ");
       int x = airin.nextInt();
       System.out.print("masukkan y: ");
       byte y = airin.nextByte();
       x += y;
       System.out.println("x += y -> x = "+ x);
       x -= y;
       System.out.println("x -= -> x ="+ x);
       x *= y;
       System.out.println("x *= -> x ="+ x);
       x /= y;
       System.out.println("x /= -> x="+ x);
       x %= y;
       System.out.println("x %= -> x="+ x);
       
}
}
