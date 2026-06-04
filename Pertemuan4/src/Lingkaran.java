public class Lingkaran extends BangunDatar{
    /***** ATRIBUT *****/
    private double jari;

    /***** METHOD *****/
    public Lingkaran(){
    }

    public Lingkaran(double jari, String warna, String border){
        super(4, warna, border);
        this.jari = jari;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari Lingkaran : " + getJari());
    }
}
