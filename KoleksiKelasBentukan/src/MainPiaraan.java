public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        p.enqueueAnabul(new Kucing("Kitty"));
        p.enqueueAnabul(new Anjing("Doggy"));
        p.enqueueAnabul(new Kucing("Mimi"));

        System.out.println("Daftar Anabul:");
        p.showAnabul();

        System.out.println("Jumlah Kucing: " + p.countKucing());

        System.out.println("Jenis Anabul:");
        p.showJenisAnabul();

        p.dequeueAnabul();

        System.out.println("Setelah dequeue:");
        p.showAnabul();
    }
}