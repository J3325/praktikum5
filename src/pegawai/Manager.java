package pegawai;

public class Manager extends Pegawai {
    private double tunjangan;

    // Konstruktor 
    public Manager() {
    }
    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok); // Memanggil konstruktor kelas induk
        this.tunjangan = tunjangan;
    }

    // Setter dan getter tunjangan
    public double getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
