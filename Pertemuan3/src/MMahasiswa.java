/* Nama File : MMahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Muhammad Hafidh Zufar Dewantara/24060124140164 
 * Tanggal   : 9 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        Matakuliah PBO = new Matakuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        Matakuliah MBD = new Matakuliah("MBD", "Manajemen Basis Data", 3);
        
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        M1.printDetailMhs();
        System.out.println("\n");
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
