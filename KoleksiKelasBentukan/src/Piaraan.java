import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    public Anabul getAnabul() {
        return Lanabul.peek(); // ambil tanpa hapus
    }

    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll(); // ambil + hapus
        if (a != null) {
            nbelm--;
        }
        return a;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public int bobotKucing() {
        // asumsi: tiap kucing bobot = 1
        return countKucing();
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getNama() + " - " + a.getClass().getName());
        }
    }
}