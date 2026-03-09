/* Nama File : MMatakuliah.java
 * Deskripsi : berisi atribut dan method dalam class Matakuliah
 * Pembuat   : Muhammad Hafidh Zufar Dewantara/24060124140164 
 * Tanggal   : 9 Maret 2026
 */

public class MMatakuliah {
    public static void main(String[] args){
        Matakuliah MK1 = new Matakuliah();
        MK1.set_idMatKul("PBO");
        MK1.setNama("Pemrograman Berorientasi Objek");
        MK1.setSks(3);

        System.out.println("ID Mata Kuliah: " + MK1.getIdMatKul());
        System.out.println("Nama Mata Kuliah: " + MK1.getNama());
        System.out.println("Jumlah SKS: " + MK1.getSks());

    }
}
