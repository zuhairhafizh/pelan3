package zuhair;

import java.util.ArrayList;

public class kartuMahasiswa {

    private String nim;
    private String nama;
    private ArrayList<matkul> mataKuliah;

    public kartuMahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliah = new ArrayList<>();
    }

    // Method untuk menambahkan mata kuliah ke dalam daftar
    public void tambahMataKuliah(matkul mk) {
        mataKuliah.add(mk);
    }

    // Method untuk mencetak Kartu Hasil Studi (KHS) mahasiswa
    public void cetakKHS() {
        System.out.println("                             KARTU HASIL STUDI (KHS)                                ");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("NIM: " + nim);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Mata Kuliah:");
        // Melakukan iterasi untuk setiap mata kuliah dan mencetak detailnya
        for (matkul mk : mataKuliah) {
            System.out.printf(" | Kode MK: %-10s | Nama MK: %-20s | Nilai Huruf: %c | %n", 
            mk.getKodeMK(), mk.getNamaMK(), mk.hitungNilaiHuruf());
        }
    }
}
