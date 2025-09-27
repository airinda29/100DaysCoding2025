package Airinda;

public class Day20Ngoding {
    public static void main(String[] args) {
        System.out.println("TIPE DATA PRIMITIF-TIPE DATA STRING");
        byte dataByte = 15;
        short dataShort = 200;
        int dataInt = 161107;
        float dataFloat = 2901.07f;
        double dataDouble = 2916.07;
        char dataChar = 'B';
        boolean dataBoolean = true;
        
        String strByte = Byte.toString(dataByte);
        String strShort = Short.toString(dataShort);
        String strInt = Integer.toString(dataInt);
        String strFloat = Float.toString(dataFloat);
        String strDouble = Double.toString(dataDouble);
        String strChar = Character.toString(dataChar);
        String strBoolean = Boolean.toString(dataBoolean);
        
        System.out.println("byte -> String: " + strByte);
        System.out.println("short -> String: " + strShort);
        System.out.println("int -> String: " + strInt);
        System.out.println("float -> String: " + strFloat);
        System.out.println("double -> String: " + strDouble);
        System.out.println("char -> String: " + strChar);
        System.out.println("boolean -> String: " + strBoolean);
        
            }
}
