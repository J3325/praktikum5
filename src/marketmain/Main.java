package marketmain;

import marketzz.Elektronik;
import marketzz.Pakaian;
import marketzz.Makanan;
import keranjang.KeranjangBelanja;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek produk
        Elektronik tv = new Elektronik("Televisi", 3000000, 10, 2);
        Pakaian kaos = new Pakaian("Kaos Polos", 50000, 20, "L", "Putih");
        Makanan roti = new Makanan("Roti Tawar", 15000, 50, new Date());

        // Membuat objek keranjang belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Menambahkan produk ke keranjang
        keranjang.tambahProduk(tv, 1);
        keranjang.tambahProduk(kaos, 2);
        keranjang.tambahProduk(roti, 5);

        // Menampilkan isi keranjang dan total belanja
        keranjang.displayKeranjang();
    }
}
