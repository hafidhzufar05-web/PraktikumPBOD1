package Anabul;

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(getNama() + " berlari");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " menggonggong");
    }
}