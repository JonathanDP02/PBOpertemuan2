public class BarangTugasDemo {
    public static void main(String[] args) {
        BarangTugas brg1 = new BarangTugas();
        brg1.kode = "BRG01";
        brg1.namaBarang = "Keyboard Mechanical";
        brg1.hargaDasar = 500000;
        brg1.diskon = 0.2f;

        brg1.tampilData();

        System.out.println();

        BarangTugas brg2 = new BarangTugas();
        brg2.kode = "BRG02";
        brg2.namaBarang = "Mouse Gaming";
        brg2.hargaDasar = 250000;
        brg2.diskon = 0.15f;

        brg2.tampilData();
}
}