import java.util.HashMap;
import java.util.Map;

/**
 * File : LambdaMap.java
 * Deskripsi : Implementasi lambda pada map
 * Pembuat : 24060124140164 - Muhammad Hafidh Zufar Dewantara
 */

public class LambdaMap {
    public static void main(String[] args) {
        // lambda digunakan untuk membuat map
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124140164", "Zufar");
        mahasiswaMap.put("24060124140165", "Bagas");
        mahasiswaMap.put("24060124140166", "Dewantara");
        mahasiswaMap.put("24060124140167", "Aden");

        // lambda digunakan untuk menampilkan map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
    
}
