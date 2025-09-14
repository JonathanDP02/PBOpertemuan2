public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;

    public int hitungHargaBayar() {
        return lamaSewa * harga;
    }

    public void tampilDataPeminjaman() {
        System.out.println("ID Peminjaman : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa + " hari");
        System.out.println("Harga per Hari: Rp " + harga);
        System.out.println("Total Bayar   : Rp " + hitungHargaBayar());
    }
}