import java.time.LocalDate;

public class DosenTamu extends Dosen{
    /***** ATRIBUT *****/
    protected String nidk;
    protected LocalDate tglSelesaiKontrak;

    /***** METHOD *****/
    //konstruktor
    public DosenTamu(String nip, String nidk, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tglSelesaiKontrak){
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tglSelesaiKontrak = tglSelesaiKontrak;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk); 
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + tglLahir);
        System.out.println("TMT             : " + tmt);
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Akhir Kontrak   : " + tglSelesaiKontrak);

        //tunjangan
        double tunjangan = 0.025 * gajiPokok;
        System.out.println(("Tunjangan       : Rp." + tunjangan));

    }
}