package pegawai;

public class Programmer extends Pegawai {
    private double bonus;

    // Konstruktor
    public Programmer() {
    }
    // Overloading konstruktor  Programmer
    public Programmer(String nama) {
        super(nama, 0); // Mengatur gajiPokok default 0
    }

    public Programmer(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok); // Memanggil konstruktor kelas induk
        this.bonus = bonus;
    }

    // Setter dan getter bonus
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus: " + bonus);
    }
}
