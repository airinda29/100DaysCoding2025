package Airinda;

public class Day21Ngoding {
    public static void main(String[] args) {
        int a = 29;
        int b = 16;

        System.out.println("==SEBELUM DITUKAR==");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Tukar tanpa variabel temp
        a = a + b; // a = 45
        b = a - b; // b = 29
        a = a - b; // a = 16

        System.out.println("==SETELAH DITUKAR==");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
