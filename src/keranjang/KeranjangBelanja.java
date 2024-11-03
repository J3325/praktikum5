package keranjang;

import marketzz.Produk;
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        this.produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk, int jumlah) {
        if (produk.getJumlahStok() >= jumlah) {
            produk.kurangiStok(jumlah);
            produkList.add(produk);
            System.out.println(jumlah + " " + produk.getNamaProduk() + " berhasil ditambahkan ke keranjang.");
        } else {
            System.out.println("Stok tidak mencukupi untuk produk: " + produk.getNamaProduk());
        }
    }

    public double hitungTotalBelanja() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.getHarga();
        }
        return total;
    }

    public void displayKeranjang() {
        System.out.println("Isi Keranjang Belanja:");
        for (Produk produk : produkList) {
            produk.displayInfo();
            System.out.println("-----------------------");
        }
        System.out.println("Total Belanja: Rp " + hitungTotalBelanja());
    }
}
