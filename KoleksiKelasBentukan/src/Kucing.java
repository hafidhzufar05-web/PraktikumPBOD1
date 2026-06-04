package Anabul;

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " berjalan dengan kaki 4");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " mengeong");
    }
}