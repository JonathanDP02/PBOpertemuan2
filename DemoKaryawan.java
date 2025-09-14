public class DemoKaryawan {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("K001", "Budi", "Laki-laki", "Staff", 5000000);
        Karyawan k2 = new Karyawan("K002", "Siti", "Perempuan", "Supervisor", 7500000);

        k1.tampilData();
        k2.tampilData();

        k1.lihatGaji();
        k2.lihatGaji();

        System.out.println();

        k1.ubahJabatan("Manager");
        k1.tampilData();
    }
}