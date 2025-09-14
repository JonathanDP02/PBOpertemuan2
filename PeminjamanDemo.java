public class PeminjamanDemo {
    public static void main(String[] args) {
        Peminjaman pj1 = new Peminjaman();
        pj1.id = 101;
        pj1.namaMember = "Andi";
        pj1.namaGame = "FIFA 25";
        pj1.lamaSewa = 3;
        pj1.harga = 20000;

        pj1.tampilDataPeminjaman();

        System.out.println();

        Peminjaman pj2 = new Peminjaman();
        pj2.id = 102;
        pj2.namaMember = "Budi";
        pj2.namaGame = "GTA VI";
        pj2.lamaSewa = 5;
        pj2.harga = 25000;

        pj2.tampilDataPeminjaman();
    }
}