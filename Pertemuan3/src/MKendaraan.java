public class MKendaraan {
    public static void main(String[] args){
        Kendaraan K1 = new Kendaraan();
        K1.setNoPlat("AG537VH");
        K1.setJenis("Mobil");

        System.out.println("No Plat kendaraan: " + K1.getNoPlat());
        System.out.println("Jenis Kendaraan: " + K1.getJenis());
    }
}