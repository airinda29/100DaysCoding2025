package Airinda;

import java.util.Scanner;

public class Day13Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner (System.in);
        
        String m = airin.nextLine();
        
        Byte a = Byte.parseByte(m);
        System.out.println(a);
        
        Short b = Short.parseShort(m);
        System.out.println(b);
        
        Integer c = Integer.parseInt(m);
        System.out.println(c);
        
        Long d = Long.parseLong(m);
        System.out.println(d);
        
        char e = m.charAt(1);
        System.out.println(e);
        
        Float f = Float.parseFloat(m);
        System.out.println(f);
        
        Double g = Double.parseDouble(m);
        System.out.println(g);
        
        /*
        String n = "false";
        boolean h = Boolean.parseBoolean(n);
        System.out.println(h);
        */
    }
}
