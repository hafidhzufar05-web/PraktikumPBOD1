import java.time.LocalDate;

public class Dosen extends Pegawai {
    /***** ATRIBUT *****/
    protected String fakultas;

    /***** METHOD *****/
    //konstruktor
    public Dosen(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}