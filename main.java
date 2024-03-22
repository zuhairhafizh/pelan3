package zuhair;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan informasi mahasiswa
        System.out.println("SELAMAT DATANG");
        System.out.println("================");
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        // Membuat objek kartuMahasiswa untuk mahasiswa yang baru dimasukkan
        kartuMahasiswa mahasiswa = new kartuMahasiswa(nim, nama);

        // Meminta pengguna untuk memasukkan detail mata kuliah
        while (true) {
            System.out.print("Masukkan kode mata kuliah (atau ketik 'selesai' untuk keluar): ");
            String kodeMK = scanner.nextLine();
            if (kodeMK.equalsIgnoreCase("selesai")) {
                break;
            }
            System.out.print("Masukkan nama mata kuliah: ");
            String namaMK = scanner.nextLine();
            System.out.print("Masukkan nilai angka: ");
            double nilaiAngka = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline
            // Membuat objek matkul untuk mata kuliah yang dimasukkan
            matkul mk = new matkul(kodeMK, namaMK, nilaiAngka);
            // Menambahkan mata kuliah ke dalam kartu mahasiswa
            mahasiswa.tambahMataKuliah(mk);
        }

        System.out.println();

        // Cetak KHS mahasiswa
        System.out.println("------------------------------------------------------------------------------------");
        mahasiswa.cetakKHS();
        System.out.println("------------------------------------------------------------------------------------");

    }
}
