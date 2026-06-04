/* Nama File : MDosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Muhammad Hafidh Zufar Dewantara/24060124140164 
 * Tanggal   : 9 Maret 2026
 */

public class MDosen {
    public static void main(String[] args){
        Dosen D1 = new Dosen();
        D1.setNip("14567");
        D1.setNama("Zufar");
        D1.setProdi("Informatika");

        System.out.println("NIP: " + D1.getNip());
        System.out.println("Nama: " + D1.getNama());
        System.out.println(("Prodi: " + D1.getProdi()));
    }

}
