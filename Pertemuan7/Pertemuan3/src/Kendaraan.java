/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Muhammad Hafidh Zufar Dewantara/24060124140164 
 * Tanggal   : 9 Maret 2026
 */

public class Kendaraan {
    private String noPlat;
    private String jenis; // motor / mobil

    public Kendaraan() {}

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
