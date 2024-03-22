package zuhair;

public class matkul {
    private String kodeMK;
    private String namaMK;
    private double nilaiAngka;

    // Konstruktor untuk inisialisasi atribut
    public matkul(String kodeMK, String namaMK, double nilaiAngka) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.nilaiAngka = nilaiAngka;
    }

    // Getter untuk mendapatkan kode mata kuliah
    public String getKodeMK() {
        return kodeMK;
    }

    // Getter untuk mendapatkan nama mata kuliah
    public String getNamaMK() {
        return namaMK;
    }

    // Method untuk menghitung nilai huruf berdasarkan nilai angka
    public char hitungNilaiHuruf() {
        if (nilaiAngka >= 80) {
            return 'A';
        } else if (nilaiAngka >= 60) {
            return 'B';
        } else if (nilaiAngka >= 50) {
            return 'C';
        } else if (nilaiAngka >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
