public class day5 {

    public static void main(String[] args) {
        System.out.println("mari kita hitung rata rata nilai matematika saya\n");
        int semester1 = 82;
        short semester2 = 79;
        long semester3 = 84;
        byte semester4 = 86;
        
        System.out.println("semester1 : " + semester1 );
        System.out.println("semester2 : " + semester2 );
        System.out.println("semester3 : " + semester3 );
        System.out.println("semester4 : " + semester4 );
        long hasil = (semester1 + semester2 + semester3 + semester4) / 4;
        System.out.println("rata rata nilai:" + hasil);
        
        /*
        int memiliki ukuran 32 bit (4 byte )
        short memiliki ukuran 16 bit ( 2 byte ) 
        long memiliki ukuran 64 bit ( 8 byte )
        byte memiliki  ukuran 8 bit ( 1 byte )
        */
      

     }
}
