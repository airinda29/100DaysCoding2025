package ngoding2;

public class Ngoding2 {

    public static void main(String[] args) {
        String nama = "Airinda";
        int  nim = 0225316;
        float tinggi = 156.8f;
        double berat = 47.4;
        
        System.out.println("nama: "+ nama);
        System.out.println("nim: "+ nim);
        System.out.println("tinggi: "+ tinggi);
        System.out.println("berat: "+ berat);
        
        System.out.print("nama: "+ nama);
        System.out.print("nim: "+ nim);
        System.out.print("tinggi: "+ tinggi);
        System.out.print("berat: "+ berat);
        
        System.out.printf("\nnama:%s \nnim%d \ntinggi:%.1f,\nberat:%.1f%n",nama,nim,tinggi,berat);
    }
    
}
