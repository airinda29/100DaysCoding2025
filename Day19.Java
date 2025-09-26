package Airinda;

public class Day19Ngoding {
    public static void main(String[] args) {
        System.out.println("====KONVERSI MANUAL/PAKSA====");
        double angkaDouble = 1611.07;
        
        float angkaFloat = (float)angkaDouble ;
        long angkaLong = (long) angkaDouble ;
        int angkaInt = (int) angkaDouble ;
        short angkaShort = (short) angkaDouble;
        byte angkaByte = (byte) angkaDouble ;
        
        System.out.println("double-> " + angkaDouble);
        System.out.println("float-> " + angkaFloat);
        System.out.println("long-> " + angkaLong);
        System.out.println("int-> " + angkaInt);
        System.out.println("short-> " + angkaShort);
        System.out.println("byte-> " + angkaByte);
        System.out.println("===========SELESAI===========");
    }
}
