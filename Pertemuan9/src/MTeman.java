/* Nama : Muhammad Hafidh Zufar Dewantara
 * NIM : 24060124140164
 * File : Teman.java
 * Tanggal : 5 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        t.addNama("Bagas");
        t.addNama("Zufar");
        t.addNama("Nayla");

        t.showTeman();

        System.out.println("Jumlah Bagas: " + t.countNama("Bagas"));

        t.gantiNama("Zufar", "Hafidh");
        t.showTeman();
    }
}