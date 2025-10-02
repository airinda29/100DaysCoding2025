package Airinda;

public class Day25FiksNgoding {
    public static void main(String[] args) {
        System.out.println("OPERATOR INCREMENT DAN DECREMENT");
        int stok_barang = 15;
        System.out.print("stok_barang: "+ stok_barang);
        stok_barang--;
        System.out.println("\nada yang beli 1,jadi stok barang sisa= "+ stok_barang);
        stok_barang--;
        System.out.println("selanjutnya ada yang beli lagi,stok barang tinggal= "+ stok_barang);
        stok_barang++;
        System.out.println("setelah itu barang di refill lagi sebanyak 1,stok barang bertambah jadi= "+ stok_barang);
        stok_barang--;
        System.out.println("terakhir ada yang beli lagi,jadi stok barang sisa= "+stok_barang);
    }
}
