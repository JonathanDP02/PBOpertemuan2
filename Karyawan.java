class Karyawan {
    String id;
    String nama;
    String jenisKelamin;
    String jabatan;
    double gaji;

    Karyawan(String id, String nama, String jenisKelamin, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void tampilData() {
        System.out.println("=== Data Karyawan ===");
        System.out.println("ID           : " + id);
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jabatan      : " + jabatan);
        System.out.println("Gaji         : Rp " + gaji);
        System.out.println();
    }

    void lihatGaji() {
        System.out.println("Gaji " + nama + " adalah Rp " + gaji);
    }

    void ubahJabatan(String jabatanBaru) {
        this.jabatan = jabatanBaru;
        System.out.println("Jabatan " + nama + " diubah menjadi: " + jabatan);
    }
}
