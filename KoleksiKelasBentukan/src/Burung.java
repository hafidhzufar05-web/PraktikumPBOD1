package Anabul;

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " terbang");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " berkicau");
    }
}