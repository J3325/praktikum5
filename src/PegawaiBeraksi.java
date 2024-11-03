import pegawai.Manager;
import pegawai.Programmer;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        // Menggunakan overloaded konstruktor membuat objek manager dan programmer
        Manager manager = new Manager("Anton", 9000000, 2000000);
        System.out.println("Data Manager:");
        manager.cetakInfo();

        Programmer programmer1 = new Programmer("Andi Herlambang");
        System.out.println("\nData Programmer 1:");
        programmer1.cetakInfo();

        Programmer programmer2 = new Programmer("Riko", 6000000);
        System.out.println("\nData Programmer 2:");
        programmer2.cetakInfo();

        Programmer programmer3 = new Programmer("Dina", 5000000, 3000000);
        System.out.println("\nData Programmer 3:");
        programmer3.cetakInfo();
        
        

        
    }
}
