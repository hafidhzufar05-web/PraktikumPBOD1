// File: LambdaMap.java
// Deskripsi: Implementasi lambda pada Map untuk menampilkan key (NIM) dan value (Nama)

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan Key berupa String (NIM) dan Value berupa String (Nama)
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // Menambahkan data mahasiswa
        mahasiswaMap.put("A11.2023.00001", "Zufar");
        mahasiswaMap.put("A11.2023.00002", "Nayla");
        mahasiswaMap.put("A11.2023.00003", "Devano");
        mahasiswaMap.put("A11.2023.00004", "Bagas");

        // Menampilkan key (NIM) dan value (Nama) menggunakan ekspresi lambda
        System.out.println("Daftar Mahasiswa:");
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " | Nama: " + nama));
    }
}