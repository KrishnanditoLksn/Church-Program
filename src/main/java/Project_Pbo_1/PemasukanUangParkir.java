package Project_Pbo_1;

import java.util.Random;

public class PemasukanUangParkir extends PemasukanGereja {
    int random, nom, total;

    public int totalParkir() {
        Random ran = new Random();
        random = ran.nextInt(150);
        nom = 2000;
        total = random * nom;
        return total;
    }

    @Override
    public String getJenisPemasukan() {
        return "Parkir";
    }

    @Override
    public int getTotalPemasukan() {
        System.out.println("Total Kendaraan masuk di gereja " + random);
        return totalParkir();
    }
}
