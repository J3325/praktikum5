package marketzz;

import java.util.Date;

public class Makanan extends Produk {
    private Date tanggalKadaluwarsa;

    public Makanan(String namaProduk, double harga, int jumlahStok, Date tanggalKadaluwarsa) {
        super(namaProduk, harga, jumlahStok);
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tanggal Kadaluwarsa: " + tanggalKadaluwarsa);
    }
}
