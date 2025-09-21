import java.util.Scanner;

public class Day13Ngoding {
    public static void main(String[] args) {
        Scanner airin = new Scanner (System.in);
        
        String m = airin.nextLine();
        
        byte a = Byte.parseByte(m);
        System.out.println(a);
        
        short b = Short.parseShort(m);
        System.out.println(b);
        
        int c = Integer.parseInt(m);
        System.out.println(c);
        
        long d = Long.parseLong(m);
        System.out.println(d);
        
        char e = m.charAt(1);
        System.out.println(e);
        
        float f = Float.parseFloat(m);
        System.out.println(f);
        
        double g = Double.parseDouble(m);
        System.out.println(g);
        
        /*
        String n = "false";
        boolean h = Boolean.parseBoolean(n);
        System.out.println(h);
        */
    }
}
