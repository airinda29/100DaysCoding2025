package Airinda;

public class Day94Ngoding {
    static void cekUsia(int usia){
        if(usia >= 18){
            System.out.println("Dewasa");
        }else{
            System.out.println("Anak anak");
        }
    }
    public static void main(String[] args) {
        cekUsia (20);
        cekUsia (12);
                
    }
}
